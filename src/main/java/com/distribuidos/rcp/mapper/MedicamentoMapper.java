package com.distribuidos.rcp.mapper;

import com.distribuidos.rcp.model.CategoriaModel;
import com.distribuidos.rcp.model.MedicamentoModel;

public class MedicamentoMapper {

    public MedicamentoDTO toDTO (MedicamentoModel mm){
        MedicamentoDTO dto = MedicamentoDTO.newBuilder();
                .setId(mm.getId());
                .setNombre(mm.getNombre())
                .setCodigo(mm.getCodigo())
                .setDroga(mm.getDroga())
                .setIdCategoria(mm.getCategoria().getId())
                .build();
                return dto;
    }

    public MedicamentoModel toModel (MedicamentoDTO dto){
        MedicamentoModel mm = new MedicamentoModel();
        CategoriaModel cm = new CategoriaModel();
        mm.setId(dto.getId());
        mm.setNombre(dto.getNombre());
        mm.setCodigo(mm.getCodigo());
        mm.setDroga(dto.getDroga());
        cm.setId(dto.getIdCategoria());
        mm.setCategoria(cm);
        return mm;
    }
}
