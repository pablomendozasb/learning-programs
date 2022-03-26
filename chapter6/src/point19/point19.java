package point19;

import java.util.Scanner;
public class point19 {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Insert the character and the number of that character repeated:");
		
		char character = input.next().charAt(0);
		
		int number = input.nextInt();
		
		fillCharacter (character, number);
		
	}
	
	public static void fillCharacter (char character, int number) {
		
		for (int b = 1; b <= number; b++) {
			for (int a = 1; a <= number; a++) {
				System.out.print (character);
			}
			System.out.println();
		}
		
	}
	
}
