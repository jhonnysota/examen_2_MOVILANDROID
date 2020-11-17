package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Grado;
import com.redsocial.entity.tipoLibro;
import com.redsocial.repository.GradoRepository;
import com.redsocial.repository.TipoLibroRepository;

@Service
public class TipoLibroServiceImpl implements TipoLibroService{

	@Autowired
	private TipoLibroRepository repository;
	
	@Override
	public List<tipoLibro> listatipolibro() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	

}
