package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import evaluation.p12.routes.RouteException;

@Entity
public class Portion {
	@Id
	private int IdPortion;
	private int IdRoute;
	private int Debut;
	private int Fin;
	private int Etat;
	public Portion(int idPortion, int idRoute, int debut, int fin, int etat) {
		super();
		IdPortion = idPortion;
		IdRoute = idRoute;
		Debut = debut;
		Fin = fin;
		Etat = etat;
	}
	public Portion() {
		super();
	}
	public int getIdPortion() {
		return IdPortion;
	}
	public void setIdPortion(int idPortion) {
		IdPortion = idPortion;
	}
	public int getIdRoute() {
		return IdRoute;
	}
	public void setIdRoute(int idRoute) {
		IdRoute = idRoute;
	}
	public int getDebut() {
		return Debut;
	}
	public void setDebut(int debut) {
		Debut = debut;
	}
	public int getFin() {
		return Fin;
	}
	public void setFin(int fin) {
		Fin = fin;
	}
	public int getEtat() {
		return Etat;
	}
	public void setEtat(int etat) throws Exception {
		if(etat>=4 || etat<=0) {
			throw new RouteException("valeur etat invalide");
		}
		Etat = etat;
	}
	
	
}
