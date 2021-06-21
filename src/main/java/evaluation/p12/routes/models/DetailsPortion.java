package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailsPortion {
	@Id
	private int IdDetailsPortion;
	private int IdRoute;
	private int PkDebut;
	private int PkFin;
	private int Etat;
	public DetailsPortion(int idDetailsPortion, int idRoute, int pkDebut, int pkFin, int etat) {
		super();
		IdDetailsPortion = idDetailsPortion;
		IdRoute = idRoute;
		PkDebut = pkDebut;
		PkFin = pkFin;
		Etat = etat;
	}
	public DetailsPortion() {
		super();
	}
	public int getIdDetailsPortion() {
		return IdDetailsPortion;
	}
	public void setIdDetailsPortion(int idDetailsPortion) {
		IdDetailsPortion = idDetailsPortion;
	}
	public int getIdRoute() {
		return IdRoute;
	}
	public void setIdRoute(int idRoute) {
		IdRoute = idRoute;
	}
	public int getPkDebut() {
		return PkDebut;
	}
	public void setPkDebut(int pkDebut) {
		PkDebut = pkDebut;
	}
	public int getPkFin() {
		return PkFin;
	}
	public void setPkFin(int pkFin) {
		PkFin = pkFin;
	}
	public int getEtat() {
		return Etat;
	}
	public void setEtat(int etat) {
		Etat = etat;
	}
	
	
}
