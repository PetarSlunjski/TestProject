package bean;

import dao.DogadajDao;
import dto.DogadajDto;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DogadajSessionBean implements IDogadajSessionBean {

    @Inject
    private DogadajDao dogadajDao;

    @Override
    public void createDogadaj(DogadajDto dto) {
        dogadajDao.create(dto);
    }

    @Override
    public void editDogadaj(DogadajDto dto) {
        dogadajDao.edit(dto);
    }
}
