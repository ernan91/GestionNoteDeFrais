package metier;

import java.time.LocalDate;

public class FraisVehiculePersonnel extends FraisVehiculeDeTransport {
	
	private float puissanceFiscale;
	private float kilometresParcouru;
	
	



	public FraisVehiculePersonnel(int id, LocalDate date, Boolean etat, String lieuDepart, String lieuArrive,
			String nomCompte, String nomSociter, float puissanceFiscale , float kilometresParcouru) {
		super(id, date, etat, lieuDepart, lieuArrive, nomCompte, nomSociter);
		// TODO Auto-generated constructor stub
		this.puissanceFiscale = puissanceFiscale ;
		this.kilometresParcouru= kilometresParcouru ;
	}


	


	public float getPuissanceFiscale() {
		return puissanceFiscale;
	}


	public void setPuissanceFiscale(float puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}


	public float getKilometresParcouru() {
		return kilometresParcouru;
	}


	public void setKilometresParcouru(float kilometresParcouru) {
		this.kilometresParcouru = kilometresParcouru;
	}


	@Override
	public String toString() {
		return "FraisVehiculePersonnel [puissanceFiscale=" + puissanceFiscale + ", kilometresParcouru="
				+ kilometresParcouru + "]";
	}
	
	
	
	
	

}
