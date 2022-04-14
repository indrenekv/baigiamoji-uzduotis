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
}
