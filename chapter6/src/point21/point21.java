package point21;


import java.util.Scanner;
public class point21 {
	
	
	public static int unit;
	public static int ten;
	public static int hundred;
	public static int thousand;

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Point a and b: ");
		
		System.out.println ("Please insert the number that is going to be divided and the number that is going to divide: ");
		
		int a = input.nextInt ();
		int b = input.nextInt ();
		
		System.out.printf ("The quotient is: %d and the remainder is: %d: %n%n", quotient(a,b), remainder(a,b));
		
		System.out.println("Point c:");
		
		displayDigits(a);
		
	}
	
	public static int quotient (int a, int b) {
		
		int quotient = a/b;
		return quotient;
		
	}
	
	public static int remainder (int a, int b) {
		
		int remainder = a%b;
		return remainder;
		
	}
	
	
	public static void displayDigits (int a) {
		
		if (a / 1000 != 0) {
			
			thousand = a / 1000;
			hundred = (a % 1000)/100;
			ten = ((a % 1000)%100)/10;
			unit = (((a%1000)%100))%10;
		
			System.out.printf ("The number separated is:%d  %d  %d  %d. %n",thousand, hundred, ten, unit);
		}
		
		
		if (a/1000 == 0 && a/100 != 0) {
			
			hundred = (a/100);
			ten = (a%100)/10;
			unit = (a%100)%10;
			
			System.out.printf ("The number separated is:%d  %d  %d. %n", hundred, ten, unit);
		}
		
		
		if (a/1000 == 0 && a/100 == 0 && a/10 != 0 ) {
			
			ten = a/10;
			unit = a%10;
			
			System.out.printf ("The number separated is:%d  %d. %n", ten, unit);
		}
		
		
		if (a/1000 == 0 && a/100 == 0 && a / 10 == 0) {
			unit = a;
			
			System.out.printf ("The number separated is:%d. %n", unit);
		}
		
		
	}
	
}
