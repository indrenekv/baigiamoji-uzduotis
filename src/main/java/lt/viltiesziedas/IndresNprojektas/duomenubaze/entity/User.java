package lt.viltiesziedas.IndresNprojektas.duomenubaze.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Uzsakymas> uzsakymai;

    public User()
    {
    }

    public User(long id, String username, String password, Set<Uzsakymas> uzsakymai)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.uzsakymai = uzsakymai;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Set<Uzsakymas> getUzsakymai()
    {
        return uzsakymai;
    }

    public void setUzsakymai(Set<Uzsakymas> uzsakymai)
    {
        this.uzsakymai = uzsakymai;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uzsakymai=" + uzsakymai +
                '}';
    }
}
