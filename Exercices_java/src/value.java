//A partir d’une valeur saisie, indiquer si le nombre saisi est pair ou impair

import java.util.Scanner;

public class value {

	public static void main(String[] args) {
		
		int val = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("saisissez une valeur :");
		
		val = scanner.nextInt();
		
		if (val%2==0) {
			
			System.out.println("nombre pair");
		}

		if (val%2==1) {
			
			System.out.println("nombre impair");
		}
	}

}
