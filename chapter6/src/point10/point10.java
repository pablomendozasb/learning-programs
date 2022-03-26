package point10;

import java.util.Scanner;

public class point10 {

	
	

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Please insert the number that you want to be rounded:");
		double x = input.nextDouble ();
		System.out.printf ("The original value is %f and the integer aproximation is: %f\n",x, roundToInteger(x));
		System.out.printf ("The original value is %f and the tenth aproximation is: %f\n",x, roundToTenths(x));
		System.out.printf ("The original value is %f and the integer aproximation is: %f\n",x, roundToHundreds(x));
		System.out.printf ("The original value is %f and the integer aproximation is: %f\n",x, roundToThousands(x));
		
		
	}
	
	public static double roundToInteger (double x) {
		double y = Math.floor(x + 0.5);
		return y;
	}
	
	public static double roundToTenths (double x) {
		double y = Math.floor(x*10 + 0.5)/10;
		return y;
	}
	
	public static double roundToHundreds (double x) {
		double y = Math.floor( x*100 + 0.5 ) / 100;
		return y;
	}
	
	public static double roundToThousands (double x) {
		double y = Math.floor(x*1000 + 0.5)/1000;
		return y;	
	}
	
}
