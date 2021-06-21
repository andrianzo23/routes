package evaluation.p12.routes.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import evaluation.p12.routes.models.Portion;
import evaluation.p12.routes.models.RouteVille;
public interface RouteVilleRepository extends JpaRepository<RouteVille,Integer> {
	@Query(value="select*from Route_ville where Id_route= :IdRoute and Id_ville=:idVille" ,nativeQuery=true)
	public List<RouteVille> findByIdRouteAndVille(@Param("IdRoute")int id,@Param("idVille")int idVille);
	
	@Query(value="select*from Route_ville where Id_route=:IdRoute limit 3" ,nativeQuery=true)
	public List<RouteVille> findByIdRoute(@Param("IdRoute")int id);

	@Query(value="select*from Route_ville where Id_route=:IdRoute" ,nativeQuery=true)
	public List<RouteVille> findByIdRouteNL(@Param("IdRoute")int id);
}
