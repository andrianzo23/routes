package evaluation.p12.routes.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import evaluation.p12.routes.models.PointRoute;
import evaluation.p12.routes.models.Portion;
public interface PointRouteRepository extends JpaRepository<PointRoute,Integer>{
	@Query(value="select*from pointroute where Id_route= :IdRoute" ,nativeQuery=true)
	public List<PointRoute> findByIdRoute(@Param("IdRoute")int id);
}
