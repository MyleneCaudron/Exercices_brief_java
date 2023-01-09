//Afficher les codes des caractères des nombres 1 à 255 

public class CodeChar {

	public static void main(String[] args) {
		
		String str;
		
		for (int i=1; i<256;i++) {
        
        str = Character.toString((char) i);
        System.out.print(str);
		}

	}

}
