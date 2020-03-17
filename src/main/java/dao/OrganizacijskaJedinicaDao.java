package dao;

import dto.OrganizacijskaJedinicaDto;

import java.io.Serializable;

public class OrganizacijskaJedinicaDao extends GenericDao<Object, OrganizacijskaJedinicaDto> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    protected Object formEntity(OrganizacijskaJedinicaDto dto) {
        return null;
    }

    @Override
    protected OrganizacijskaJedinicaDto formDto(Object o) {

        return null;
    }

    @Override
    protected String getBasicSql() {
        return "SELECT e from OrganizacijskaJedinica e";
    }
}
