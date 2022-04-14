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
}
