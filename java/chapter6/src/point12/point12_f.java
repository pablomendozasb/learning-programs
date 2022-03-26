package point12;


import java.util.Random;
public class point12_f {

	public static void main (String[] args) {
		
		Random randomNumbers = new Random ();
		
		int n;
		
		
		
		for (int a = 1; a <= 50; a++) {
			
			n = -3 + randomNumbers.nextInt (11 + 3 + 1);
			System.out.println (n);
			
		}
		
	}
	
}
