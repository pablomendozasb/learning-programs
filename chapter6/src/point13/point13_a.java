package point13;

import java.util.Random;
public class point13_a {

	public static void main (String[] args) {
		
		Random randomNumbers = new Random ();
		
		int n;
		
		for (int a = 1; a <= 20; a++) {
			
			n = 2 + 2*randomNumbers.nextInt (5);
			System.out.println (n);
			
		}
		
		
	}
	
}
