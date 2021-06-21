package evaluation.p12.routes.models;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import evaluation.p12.routes.Services.RouteVilleService;
import evaluation.p12.routes.Services.VilleService;

public class PRVilles {
	@Autowired
	private RouteVilleService routeVilleS;
	@Autowired
	private VilleService villeS;
	
	private List<Ville> villes;
	private PointRoute pRoute;
	public PRVilles(List<Ville> villes, PointRoute pRoute) {
		super();
		this.villes = villes;
		this.pRoute = pRoute;
	}
	public PRVilles() {
		super();
	}
	public List<Ville> getVilles() {
		return villes;
	}
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	public PointRoute getpRoute() {
		return pRoute;
	}
	public void setpRoute(PointRoute pRoute) {

		this.pRoute = pRoute;
		
	}
	
	
}
