package entity;

import javax.persistence.*;

@Entity
@Table(name = "tip_organizacijske_jedinice", schema = "planerdogadaja")
public class TipOrganizacijskeJedinice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sifra", nullable = false)
    private Integer sifra;
    @Column(name = "naziv", nullable = false)
    private String naziv;
    @Column(name = "aktivan", nullable = false)
    private Boolean aktivan;

    public TipOrganizacijskeJedinice() {
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

