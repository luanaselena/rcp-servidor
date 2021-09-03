package com.distribuidos.rcp.model;

import java.util.HashSet;
import java.util.Set;

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
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter private long id ;
	@Getter @Setter private String nombre ;
	@Getter @Setter private boolean baja ;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	@Getter @Setter private Set<Medicamento> medicamentos = new HashSet<>();

}
