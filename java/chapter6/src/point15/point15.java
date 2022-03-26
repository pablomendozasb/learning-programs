package point15;

import java.util.Scanner;

public class point15 {
	
	public static double hypotenuse;

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Insert the value of the side1 and the side2 to find the value of the hipotenuse: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble ();
		
		System.out.printf ("The hypotenuse is: %.2f",hypotenuse(side1,side2));
		
	}
	
	
	public static double hypotenuse (double side1, double side2) {
		hypotenuse = Math.sqrt( Math.pow(side1,2) + Math.pow(side2, 2) );
		return hypotenuse;
	}
	
}
