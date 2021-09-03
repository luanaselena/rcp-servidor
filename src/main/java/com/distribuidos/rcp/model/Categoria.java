package com.distribuidos.rcp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@Getter @Setter private long id ;
	@Getter @Setter private boolean baja ;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
	@Getter @Setter private Set<Medicamento> medicamentos = new HashSet<>();

}
