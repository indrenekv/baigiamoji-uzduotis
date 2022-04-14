package lt.viltiesziedas.IndresNprojektas.duomenubaze.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Patiekalas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    private String nurodymai;

    @ManyToOne
    @JoinColumn(name = "meniu_id")
    private Meniu meniuKuriameYraReceptas;

    @ManyToMany
    @JoinTable(
            name = "sujungimas_patiekalas_uzsakymai",
            joinColumns = @JoinColumn(name = "patiekalas_id"),
            inverseJoinColumns = @JoinColumn(name = "uzsakymai_id"))
    private Set<Uzsakymas> kuriuoseUzsakymuoseYra;

    public Patiekalas()
    {
    }

    public Patiekalas(long id, String pavadinimas, String nurodymai, Meniu meniuKuriameYraReceptas, Set<Uzsakymas> kuriuoseUzsakymuoseYra)
    {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.nurodymai = nurodymai;
        this.meniuKuriameYraReceptas = meniuKuriameYraReceptas;
        this.kuriuoseUzsakymuoseYra = kuriuoseUzsakymuoseYra;
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

    public String getNurodymai()
    {
        return nurodymai;
    }

    public void setNurodymai(String nurodymai)
    {
        this.nurodymai = nurodymai;
    }

    public Meniu getMeniuKuriameYraReceptas()
    {
        return meniuKuriameYraReceptas;
    }

    public void setMeniuKuriameYraReceptas(Meniu meniuKuriameYraReceptas)
    {
        this.meniuKuriameYraReceptas = meniuKuriameYraReceptas;
    }

    public Set<Uzsakymas> getKuriuoseUzsakymuoseYra()
    {
        return kuriuoseUzsakymuoseYra;
    }

    public void setKuriuoseUzsakymuoseYra(Set<Uzsakymas> kuriuoseUzsakymuoseYra)
    {
        this.kuriuoseUzsakymuoseYra = kuriuoseUzsakymuoseYra;
    }

    @Override
    public String toString()
    {
        return "Patiekalas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", nurodymai='" + nurodymai + '\'' +
                ", meniuKuriameYraReceptas=" + meniuKuriameYraReceptas +
                ", kuriuoseUzsakymuoseYra=" + kuriuoseUzsakymuoseYra +
                '}';
    }
}