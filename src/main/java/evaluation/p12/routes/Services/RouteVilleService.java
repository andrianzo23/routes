package evaluation.p12.routes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.p12.routes.Repo.RouteVilleRepository;
@Service
public class RouteVilleService {
	@Autowired
	RouteVilleRepository routeVilleR;

	public RouteVilleService(RouteVilleRepository routeVilleR) {
		super();
		this.routeVilleR = routeVilleR;
	}

	public RouteVilleService() {
		super();
	}

	public RouteVilleRepository getRouteVilleR() {
		return routeVilleR;
	}

	public void setRouteVilleR(RouteVilleRepository routeVilleR) {
		this.routeVilleR = routeVilleR;
	}
	
	
}
