package point12;

import java.util.Random;

public class point12_e {

	public static void main (String[] args) {
	
		Random randomNumbers = new Random ();
	
		int n;
	
		for (int a = 1; a <= 15; a++) {
			
			n = -1 + randomNumbers.nextInt (3);
			
			System.out.println (n);
		
		}
	
	}
	
}
