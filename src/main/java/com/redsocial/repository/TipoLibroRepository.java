package com.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entity.Grado;
import com.redsocial.entity.tipoLibro;

public interface TipoLibroRepository extends JpaRepository<tipoLibro, Integer> {

	
}
