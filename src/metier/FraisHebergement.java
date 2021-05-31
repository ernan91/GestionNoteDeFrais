package metier;

import java.time.LocalDate;
import java.util.Date;

public class FraisHebergement extends NoteDeFrais {
	
	private LocalDate date;
	private String ville;
	private int nbNuit;
	private float distance ;
	
	
	
	
	public FraisHebergement(int id, LocalDate date, Boolean etat,LocalDate dateNuit, String ville, int nbNuit , float distance) {
		super(id, dateNuit, etat);
		// TODO Auto-generated constructor stub
		this.date = dateNuit;
		this.ville = ville;
		this.nbNuit = nbNuit;
		this.distance = distance ;
	}


	


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getNbNuit() {
		return nbNuit;
	}


	public void setNbNuit(int nbNuit) {
		this.nbNuit = nbNuit;
	}


	@Override
	public String toString() {
		return "FraisHebergement [date=" + date + ", ville=" + ville + ", nbNuit=" + nbNuit + "]";
	}
	
	
	
	
	
	
	

	
}
	
	


