package chapter6point8;

import java.util.Scanner;

public class point8 {

	public static final double minimumFee = 2.0;

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.print ("Please insert the quantity of hours that you are going to use of our service ");
		System.out.println ("of garage:");
	
		double totalHours = input.nextDouble();
	
		 if (totalHours <= 24) {
			 System.out.printf ("The price of your service is %f", priceParking (totalHours) );
		 }
		 
		 else {
			 
			 System.out.println ("Please insert less than 24 hours.");
			 
		 }
		
	}
	
	public static double priceParking (double totalHours) {
		if (totalHours <= 3) {
			double price = 2.00;
			return price;
		}
		else {	
			double price = 2.00 + totalHours*0.5;
			
			if (price <= 10) {
				return price;
			}
			
			else {	
				return 10.0;
			}
		}
	}
	
}
