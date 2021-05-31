package metier;

import java.time.LocalDate;

public class FraisVehiculeDeTransport extends NoteDeFrais {
	
	private String lieuDepart;
	private String lieuArrive;
	private String nomCompte;
	private String nomSociter;
	
	
	
	public FraisVehiculeDeTransport(int id, LocalDate date, Boolean etat,String lieuDepart, String lieuArrive, String nomCompte, String nomSociter) {
		super(id, date, etat);
		// TODO Auto-generated constructor stub
		this.lieuDepart = lieuDepart;
		this.lieuArrive = lieuArrive;
		this.nomCompte = nomCompte;
		this.nomSociter = nomSociter;
	}

	public String getLieuDepart() {
		return lieuDepart;
	}
	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}
	public String getLieuArrive() {
		return lieuArrive;
	}
	public void setLieuArrive(String lieuArrive) {
		this.lieuArrive = lieuArrive;
	}
	public String getNomCompte() {
		return nomCompte;
	}
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	public String getNomSociter() {
		return nomSociter;
	}
	public void setNomSociter(String nomSociter) {
		this.nomSociter = nomSociter;
	}
	
	@Override
	public String toString() {
		return "FraisVehiculeDeTransport [lieuDepart=" + lieuDepart + ", lieuArrive=" + lieuArrive + ", nomCompte="
				+ nomCompte + ", nomSociter=" + nomSociter + "]";
	}
	
	
	
	
	

}
