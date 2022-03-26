package point16;

import java.util.Scanner;

public class point16 {

	public static void main (String[] args) {
	
	
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Please insert two numbers: (The system will say you if the second number is multiple ");
		System.out.println ("of the first one.)");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (isMultiple(num1, num2) == true)
			System.out.println ("The second number is multiple of the first one.");
		
		else
			System.out.println ("The second number isn't multiple of the first one");
		
	}
	
	public static boolean isMultiple (int num1, int num2) {
		
		if (num2 % num1 == 0) {
			return true;
		}
		
		else 
			return false; 	
	}
	
}
