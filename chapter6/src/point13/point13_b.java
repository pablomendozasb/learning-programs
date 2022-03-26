package point13;

import java.util.Random;
public class point13_b {

	public static void main (String[] args) {
		
		int n;
		
		Random randomNumbers = new Random ();
		
		
		for (int a = 1; a <= 20; a++) {
			n = 3 + 2*randomNumbers.nextInt(5);
			System.out.println (n);
		}
	}
	
}
