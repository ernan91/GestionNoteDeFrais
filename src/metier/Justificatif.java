package metier;

import java.time.LocalDate;
import java.util.Date;

public class Justificatif {
	
	private long id;
	private LocalDate dateRemise;
	
	public Justificatif(long id, LocalDate dateRemise) {
		
		this.id = id;
		this.dateRemise = dateRemise;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDateRemise() {
		return dateRemise;
	}

	public void setDateRemise(LocalDate dateRemise) {
		this.dateRemise = dateRemise;
	}

	@Override
	public String toString() {
		return "Justificatif [id=" + id + ", dateRemise=" + dateRemise + "]";
	}
	
	
	
}
