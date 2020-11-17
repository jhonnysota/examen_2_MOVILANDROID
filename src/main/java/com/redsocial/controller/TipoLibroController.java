package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Grado;
import com.redsocial.entity.Libro;
import com.redsocial.entity.tipoLibro;
import com.redsocial.service.GradoService;
import com.redsocial.service.TipoLibroService;

@RestController
@RequestMapping("/api/rest/tipolibro/")
public class TipoLibroController {

	@Autowired
	private TipoLibroService service;

	@GetMapping
	public ResponseEntity<List<tipoLibro>> lista() {
		return ResponseEntity.ok(service.listatipolibro());
	}

}
