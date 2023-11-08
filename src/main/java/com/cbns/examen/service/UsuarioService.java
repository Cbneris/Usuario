package com.cbns.examen.service;

import java.util.Optional;

import com.cbns.examen.entity.UsuarioDAO;

public interface UsuarioService {
	public Iterable<UsuarioDAO> findAll		();
	public Optional<UsuarioDAO> FindById	(Long id);
	public UsuarioDAO 			save 		(UsuarioDAO usuarioDAO);
	public void 				deleteById	(Long id);
}
