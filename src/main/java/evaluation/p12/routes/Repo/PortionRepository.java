package evaluation.p12.routes.Repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import evaluation.p12.routes.models.Portion;
public interface PortionRepository extends JpaRepository<Portion,Integer> {
	@Query(value="select*from Portion where Id_route= :IdRoute" ,nativeQuery=true)
	public List<Portion> findByIdRoute(@Param("IdRoute")int id);
}
