package exercise11;

import java.lang.reflect.Array;

public class exercise11 {

	public static void main (String[] args) {
		
		//a)
		
		int[] counts = new int [10];
		
		for (int number = 0; number < counts.length; number++)
			counts[number] = 0;
		
		//b)
		
		int[] bonus = new int [15];
		
		for (int number = 0; number < counts.length; number++)
			bonus [number] = 1;
		
		//c)
		int[] bestScores = {4,4,5,4,5};
		
		for (int number = 0; number < bestScores.length; number++)
			System.out.println(bestScores[number]);
		
		
	}
	
	
}
