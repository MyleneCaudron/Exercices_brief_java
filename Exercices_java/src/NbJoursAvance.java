//Reprendre l’exercice précédent et modifier pour prendre en entrée une chaîne de caractères 


import java.util.Scanner;

public class NbJoursAvance {

	public static void main(String[] args) {
		
		String m;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez le mois :");
		
		m = scan.nextLine();
		
		if (m.equals("janvier") || m.equals("mars") || m.equals("mai") || 
				m.equals("juillet") || m.equals("août") || 
				m.equals("octobre") || m.equals("décembre")) {
			System.out.println("31 jours");
		}
		if (m.equals("avril") || m.equals("juin") || m.equals("septembre") || 
				m.equals("novembre")) {
			System.out.println("30 jours");
		}
		if (m.equals("février")) {
			System.out.println("29 jours");
		}

	}

}
