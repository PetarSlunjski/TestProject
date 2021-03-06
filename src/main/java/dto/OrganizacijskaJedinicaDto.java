package dto;

import java.io.Serializable;

public class OrganizacijskaJedinicaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer sifra;
    private String naziv;
    private String opis;
    private TipOgranizacijskeJediniceDto tipOgranizacijskeJediniceDto;
    private OrganizacijskaJedinicaDto organizacijskaJedinicaDto;

    public OrganizacijskaJedinicaDto() {
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public TipOgranizacijskeJediniceDto getTipOgranizacijskeJediniceDto() {
        return tipOgranizacijskeJediniceDto;
    }

    public void setTipOgranizacijskeJediniceDto(TipOgranizacijskeJediniceDto tipOgranizacijskeJediniceDto) {
        this.tipOgranizacijskeJediniceDto = tipOgranizacijskeJediniceDto;
    }

    public OrganizacijskaJedinicaDto getOrganizacijskaJedinicaDto() {
        return organizacijskaJedinicaDto;
    }

    public void setOrganizacijskaJedinicaDto(OrganizacijskaJedinicaDto organizacijskaJedinicaDto) {
        this.organizacijskaJedinicaDto = organizacijskaJedinicaDto;
    }
}
