package application;

import java.time.LocalDate;

import metier.FraisDejeunerAffaire;
import metier.FraisTaxi;
import metier.User;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FraisDejeunerAffaire resto = new FraisDejeunerAffaire(1, LocalDate.of(2020, 05, 20), false, "paul", "Elf", 50);
		FraisDejeunerAffaire resto1 = new FraisDejeunerAffaire(2, LocalDate.of(2020, 05, 25), false, "robin", "Solvignon", 25);
		FraisDejeunerAffaire resto2 = new FraisDejeunerAffaire(2, LocalDate.of(2020, 05, 21), false, "robin", "Solvignon", 25);
		FraisDejeunerAffaire resto3 = new FraisDejeunerAffaire(2, LocalDate.of(2020, 05, 12), false, "robin", "Solvignon", 25);
		
		FraisDejeunerAffaire resto4 = new FraisDejeunerAffaire(2, LocalDate.of(2020, 05, 15), false, "robin", "Solvignon", 25);
		
		
		FraisDejeunerAffaire resto5 = new FraisDejeunerAffaire(2, LocalDate.of(2020, 05, 9), false, "robin", "Solvignon", 25);
		FraisTaxi taxi = new FraisTaxi(1,LocalDate.of(2020, 05, 20), false, "Paris","Mareseille", "Compte 1", "AXA", 20.5f);
		User salarie = new User(1,"Perrin", LocalDate.of(2020, 05, 20), "67 rue de l'église","0607446689", LocalDate.of(2020, 05, 20), "Cadre", 1200.0f, 1902986478);
		
		System.out.println(salarie);
	salarie.ajoutNoteFrais(resto);
	
		
		System.out.println(salarie);
		
		
		for(FraisDejeunerAffaire unDejeuner: salarie.getListeFraisDejeuner()) {
			
System.out.println(unDejeuner);
			
		}

	}
	
	public static int puissance(int n , int m )
	{
		
		
		return 0 ;
	}
	
	
	
	
	}


