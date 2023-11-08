package com.cbns.examen.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cbns.examen.entity.UsuarioDAO;

public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioDAO, Long>{
	
}
