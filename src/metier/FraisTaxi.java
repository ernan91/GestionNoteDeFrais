package metier;

import java.time.LocalDate;

public class FraisTaxi extends FraisVehiculeDeTransport{
	private float montant ;

	public FraisTaxi(int id, LocalDate date, Boolean etat, String lieuDepart, String lieuArrive, String nomCompte,
			String nomSociter , float montant) {
		super(id, date, etat, lieuDepart, lieuArrive, nomCompte, nomSociter);
		// TODO Auto-generated constructor stub
		this.montant = montant ;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "FraisTaxi [montant=" + montant + ", toString()=" + super.toString() + "]";
	}

	
	

}
