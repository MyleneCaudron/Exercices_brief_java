import java.util.Scanner;

//A partir d’un mois saisi en chiffre, afficher le nombre de jour d’un mois

public class NcJours {

	public static void main(String[] args) {
		
		int mois = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le mois :");
		
		mois = scanner.nextInt();
		
		if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12) {
			System.out.println("31 jours");
		}
		if (mois==4 || mois==6 || mois==9 || mois==11) {
			System.out.println("30 jours");
		}
		if (mois==2) {
			System.out.println("29 jours");
		}
	}

}
