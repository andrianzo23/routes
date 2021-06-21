package evaluation.p12.routes.models;

public class Rf {
	private RouteFin RF;
	private int Valide;
	public Rf(RouteFin rF, int valide) {
		super();
		RF = rF;
		Valide = valide;
	}
	public Rf() {
		super();
	}
	public RouteFin getRF() {
		return RF;
	}
	public void setRF(RouteFin rF) {
		RF = rF;
	}
	public int getValide() {
		return Valide;
	}
	public void setValide(int valide) {
		Valide = valide;
	}

	
}
