package com.distribuidos.rcp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "categoria")
public class CategoriaModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	private long id ;
	
	private String nombre ;
	
	@Column(columnDefinition = "boolean default false")
	private boolean baja ;

	public CategoriaModel() {}
	
	public CategoriaModel(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	@JsonIgnore
	private Set<MedicamentoModel> medicamentos = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Set<MedicamentoModel> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Set<MedicamentoModel> medicamentos) {
		this.medicamentos = medicamentos;
	}
}
