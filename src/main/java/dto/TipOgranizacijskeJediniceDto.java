package dto;


import java.io.Serializable;

public class TipOgranizacijskeJediniceDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer sifra;
    private String naziv;
    private Boolean aktivan;

    public TipOgranizacijskeJediniceDto() {
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

    public Boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(Boolean aktivan) {
        this.aktivan = aktivan;
    }
}
