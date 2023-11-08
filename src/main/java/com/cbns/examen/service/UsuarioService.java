package com.cbns.examen.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cbns.examen.entity.UsuarioDAO;

public interface UsuarioService {
	
	public Iterable<UsuarioDAO> findAll		();
	
	public Page<UsuarioDAO> 	findAll		(Pageable pagina);
	
	public Optional<UsuarioDAO> FindById	(Long id);
	
	public UsuarioDAO 			save 		(UsuarioDAO usuarioDAO);
	
	public void 				deleteById	(Long id);
	
}
