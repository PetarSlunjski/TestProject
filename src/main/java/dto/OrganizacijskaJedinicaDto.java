package dto;

import java.io.Serializable;

public class OrganizacijskaJedinicaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer sifra;
    private String naziv;
    private String opis;

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
}
