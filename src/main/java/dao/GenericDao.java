package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDao<E, T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * vraca entity iz DTO
     */

    public abstract E formEntity(T dto);

    /**
     * vraca DTO iz entity
     */

    public abstract T formDto(E dto);

    /**
     * vraca listu entitia (entites transfor to dto)
     */
    public abstract String getBasicSql();

    public List<T> formListDto(List<E> listEntity) {
        List<T> listDto = new ArrayList<>();
        for (E e : listEntity) {
            listDto.add(formDto(e));
        }
        return listDto;
    }

    public List<T> findAll() {
        List<E> lstEntity = getEntityManager().createQuery(getBasicSql()).getResultList();
        return formListDto(lstEntity);
    }
}


