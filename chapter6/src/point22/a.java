package point22;

import java.util.Scanner;
public class a {

	public static double fahrenheit;
	public static double celsius;
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please insert the value of fahrenheit that you want to be converted in celsius: ");
		
		fahrenheit = input.nextDouble();
		
		System.out.printf ("The result in fahrenheit is: %f", celsius(fahrenheit));
	}
	
	public static double celsius (double fahrenheit) {
		return celsius = 5 / 9 * ( fahrenheit - 32 );
	}
	
	
}
