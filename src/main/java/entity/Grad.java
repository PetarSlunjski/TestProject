package entity;

import dto.OrganizacijskaJedinicaDto;
import dto.VelicinaGradaDto;

import javax.persistence.*;

@Entity
@Table(name = "grad", schema = "planerdogadaja")
public class Grad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sifra", nullable = false)
    private Integer sifra;
    @Column(name = "naziv", nullable = false)
    private String naziv;
    @JoinColumn(name = "velicina_grada", nullable = false)
    @ManyToOne
    private VelicinaGradaDto velicinaGradaDto;
    @JoinColumn(name = "org_jed", nullable = false)
    @ManyToOne
    private OrganizacijskaJedinicaDto organizacijskaJedinicaDto;

    public Grad() {
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
