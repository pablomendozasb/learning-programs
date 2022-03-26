package point25;

import java.util.Scanner;
public class a {

	public static long number;
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please insert and the program will say you if the number is prime or not prime.");
		
		int primeCounter = 0;
		
		for ( long number = 1; number <= 10000; number++  ) {
			if ( prime (number) == true ) { 
			System.out.println(number);
			primeCounter++;
			}
		}
		
		System.out.println("The number of prime number is:" + primeCounter);
		
	}
	
	public static boolean prime (long number) {
		
		long det;
		int noPrime = 0;
		boolean prime;
		
		for (int a = 1; a <= number; a++) {
			
			 if (a > 1 && a < number) {
				 det = number%a;
				 if (det == 0)
					 noPrime++;
			 } 		

		}
		
		if (number != 1 && noPrime == 0 ) 
			return prime = true;
		
		else
			return prime = false;
	
	}
	
}
