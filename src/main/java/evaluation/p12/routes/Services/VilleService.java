package evaluation.p12.routes.Services;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import evaluation.p12.routes.models.Ville;
import evaluation.p12.routes.models.RouteVille;

import evaluation.p12.routes.Repo.VilleRepository;

@Service
public class VilleService {
	@Autowired
	private VilleRepository villeR;

	public VilleRepository getVilleR() {
		return villeR;
	}

	public void setVilleR(VilleRepository villeR) {
		this.villeR = villeR;
	}
	public List<Ville> getVillesOfRV(List<RouteVille> rvs){
		Vector<Ville> v = new Vector<Ville>(1,1);
		for(int i = 0;i<rvs.size();i++) {
			v.add(this.getVilleR().findById(rvs.get(i).getIdVille()).get());
		}
		return v.subList(0,v.size());
	}
	
}
