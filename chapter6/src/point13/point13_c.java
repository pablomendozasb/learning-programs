package point13;

import java.util.Scanner;
import java.util.Random;
public class point13_c {

	
	public static void main (String[] args) {
		
		
		int n;
		
		Random randomNumbers = new Random ();
		
		for (int a = 1; a <= 50; a++) {
			
			n = 6 + 4*randomNumbers.nextInt (5);
			System.out.println (n);
			
		}
		
		
	}
	
	
	
	
	
	
}
