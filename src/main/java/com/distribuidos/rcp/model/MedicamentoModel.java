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
public class MedicamentoModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	private long id;

	private String nombre;

    @Column(unique = true)
	private String codigo;

	private String droga;

	private boolean baja;

	@ManyToOne
    @JoinColumn(name = "FK_CATEGORIA", nullable = false, updatable = false)
	private CategoriaModel categoria;

	public MedicamentoModel() {};
	
//	public MedicamentoModel(String nombre, String codigo, String droga) {
//		this.nombre = nombre;
//		this.codigo = codigo;
//		this.droga = droga;
//		this.baja = false;
//	}
	
	public MedicamentoModel(String nombre, String codigo, String droga, CategoriaModel categoria) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.droga = droga;
		this.categoria = categoria;
		this.baja = false;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
