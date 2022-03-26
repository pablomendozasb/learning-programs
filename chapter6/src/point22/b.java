package point22;

import java.util.Scanner;

public class b {
	
	public static double fahrenheit;
	public static double celsius;

	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please insert the value of celsius that you want to be converted in fahrenheit: ");
		
		celsius = input.nextDouble();
		
		System.out.printf ("The result in fahrenheit is: %f", fahrenheit(celsius));
	}
	
	public static double fahrenheit (double celsius) {
		return fahrenheit =  ((double) 9/5)*celsius + 32;
	}
	
}
