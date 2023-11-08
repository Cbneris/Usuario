package com.cbns.examen.controller;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbns.examen.entity.UsuarioDAO;
import com.cbns.examen.service.UsuarioService;

@RestController
@RequestMapping("users")
/**
 * 
 * @author Christian Brandon Neri Sanchez
 * Controlador para acceder a los métodos REST de Usuarios
 *
 */
public class UsuarioController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7224389353555593239L;
	
	@Autowired
	protected UsuarioService userSerivice;
	
	@GetMapping
	public ResponseEntity<Iterable<UsuarioDAO>> listarUsuarios() {
		return ResponseEntity.ok().body(userSerivice.findAll());
	}
	
	@GetMapping("/listaPag")
	public ResponseEntity<Iterable<UsuarioDAO>> listarUsuarios(Pageable pageable) {
		return ResponseEntity.ok().body(userSerivice.findAll(pageable));
	}
	
	@GetMapping("/buscarId/{id}")
	public ResponseEntity<UsuarioDAO> usuarioById(@PathVariable Long id){
		Optional<UsuarioDAO> o = userSerivice.FindById(id);
		if(!o.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(o.get()); 
	}
	
	@PostMapping 
	public ResponseEntity<UsuarioDAO> guardarUsuario(@RequestBody UsuarioDAO usuario){
		UsuarioDAO entityCreate = userSerivice.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(entityCreate);		
	}
	
	@DeleteMapping("/eliminaId/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		userSerivice.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
