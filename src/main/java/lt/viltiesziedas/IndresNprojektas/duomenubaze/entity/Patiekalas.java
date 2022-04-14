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
}