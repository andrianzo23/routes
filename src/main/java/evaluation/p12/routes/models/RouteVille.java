package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RouteVille {
	@Id
	private int IdRouteVille;
	private int IdRoute;
	private int IdVille;
	private int Pk;
	
	public RouteVille(int idRouteVille, int idRoute, int idVille, int pk) {
		super();
		IdRouteVille = idRouteVille;
		IdRoute = idRoute;
		IdVille = idVille;
		Pk = pk;
	}
	public RouteVille() {
		super();
	}
	
	public int getIdRouteVille() {
		return IdRouteVille;
	}
	public void setIdRouteVille(int idRouteVille) {
		IdRouteVille = idRouteVille;
	}
	public int getPk() {
		return Pk;
	}
	public void setPk(int pk) {
		Pk = pk;
	}
	public int getIdRoute() {
		return IdRoute;
	}
	public void setIdRoute(int idRoute) {
		IdRoute = idRoute;
	}
	public int getIdVille() {
		return IdVille;
	}
	public void setIdVille(int idVille) {
		IdVille = idVille;
	}
	
	
}
