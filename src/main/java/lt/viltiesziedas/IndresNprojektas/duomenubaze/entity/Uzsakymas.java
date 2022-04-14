package lt.viltiesziedas.IndresNprojektas.duomenubaze.entity;

import javax.persistence.*;

@Entity
public class Uzsakymas
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean patvirtinta;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
