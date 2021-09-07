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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
public class CategoriaModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	@Getter @Setter private long id ;
	@Getter @Setter private String nombre ;
	@Column(columnDefinition = "boolean default false")
	@Getter @Setter private boolean baja ;

	public CategoriaModel(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	@Getter @Setter private Set<MedicamentoModel> medicamentos = new HashSet<>();

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
