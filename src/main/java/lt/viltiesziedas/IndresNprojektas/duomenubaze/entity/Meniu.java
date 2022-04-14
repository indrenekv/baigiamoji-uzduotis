package lt.viltiesziedas.IndresNprojektas.duomenubaze.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Meniu
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;

    @OneToMany
    private Set<Patiekalas> patiekalai;

    @ManyToOne
    @JoinColumn(name = "matinimo_istaiga_id")
    private MaitinimoIstaiga maitinimoIstaiga;

    public Meniu()
    {
    }

    public Meniu(long id, String pavadinimas, Set<Patiekalas> patiekalai, MaitinimoIstaiga maitinimoIstaiga)
    {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.patiekalai = patiekalai;
        this.maitinimoIstaiga = maitinimoIstaiga;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getPavadinimas()
    {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas)
    {
        this.pavadinimas = pavadinimas;
    }

    public Set<Patiekalas> getPatiekalai()
    {
        return patiekalai;
    }

    public void setPatiekalai(Set<Patiekalas> patiekalai)
    {
        this.patiekalai = patiekalai;
    }

    public MaitinimoIstaiga getMaitinimoIstaiga()
    {
        return maitinimoIstaiga;
    }

    public void setMaitinimoIstaiga(MaitinimoIstaiga maitinimoIstaiga)
    {
        this.maitinimoIstaiga = maitinimoIstaiga;
    }

    @Override
    public String toString()
    {
        return "Meniu{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", patiekalai=" + patiekalai +
                ", maitinimoIstaiga=" + maitinimoIstaiga +
                '}';
    }
}
