package point14;

import java.util.Scanner;
public class point14 {
	
	private static int result;
	
	public static void main (String [] args) {
	
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Please insert the base and the exponent:");
		
		int base = input.nextInt();
		int exponent = input.nextInt ();
		
		System.out.println ("The result of the operation is: ");
		System.out.println (integerPower(base, exponent));
		
		
	}
	
	public static int integerPower (int base, int exponent) {
		
		if (exponent > 0) {
			for (int a = 1; a <= exponent; a++) {
				result = base;
				result *= base;
			}
		}
		
		else if(exponent == 0) {
			result = 1;
		}
		
		return result;
	}

}
