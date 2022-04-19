package exercise17;

import java.security.SecureRandom;
public class DiceRolling {

	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main (String[] args) {
		
		int[] array = new int [(12-1)];
		
		for(int number = 1; number <= 36000000; number++) {
			
			switch(rollDice()) {
				
			case 2:
				array[0]++;
				break;
				
			case 3:
				array[1]++;
				break;
			
			case 4:
				array[2]++;
				break;
				
			case 5:
				array[3]++;
				break;
				
			case 6:
				array[4]++;
				break;
				
			case 7:
				array[5]++;
				break;
				
			case 8:
				array[6]++;
				break;
				
			case 9:
				array[7]++;
				break;
				
			case 10:
				array[8]++;
				break;
				
			case 11:
				array[9]++;
				break;
				
			case 12:
				array[10]++;
				break;
			
			
			}	
		}
		
		System.out.println("number2|number3|number4|number5|number6|number7|number8|number9|number10|number11|number12|");
		System.out.printf("%7d %7d %7d %7d %7d %7d %7d %7d %8d %8d %8d", array[0],array[1],array[2],array[3],array[4],array[5], array[6], array[7],
				array[8],array[9],array[10]);
		
		
	}
	
	public static int rollDice () {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		return sum;
		
	} 

}
