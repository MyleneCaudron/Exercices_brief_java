import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez votre age :");

		int age=scanner.nextInt();

        if(age>17){ System.out.println("vous êtes majeur");}

        else { System.out.println("vous êtes mineur");}
	}
}
