package lt.viltiesziedas.IndresNprojektas.duomenubaze.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MaitinimoIstaiga
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    private long kodas;
    private String adresas;

    @OneToMany
    private Set<Meniu> meniu;

    public MaitinimoIstaiga()
    {
    }

    public MaitinimoIstaiga(long id, String pavadinimas, long kodas, String adresas, Set<Meniu> meniu)
    {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.adresas = adresas;
        this.meniu = meniu;
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

    public long getKodas()
    {
        return kodas;
    }

    public void setKodas(long kodas)
    {
        this.kodas = kodas;
    }

    public String getAdresas()
    {
        return adresas;
    }

    public void setAdresas(String adresas)
    {
        this.adresas = adresas;
    }

    public Set<Meniu> getMeniu()
    {
        return meniu;
    }

    public void setMeniu(Set<Meniu> meniu)
    {
        this.meniu = meniu;
    }

    @Override
    public String toString()
    {
        return "MaitinimoIstaiga{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", kodas=" + kodas +
                ", adresas='" + adresas + '\'' +
                ", meniu=" + meniu +
                '}';
    }
}
