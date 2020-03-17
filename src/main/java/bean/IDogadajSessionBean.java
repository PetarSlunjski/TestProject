package bean;

import dto.DogadajDto;

import javax.ejb.Local;

@Local
public interface IDogadajSessionBean {

    public void createDogadaj(DogadajDto dto);

    public void editDogadaj(DogadajDto dto);
}
