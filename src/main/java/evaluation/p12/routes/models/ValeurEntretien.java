package evaluation.p12.routes.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ValeurEntretien {
	@Id
	private int IdValeurEntretien;
	private int Distance;
	private double Cout;
	private int Temps;
	private int Etat;
	private String Commentaire;
	private int Coefficient;
	public ValeurEntretien(int idValeurEntretien, int distance, double cout, int temps, int etat) {
		super();
		IdValeurEntretien = idValeurEntretien;
		Distance = distance;
		Cout = cout;
		Temps = temps;
		Etat = etat;
	}
	public ValeurEntretien() {
		super();
	}
	
	
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	public int getCoefficient() {
		return Coefficient;
	}
	public void setCoefficient(int coefficient) {
		Coefficient = coefficient;
	}
	public int getIdValeurEntretien() {
		return IdValeurEntretien;
	}
	public void setIdValeurEntretien(int idValeurEntretien) {
		IdValeurEntretien = idValeurEntretien;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public double getCout() {
		return Cout;
	}
	public void setCout(double cout) {
		Cout = cout;
	}
	public int getTemps() {
		return Temps;
	}
	public void setTemps(int temps) {
		Temps = temps;
	}
	public int getEtat() {
		return Etat;
	}
	public void setEtat(int etat) {
		Etat = etat;
	}
	
	
}
