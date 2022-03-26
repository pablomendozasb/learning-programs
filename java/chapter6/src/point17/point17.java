package point17;

import java.util.Scanner;
public class point17 {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Please insert a integer number and the system is going to say if it's even or odd: ");
		
		while ( input.hasNext () ) {
			
			int integer = input.nextInt();
			
			if (isEven (integer) == true)
				System.out.println ("The number is even:");
			
			else
				System.out.println ("The number is odd:");
			
			
		}
		
	}
	
	
	public static boolean isEven (int integer) {
		
		if (integer % 2 == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
