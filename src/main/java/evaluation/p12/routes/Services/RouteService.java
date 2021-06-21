package evaluation.p12.routes.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.p12.routes.RouteException;
import evaluation.p12.routes.Repo.PointRouteRepository;
import evaluation.p12.routes.Repo.PortionRepository;
import evaluation.p12.routes.Repo.RouteFinRepository;
import evaluation.p12.routes.Repo.RouteRepository;
import evaluation.p12.routes.Repo.RouteVilleRepository;
import evaluation.p12.routes.Repo.ValeurEntretienRepository;
import evaluation.p12.routes.Repo.VilleRepository;
import evaluation.p12.routes.models.PointRoute;
import evaluation.p12.routes.models.Portion;
import evaluation.p12.routes.models.Route;
import evaluation.p12.routes.models.RouteVille;
import evaluation.p12.routes.models.ValeurEntretien;
import evaluation.p12.routes.models.Ville;

@Service
public class RouteService {
	@Autowired
	private RouteRepository routeR;
	@Autowired
	private VilleRepository villeR;
	@Autowired
	private PortionRepository portionR;
	@Autowired
	private RouteFinRepository routeFR;
	@Autowired
	private RouteVilleRepository routeVilleR;
	@Autowired
	private PointRouteRepository pointRouteR;
	@Autowired
	private ValeurEntretienRepository valeurEntretienR;

	public RouteRepository getRouteR() {
		return routeR;
	}

	public void setRouteR(RouteRepository routeR) {
		this.routeR = routeR;
	}
	
	
	public ValeurEntretienRepository getValeurEntretienR() {
		return valeurEntretienR;
	}

	public void setValeurEntretienR(ValeurEntretienRepository valeurEntretienR) {
		this.valeurEntretienR = valeurEntretienR;
	}

	public RouteFinRepository getRouteFR() {
		return routeFR;
	}

	public void setRouteFR(RouteFinRepository routeFR) {
		this.routeFR = routeFR;
	}

	public PointRouteRepository getPointRouteR() {
		return pointRouteR;
	}

	public void setPointRouteR(PointRouteRepository pointRouteR) {
		this.pointRouteR = pointRouteR;
	}

	public PortionRepository getPortionR() {
		return portionR;
	}

	public void setPortionR(PortionRepository portionR) {
		this.portionR = portionR;
	}
	
	
	
	public RouteVilleRepository getRouteVilleR() {
		return routeVilleR;
	}

	public void setRouteVilleR(RouteVilleRepository routeVilleR) {
		this.routeVilleR = routeVilleR;
	}

	public VilleRepository getVilleR() {
		return villeR;
	}

	public void setVilleR(VilleRepository villeR) {
		this.villeR = villeR;
	}

	public int getEtatMoyenne(List<Portion> list) throws RouteException {
		int val =0;
		for(int i = 0; i <list.size();i++) {
			val = val + list.get(i).getEtat();
		}
		System.out.println("ato ka");
		try {

			
			return val/list.size();
		}
		catch(Exception e) {
			return 0;
		}
		
	}
	
	public String getCommentaireEtat(int etat) {
		if(etat < 1) {
			return " non dispo ";
		}
		else {
			return valeurEntretienR.findByEtat(etat).get(0).getCommentaire();			
		}

	}
	
	public double getCoutEntretienSingle(int etat,int distance) {
		ValeurEntretien ve = this.getValeurEntretienR().findByEtat(etat).get(0);
		System.out.println("distance = "+distance);
		System.out.println("ve.getCout() = "+ve.getCout());
		double val = (double)distance*ve.getCout();
		return val;
	}
	
	public double getCoutEntretien(List<Portion> list) {
		double val = 0;
		for(int i = 0; i <list.size();i++) {
			val = val + this.getCoutEntretienSingle(list.get(i).getEtat(), list.get(i).getFin() - list.get(i).getDebut());
		}
		return val;
	}
	
	
	public int getDistanceByIdRoute(int idRoute) {
		PointRoute pr = this.getPointRouteR().findByIdRoute(idRoute).get(0);
		RouteVille rvf = this.getRouteVilleR().findByIdRouteAndVille(idRoute,pr.getId_Fin()).get(0);
		return rvf.getPk();
	}
	public int getTempsEntretien(int etat,int distance){
		ValeurEntretien ve = this.getValeurEntretienR().findByEtat(etat).get(0);
		return ve.getTemps()*distance;
	}
}
