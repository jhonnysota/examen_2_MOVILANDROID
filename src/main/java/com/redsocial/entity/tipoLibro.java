package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipoLibro")
public class tipoLibro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoLibro;
	private String nombre;
	private String estado;
	
}



