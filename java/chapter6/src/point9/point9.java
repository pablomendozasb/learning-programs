package point9;

import java.util.Scanner;

public class point9 {

	public static void main (String[] args) {
		System.out.println ("Please insert the number that you want to rounded:");
		Scanner input = new Scanner (System.in);
		double x = input.nextDouble ();
		System.out.printf("The number original number is: %f and the rounded number is: %f" ,x, roundNumber (x));
	}
	
	public static double roundNumber (double x) {
		double y = Math.floor(x + 0.5);
		return y;
	}
	
}
