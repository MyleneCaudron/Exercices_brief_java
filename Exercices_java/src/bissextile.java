//Vérifier si une année est bissextile.
// Pour rappel, une année bissextile est une année multiple de 4, mais pas multiple de 100 ou alors multiple de
// 400.

import java.util.Scanner;

public class bissextile {

	public static void main(String[] args) {
		
		int year = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez une année :");
		
		year = scanner.nextInt();
		
		if (year%4 == 0 && year%100 !=0 || year%400 ==0) {
			
			System.out.println("année bissextile");
			
		}
		
		else {System.out.println("année non bissextile");

	}

}
}
