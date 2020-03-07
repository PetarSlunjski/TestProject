package dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class DogadajDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer sifra;
    private String naziv;
    private Timestamp vrijemeOd;
    private Timestamp vrijemeDo;
    private String slobodanUlaz;

    public DogadajDto() {
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

    public Timestamp getVrijemeOd() {
        return vrijemeOd;
    }

    public void setVrijemeOd(Timestamp vrijemeOd) {
        this.vrijemeOd = vrijemeOd;
    }

    public Timestamp getVrijemeDo() {
        return vrijemeDo;
    }

    public void setVrijemeDo(Timestamp vrijemeDo) {
        this.vrijemeDo = vrijemeDo;
    }

    public String getSlobodanUlaz() {
        return slobodanUlaz;
    }

    public void setSlobodanUlaz(String slobodanUlaz) {
        this.slobodanUlaz = slobodanUlaz;
    }
}
