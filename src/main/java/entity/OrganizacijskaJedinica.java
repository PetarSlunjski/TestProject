package entity;

import dto.OrganizacijskaJedinicaDto;
import dto.TipOgranizacijskeJediniceDto;

import javax.persistence.*;

@Entity
@Table(name = "organizacijska_jedinica", schema = "planerdogadaja")
public class OrganizacijskaJedinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sifra", nullable = false)
    private Integer sifra;
    @Column(name = "naziv", nullable = false)
    private String naziv;
    @Column(name = "opis")
    private String opis;
    @JoinColumn(name = "tip_org_jed", nullable = false)
    @ManyToOne
    private TipOgranizacijskeJediniceDto tipOgranizacijskeJediniceDto;
    @JoinColumn(name = "org_jed", nullable = false)
    @ManyToOne
    private OrganizacijskaJedinicaDto organizacijskaJedinicaDto;

    public OrganizacijskaJedinica() {
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
