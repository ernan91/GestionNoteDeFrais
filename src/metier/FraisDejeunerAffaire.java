package metier;

import java.time.LocalDate;

public class FraisDejeunerAffaire  extends NoteDeFrais{
	
	private String nomClient ;
	private String nomSociete ;
	private float montant ;
	
	

	



	public FraisDejeunerAffaire(int id, LocalDate date, Boolean etat, String nomClient, String nomSociete,
			float montant) {
		super(id, date, etat);
		this.nomClient = nomClient;
		this.nomSociete = nomSociete;
		this.montant = montant;
	}







	public String getNomClient() {
		return nomClient;
	}







	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}







	public String getNomSociete() {
		return nomSociete;
	}







	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}







	public float getMontant() {
		return montant;
	}







	public void setMontant(float montant) {
		this.montant = montant;
	}







	@Override
	public String toString() {
		return "FraisDejeunerAffaire [nomClient=" + nomClient + ", nomSociete=" + nomSociete + ", montant=" + montant
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	
	
	
}
