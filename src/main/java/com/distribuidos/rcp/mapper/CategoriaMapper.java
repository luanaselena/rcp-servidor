package com.distribuidos.rcp.mapper;

import com.distribuidos.rcp.model.CategoriaModel;

public class CategoriaMapper {

    public CategoriaDTO toDTO (CategoriaModel cm){
        CategoriaDTO dto = CategoriaDTO.newBuilder()
                .setIdCategoria(cm.getId())
                .setNombre(cm.getNombre())
                .setBaja(cm.isBaja())
                .build();
        return dto;
    }

    public CategoriaModel toModel(CategoriaDTO dto){
        CategoriaModel c = new CategoriaModel();
            c.setId(dto.getId());
            c.setNombre(dto.getNombre());
            c.setBaja(dto.isBaja());
        return c;
    }
}
