package com.distribuidos.rcp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medicamento")
@Getter
@Setter
public class MedicamentoModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	private Integer id;

	private String nombre;

	private String codigo;

	private String droga;

	private boolean baja;

	@ManyToOne
    @JoinColumn(name = "FK_CATEGORIA", nullable = false, updatable = false)
	private CategoriaModel categoria;

	public MedicamentoModel(String nombre, String codigo, String droga) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.droga = droga;
		this.baja = false;
	}
}
