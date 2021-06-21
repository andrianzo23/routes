package evaluation.p12.routes.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import evaluation.p12.routes.models.Portion;
import evaluation.p12.routes.models.ValeurEntretien;
public interface ValeurEntretienRepository extends JpaRepository<ValeurEntretien,Integer> {
	@Query(value="select*from Valeur_entretien where Etat= :etat" ,nativeQuery=true)
	public List<ValeurEntretien> findByEtat(@Param("etat")int etat);
}
