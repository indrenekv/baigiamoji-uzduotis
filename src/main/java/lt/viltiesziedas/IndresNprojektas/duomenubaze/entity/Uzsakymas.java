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

    public Uzsakymas()
    {
    }

    public Uzsakymas(long id, boolean patvirtinta, User user)
    {
        this.id = id;
        this.patvirtinta = patvirtinta;
        this.user = user;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public boolean isPatvirtinta()
    {
        return patvirtinta;
    }

    public void setPatvirtinta(boolean patvirtinta)
    {
        this.patvirtinta = patvirtinta;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "Uzsakymas{" +
                "id=" + id +
                ", patvirtinta=" + patvirtinta +
                ", user=" + user +
                '}';
    }
}
