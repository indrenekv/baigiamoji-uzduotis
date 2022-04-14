package lt.viltiesziedas.IndresNprojektas.duomenubaze.repository;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.Meniu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeniuRepository extends JpaRepository<Meniu, Long>
{
}
