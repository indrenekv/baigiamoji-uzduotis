package lt.viltiesziedas.IndresNprojektas.duomenubaze.repository;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.MaitinimoIstaiga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaitinimoIstaigaRepository extends JpaRepository<MaitinimoIstaiga, Long>
{
}
