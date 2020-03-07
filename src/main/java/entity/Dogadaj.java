package entity;

import dto.GradDto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dogadaj", schema = "planerdogadaja")
public class Dogadaj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sifra", nullable = false)
    private Integer sifra;
    @Column(name = "naziv", nullable = false) // TODO: 07. 03. 2020. ispraviti u bazi
    private String naziv;
    @Column(name = "vrijeme_od", nullable = false) // TODO: 07. 03. 2020. ispraviti u bazi
    private Timestamp vrijemeOd;
    @Column(name = "vrijeme_do") // TODO: 07. 03. 2020. ispraviti u bazi
    private Timestamp vrijemeDo;
    @Column(name = "slobodan_ulaz", nullable = false, length = 2) // TODO: 07. 03. 2020.  ispraviti u bazi
    private String slobodanUlaz;
    @JoinColumn(name = "grad", nullable = false)
    @ManyToMany
    private GradDto gradDto;

    public Dogadaj() {
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

    public GradDto getGradDto() {
        return gradDto;
    }

    public void setGradDto(GradDto gradDto) {
        this.gradDto = gradDto;
    }
}
