package evaluation.p12.routes.models;

import java.util.List;
import java.util.Vector;



public class UpdateRV {
	private String NomVille;
	private int Id;
	private List<Rv> RVs;



	public UpdateRV() {
		super();
		Vector<Rv> v = new Vector<Rv>(1,1);
		v.add(new Rv());
		RVs = v.subList(0,1);
	}

	public void addRV(Rv rv) {
		RVs.add(rv);
	}




	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public UpdateRV(String nomVille, int id, List<Rv> rVs) {
		super();
		NomVille = nomVille;
		Id = id;
		RVs = rVs;
	}

	public String getNomVille() {
		return NomVille;
	}



	public void setNomVille(String nomVille) {
		NomVille = nomVille;
	}



	public List<Rv> getRVs() {
		return RVs;
	}



	public void setRVs(List<Rv> rVs) {
		RVs = rVs;
	}
	
	
}
