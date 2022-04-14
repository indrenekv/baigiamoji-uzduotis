package lt.viltiesziedas.IndresNprojektas.duomenubaze.repository;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
}
