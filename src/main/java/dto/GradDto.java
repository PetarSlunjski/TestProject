package dto;

import java.io.Serializable;

public class GradDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer sifra;
    private String naziv;
    private VelicinaGradaDto velicinaGradaDto;
    private OrganizacijskaJedinicaDto organizacijskaJedinicaDto;

    public GradDto() {
        super();
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public VelicinaGradaDto getVelicinaGradaDto() {
        return velicinaGradaDto;
    }

    public void setVelicinaGradaDto(VelicinaGradaDto velicinaGradaDto) {
        this.velicinaGradaDto = velicinaGradaDto;
    }

    public OrganizacijskaJedinicaDto getOrganizacijskaJedinicaDto() {
        return organizacijskaJedinicaDto;
    }

    public void setOrganizacijskaJedinicaDto(OrganizacijskaJedinicaDto organizacijskaJedinicaDto) {
        this.organizacijskaJedinicaDto = organizacijskaJedinicaDto;
    }
}
