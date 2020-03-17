package dao;

import dto.*;
import entity.Dogadaj;
import org.apache.commons.lang3.StringUtils;
import util.DogadajAppConstants;

import java.io.Serializable;

public class DogadajDao extends GenericDao<Object, DogadajDto> implements Serializable {

    @Override
    protected Dogadaj formEntity(DogadajDto dto) {
        Dogadaj entity = null;
        if (dto != null) {
            entity = new Dogadaj();
            entity.setNaziv(dto.getNaziv());
            entity.setVrijemeOd(dto.getVrijemeOd());
            entity.setVrijemeDo(dto.getVrijemeDo());
            entity.setSlobodanUlaz(dto.getSlobodanUlaz());
            if (dto.getGradDto() != null) {
                GradDto gDto = new GradDto();
                gDto.setSifra(dto.getGradDto().getSifra());
                entity.setGradDto(gDto);
            }
            if (StringUtils.isNoneBlank(dto.getSlobodanUlaz())) {
                if (dto.getSlobodanUlaz().equals(DogadajAppConstants.DTO_SLOBODAN_ULAZ_FALSE) || dto.getSlobodanUlaz().equals(DogadajAppConstants.ENTITY_SLOBODAN_ULAZ_NE)) {
                    entity.setSlobodanUlaz(DogadajAppConstants.ENTITY_SLOBODAN_ULAZ_NE);
                } else if (dto.getSlobodanUlaz().equals(DogadajAppConstants.DTO_SLOBODAN_ULAZ_TRUE) || dto.getSlobodanUlaz().equals(DogadajAppConstants.ENTITY_SLOBODAN_ULAZ_DA)) {
                    entity.setSlobodanUlaz(DogadajAppConstants.ENTITY_SLOBODAN_ULAZ_DA);
                }
            }
        }
        return entity;
    }

    @Override
    protected DogadajDto formDto(Object o) {
        DogadajDto dto = null;
        if (o != null) {
            dto = new DogadajDto();
            if (o instanceof DogadajDto) {
                dto.setSifra(((DogadajDto) o).getSifra());
                dto.setNaziv(((DogadajDto) o).getNaziv());
                dto.setVrijemeOd(((DogadajDto) o).getVrijemeOd());
                dto.setVrijemeDo(((DogadajDto) o).getVrijemeDo());
                // grad događaja
                if (((DogadajDto) o).getGradDto() != null) {
                    GradDto gradDto = new GradDto();
                    gradDto.setSifra(((DogadajDto) o).getGradDto().getSifra());
                    gradDto.setNaziv(((DogadajDto) o).getGradDto().getNaziv());
                    //organizacijska jedinica
                    if (((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto() != null) {
                        OrganizacijskaJedinicaDto organizacijskaJedinicaDto = new OrganizacijskaJedinicaDto();
                        organizacijskaJedinicaDto.setSifra(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getSifra());
                        organizacijskaJedinicaDto.setNaziv(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getNaziv());
                        organizacijskaJedinicaDto.setOpis(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getOpis());
                        //tip ogranizacijske jedinice
                        TipOgranizacijskeJediniceDto tipOgranizacijskeJediniceDto = new TipOgranizacijskeJediniceDto();
                        tipOgranizacijskeJediniceDto.setSifra(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getTipOgranizacijskeJediniceDto().getSifra());
                        tipOgranizacijskeJediniceDto.setAktivan(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getTipOgranizacijskeJediniceDto().getAktivan());
                        tipOgranizacijskeJediniceDto.setNaziv(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getTipOgranizacijskeJediniceDto().getNaziv());
                        organizacijskaJedinicaDto.setTipOgranizacijskeJediniceDto(tipOgranizacijskeJediniceDto);
                        // organizacijska jedinica parent
                        if (((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getOrganizacijskaJedinicaDto() != null) {
                            OrganizacijskaJedinicaDto organizacijskaJedinicaDtoParent = new OrganizacijskaJedinicaDto();
                            organizacijskaJedinicaDtoParent.setSifra(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getTipOgranizacijskeJediniceDto().getSifra());
                            organizacijskaJedinicaDtoParent.setNaziv(((DogadajDto) o).getGradDto().getOrganizacijskaJedinicaDto().getTipOgranizacijskeJediniceDto().getNaziv());
                            organizacijskaJedinicaDto.setOrganizacijskaJedinicaDto(organizacijskaJedinicaDtoParent);
                        }
                        gradDto.setOrganizacijskaJedinicaDto(organizacijskaJedinicaDto);
                        //velicina grada
                        VelicinaGradaDto velicinaGradaDto = new VelicinaGradaDto();
                        velicinaGradaDto.setSifra(((DogadajDto) o).getGradDto().getVelicinaGradaDto().getSifra());
                        velicinaGradaDto.setAktivan(((DogadajDto) o).getGradDto().getVelicinaGradaDto().getAktivan());
                        velicinaGradaDto.setNaziv(((DogadajDto) o).getGradDto().getVelicinaGradaDto().getNaziv());
                        gradDto.setVelicinaGradaDto(velicinaGradaDto);
                        dto.setGradDto(gradDto);
                    }
                }
            }
        }
        return dto;
    }

    @Override
    protected String getBasicSql() {
        return "SELECT e FROM DogadajDto e";
    }

    // stvaranje novog događaja
    public DogadajDto create(DogadajDto dto) {
        // TODO: 17. 03. 2020. validacija
        Dogadaj entity = (Dogadaj) formEntity(dto);
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return formDto(entity);
    }

    // uređivanje postojeceg događaj eniteta
    public void edit(DogadajDto dto) {
        // TODO: 17. 03. 2020. validacija
        Dogadaj entity = formEntity(dto);
        getEntityManager().merge(entity);
        getEntityManager().flush();
    }
}
