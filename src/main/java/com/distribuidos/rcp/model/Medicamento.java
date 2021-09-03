package com.distribuidos.rcp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Table(name = "medicamento")
@Getter
@Setter
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nombre;

	private String codigo;

	private String droga;

	@ManyToOne
    @JoinColumn(name = "FK_CATEGORIA", nullable = false, updatable = false)
	private Categoria categoria;

}
