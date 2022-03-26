package point18;

import java.util.Scanner;
public class point18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please insert the number of asterisks that you want in your square of asterisks:");
		
		int asterisks = input.nextInt();
		
		squareOfAsterisks (asterisks);
		
		
	}
	
	public static void squareOfAsterisks (int asterisks) {
		
		for (int a = 1; a <= asterisks; a++) {
			for ( int b = 1; b <= asterisks; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
