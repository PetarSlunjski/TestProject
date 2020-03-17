package dao;

import dto.VelicinaGradaDto;

import java.io.Serializable;

public class VelicinaGradaDao extends GenericDao<Object, VelicinaGradaDto> implements Serializable {
    @Override
    protected Object formEntity(VelicinaGradaDto dto) {
        return null;
    }

    @Override
    protected VelicinaGradaDto formDto(Object o) {
        VelicinaGradaDto dto;

        return null;
    }

    @Override
    protected String getBasicSql() {
        return "SELECT e from VelicinaGrada e";
    }
}
