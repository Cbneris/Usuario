package com.cbns.examen.repository;

import org.springframework.data.repository.CrudRepository;

import com.cbns.examen.entity.UsuarioDAO;

public interface UsuarioRepository extends CrudRepository<UsuarioDAO, Long>{
	
}
