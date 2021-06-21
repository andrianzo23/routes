package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
	@Id
	private int IdRoute;
	private String Numero;
	public Route(int idRoute, String numero) {
		super();
		IdRoute = idRoute;
		Numero = numero;
	}
	public Route() {
		super();
	}
	public int getIdRoute() {
		return IdRoute;
	}
	public void setIdRoute(int idRoute) {
		IdRoute = idRoute;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	
	
}
