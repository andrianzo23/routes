package evaluation.p12.routes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RouteFin {
	@Id
	private int IdRouteFin;
	@Column(name="Id_route")
	private int IdRoute;
	private int IdVille;
	public RouteFin(int idRouteFin, int idRoute, int idVille) {
		super();
		IdRouteFin = idRouteFin;
		IdRoute = idRoute;
		IdVille = idVille;
	}
	public RouteFin() {
		super();
	}
	public int getIdRouteFin() {
		return IdRouteFin;
	}
	public void setIdRouteFin(int idRouteFin) {
		IdRouteFin = idRouteFin;
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
