package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ville {
	@Id
	private int IdVille;
	private String Nom;
	public Ville(int idVille, String nom) {
		super();
		IdVille = idVille;
		Nom = nom;
	}
	public Ville() {
		super();
	}
	public int getIdVille() {
		return IdVille;
	}
	public void setIdVille(int idVille) {
		IdVille = idVille;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	
}
