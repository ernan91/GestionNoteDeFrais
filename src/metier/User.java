package metier;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int id;
	private static int num = 1;
	private String nom;
	private String prenom;
	private String mail;
	private LocalDate dateNaissance;
	private String adresse;
	private String numeroTel;
	private LocalDate dateEmbauche;
	private String poste;
	private String mdp;
	private float salaire;
	private Role role;
	private int numeroSecu;
	private List<NoteDeFrais>    liste  ;



	public User(int id, String nom,String prenom, String mdp, LocalDate dateNaissance, String adresse, String numeroTel,
			LocalDate dateEmbauche, String poste,float salaire, int numeroSecu) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.dateEmbauche = dateEmbauche;
		this.poste = poste;
		this.salaire = salaire;
		this.mdp = mdp;
		this.numeroSecu = numeroSecu;
		this.liste = new ArrayList<>();
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

// public type nomfonction( .....)
public List<FraisDejeunerAffaire>  getListeFraisDejeuner()
{    
	// declation la variable de retour
	
	List<FraisDejeunerAffaire> listeD =  new ArrayList<>();
	
	// parcourir le tableau  , verifier si l'elment est de type FraisDejeuner , oui :  ajouter à la listed 
	// pour verifier le type de l'objet ou de l'intance on utilise le mot cle intanceOf
	
	for ( NoteDeFrais    element :  this.liste    )
		
	{
		
		if( element instanceof  FraisDejeunerAffaire)
		{
			
			listeD.add((FraisDejeunerAffaire) element);
		}
		
		
	}
	
	
	
	return listeD;
	

}

public void ajoutNoteFrais (NoteDeFrais note)
{
	
if (note instanceof FraisDejeunerAffaire)
{   // condition qui verifie  5 repas par mois 
	
	
     this.liste.add(note);

}else if (note instanceof FraisHebergement) {
	
	//  distanace  : si est < 50km
	
	  this.liste.add(note);
	
	
	
}else if (note instanceof FraisVehiculePersonnel) {
	
	 this.liste.add(note);
}else if (note instanceof FraisTaxi) {
	 this.liste.add(note);
}

}




	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		User.num = num;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public int getNumeroSecu() {
		return numeroSecu;
	}
	
	

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setNumeroSecu(int numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	public List<NoteDeFrais> getListe() {
		return liste;
	}

	public void setListe(List<NoteDeFrais> liste) {
		this.liste = liste;
	}

	@Override
	public String toString() {
		return "Salarie [id=" + id + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", adresse=" + adresse
				+ ", numeroTel=" + numeroTel + ", dateEmbauche=" + dateEmbauche + ", poste=" + poste + ", salaire="
				+ salaire + ", numeroSecu=" + numeroSecu + "]";
	}
	
	
	
	
	
	
	

}
