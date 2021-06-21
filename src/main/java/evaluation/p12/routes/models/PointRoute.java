package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pointroute")
public class PointRoute {
	@Id
	private int Id_debut;
	private int Id_Route;
	private int Id_Fin;
	private String Numero;
	private String Debut;
	private String Fin;
	public PointRoute(int id_debut, int id_Route, int id_Fin, String debut, String fin) {
		super();
		Id_debut = id_debut;
		Id_Route = id_Route;
		Id_Fin = id_Fin;
		Debut = debut;
		Fin = fin;
	}
	public PointRoute() {
		super();
	}
	
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public int getId_debut() {
		return Id_debut;
	}
	public void setId_debut(int id_debut) {
		Id_debut = id_debut;
	}
	public int getId_Route() {
		return Id_Route;
	}
	public void setId_Route(int id_Route) {
		Id_Route = id_Route;
	}
	public int getId_Fin() {
		return Id_Fin;
	}
	public void setId_Fin(int id_Fin) {
		Id_Fin = id_Fin;
	}
	public String getDebut() {
		return Debut;
	}
	public void setDebut(String debut) {
		Debut = debut;
	}
	public String getFin() {
		return Fin;
	}
	public void setFin(String fin) {
		Fin = fin;
	}
	
}
