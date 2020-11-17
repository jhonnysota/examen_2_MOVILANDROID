package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Director;
import com.redsocial.entity.Libro;
import com.redsocial.repository.DirectorRepository;
import com.redsocial.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository repository;
	

	@Override
	public Libro inserta(Libro obj) {
		return repository.save(obj);
	}


	@Override
	public List<Libro> listaLibro() {
		return repository.findAll();
	}

}
