package lt.viltiesziedas.IndresNprojektas.duomenubaze.repository;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.Patiekalas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatiekalasRepository extends JpaRepository<Patiekalas, Long>
{
}
