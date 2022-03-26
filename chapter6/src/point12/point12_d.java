package point12;

import java.util.Random;
public class point12_d {

	public static void main (String[] args) {
		
		Random randomNumbers = new Random ();
		
		int n;
		
		
		for (int a = 1; a <= 500; a++ ) {
			n = 1000 + randomNumbers.nextInt (113);
			System.out.println(n);
			
		}
	}
	
}
