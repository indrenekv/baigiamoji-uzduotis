package lt.viltiesziedas.IndresNprojektas.duomenubaze.repository;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.Uzsakymas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzsakymasRepository extends JpaRepository<Uzsakymas, Long>
{
}
