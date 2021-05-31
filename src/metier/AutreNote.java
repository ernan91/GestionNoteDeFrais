package metier;

import java.time.LocalDate;

public class AutreNote extends NoteDeFrais {
	

	private float montant;
	private String type;
	
	
	
	public AutreNote(int id, LocalDate date, Boolean etat, float montant, String type) {
		super(id, date, etat);
		// TODO Auto-generated constructor stub
	
		this.montant = montant;
		this.type = type;
	}

	

	

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AutreNote  montant = " + montant + ", type=" + type + "]";
	}
	
	
	
	

}
