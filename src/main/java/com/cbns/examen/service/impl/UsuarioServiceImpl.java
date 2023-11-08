package com.cbns.examen.service.impl;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbns.examen.entity.UsuarioDAO;
import com.cbns.examen.repository.UsuarioRepository;
import com.cbns.examen.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3488100887338833363L;
	
	@Autowired
	protected UsuarioRepository userRepository;

	@Override
	public Iterable<UsuarioDAO> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<UsuarioDAO> FindById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public UsuarioDAO save(UsuarioDAO usuarioDAO) {
		return userRepository.save(usuarioDAO);
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
}
