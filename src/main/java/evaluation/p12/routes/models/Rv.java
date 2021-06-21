package evaluation.p12.routes.models;

public class Rv {
	private RouteVille RV;
	private int Valide;
	public Rv(RouteVille rV, int valide) {
		super();
		RV = rV;
		Valide = valide;
	}
	public Rv() {
		super();
		RV = new RouteVille();
	}
	public RouteVille getRV() {
		return RV;
	}
	public void setRV(RouteVille rV) {
		RV = rV;
	}
	public int getValide() {
		return Valide;
	}
	public void setValide(int valide) {
		Valide = valide;
	}
	
	


}
