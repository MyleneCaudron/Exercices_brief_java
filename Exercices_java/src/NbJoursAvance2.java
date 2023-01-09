//Reprendre l’exercice précédent et vérifier l’année bissextile dans une fonction

import java.util.Scanner;

public class NbJoursAvance2 {

	public static void main(String[] args) {
		String m;
		int year = 0;
		
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
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("entrez une année :");
			
			year = scanner.nextInt();			
			if (year%4 == 0 && year%100 !=0 || year%400 ==0) {
			System.out.println("28 jours");
		}
			else {System.out.println("29 jours");}
	}		

}
}
