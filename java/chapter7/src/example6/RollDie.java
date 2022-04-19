package example6;

import java.util.Random;
public class RollDie {

	public static void main (String[] args) {
		Random randomNumbers = new Random (); //random number generator
		int[] frequency = new int[7]; //array of frequency counters 
		
		//roll die 6,000,000 times; use die value as frequency index
		for (int roll = 1; roll <= 6000000; roll++) {
			++frequency[1 + randomNumbers.nextInt(6)];
		}
		
		System.out.printf ("%s%10s", "Face", "Frequency");
		
		//output each array element's value
	} //end main	
}//end class RollDie
