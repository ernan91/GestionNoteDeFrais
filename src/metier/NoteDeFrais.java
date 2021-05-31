package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  abstract class NoteDeFrais {
	
	private int id;
	private LocalDate date;
	private boolean etat;
	private List<Justificatif> listeJ ;
	
	public NoteDeFrais ( int id, LocalDate date, Boolean etat) {
		this.id=id;
		this.date=date;
		this.etat=etat;
		this.listeJ =new ArrayList<Justificatif>();
	}

	public void setId (int val) {
		this.id=val;
	}
	public void setDate(LocalDate val) {
		this.date=val;
	}
	public void setEtat(boolean val) {
		this.etat=val;
	}
	
	public int getId() {
		return id;
	}
	public LocalDate getDate() {
		return date;
	}
	public boolean etat() {
		return etat;
	}

	@Override
	public String toString() {
		return "NoteDeFrais [id=" + id + ", date=" + date + ", etat=" + etat + "]";
	}

	


}
