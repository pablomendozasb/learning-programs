package exercise18;

import java.security.SecureRandom;
public class GameOfCraps {

	private static final SecureRandom randomNumbers = new SecureRandom();
	private enum Status { CONTINUE, WON, LOST };
	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	
	// plays one game of craps
	public static void main(String[] args) {
		
		int[] arrayVictory = new int [21];
		int[] arrayLose = new int [21];
		
		for (int number = 1; number <= 1000000; number++) {
			int countVictory;
			int countLose;
			int count = 1;
			int myPoint = 0; // point if no win or loss on first roll
			Status gameStatus; // can contain CONTINUE, WON or LOST
			int sumOfDice = rollDice(); // first roll of the dice
			// determine game status and point based on first roll
			switch (sumOfDice){
			case SEVEN: // win with 7 on first roll
			case YO_LEVEN: // win with 11 on first roll
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: // lose with 2 on first roll
			case TREY: // lose with 3 on first roll
			case BOX_CARS: // lose with 12 on first roll
				gameStatus = Status.LOST;
				break;
			default: // did not win or lose, so remember point
				gameStatus = Status.CONTINUE; // game is not over
				myPoint = sumOfDice; // remember the point
				//System.out.printf("Point is %d%n", myPoint);
				break;
			}
			// while game is not complete
			while ( gameStatus == Status.CONTINUE ) {
				
				sumOfDice = rollDice(); // roll dice again
				// determine game status
				if (sumOfDice == myPoint) // win by making point
					gameStatus = Status.WON;
					
				else
					if (sumOfDice == SEVEN)  // lose by rolling 7 before point
						gameStatus = Status.LOST;
						
				
				count++;
			}

		
			// display won or lost message
			if (gameStatus == Status.WON) {
				//System.out.println("Player wins");
				countVictory = count;
				switch (countVictory) {
				 
				case 1:
					arrayVictory[0]++;
					break;
					
				case 2:
					arrayVictory[1]++;
					break;
					
				case 3:
					arrayVictory[2]++;
					break;
					
				case 4:
					arrayVictory[3]++;
					break;
					
				case 5:
					arrayVictory[4]++;
					break;
					
				case 6:
					arrayVictory[5]++;
					break;
					
				case 7:
					arrayVictory[6]++;
					break;
					
				case 8:
					arrayVictory[7]++;
					break;
					
				case 9:
					arrayVictory[8]++;
					break;
					
				case 10:
					arrayVictory[9]++;
					break;
					
				case 11:
					arrayVictory[10]++;
					break;
					
				case 12:
					arrayVictory[11]++;
					break;
					
				case 13:
					arrayVictory[12]++;
					break;
					
				case 14:
					arrayVictory[13]++;
					break;
					
				case 15:
					arrayVictory[14]++;
					break;
					
				case 16:
					arrayVictory[15]++;
					break;
					
				case 17:
					arrayVictory[16]++;
					break;
					
				case 18:
					arrayVictory[17]++;
					break;
					
				case 19:
					arrayVictory[18]++;
					break;
					
				case 20:
					arrayVictory[19]++;
					break;
					
				case 21:
					arrayVictory[20]++;
					break;
				}
				//System.out.println("rolled until win: "+ countVictory);
			}
			else {
				//System.out.println("Player loses");
				countLose = count;
				switch (countLose) {
				 
				case 1:
					arrayLose[0]++;
					break;
					
				case 2:
					arrayLose[1]++;
					break;
					
				case 3:
					arrayLose[2]++;
					break;
					
				case 4:
					arrayLose[3]++;
					break;
					
				case 5:
					arrayLose[4]++;
					break;
					
				case 6:
					arrayLose[5]++;
					break;
					
				case 7:
					arrayLose[6]++;
					break;
					
				case 8:
					arrayLose[7]++;
					break;
					
				case 9:
					arrayLose[8]++;
					break;
					
				case 10:
					arrayLose[9]++;
					break;
					
				case 11:
					arrayLose[10]++;
					break;
					
				case 12:
					arrayLose[11]++;
					break;
					
				case 13:
					arrayLose[12]++;
					break;
					
				case 14:
					arrayLose[13]++;
					break;
					
				case 15:
					arrayLose[14]++;
					break;
					
				case 16:
					arrayLose[15]++;
					break;
					
				case 17:
					arrayLose[16]++;
					break;
					
				case 18:
					arrayLose[17]++;
					break;
					
				case 19:
					arrayLose[18]++;
					break;
					
				case 20:
					arrayLose[19]++;
					break;
					
				case 21:
					arrayLose[20]++;
					break;
				}
				
				
				//System.out.println("rolled until lose: "+ countLose);
			}
			
			System.out.println();
			
			
			
		}
		
	
		System.out.println("Victory rolled is:");
		System.out.println("1:    |2:    |3:    |4:    |5:    |6:    |7:    |8:    |9:    |10:    |11:    |12:    |13:     |14:    |15:    |16:    |17:    |18:     |19:     |20:     |21:     ");
		System.out.printf("%3d %3d %6d %6d %6d %6d %6d %6d %6d %6d %6d %6d %8d %8d %8d %8d %6d %6d %8d %8d %8d",arrayVictory[0],arrayVictory[1],arrayVictory[2],
				arrayVictory[3],arrayVictory[4],arrayVictory[5],arrayVictory[6],arrayVictory[7],arrayVictory[8],arrayVictory[9],arrayVictory[10],
				arrayVictory[11],arrayVictory[12],arrayVictory[13],arrayVictory[14],arrayVictory[15],arrayVictory[16],arrayVictory[17],arrayVictory[18],
				arrayVictory[19],arrayVictory[20]);
		
		System.out.println();
		
		System.out.println("Lose rolled is:");
		System.out.println("1:    |2:    |3:    |4:    |5:    |6:    |7:    |8:    |9:    |10:    |11:    |12:    |13:     |14:    |15:    |16:    |17:    |18:     |19:     |20:     |21:     ");
		System.out.printf("%3d %3d %6d %6d %6d %6d %6d %6d %6d %6d %6d %6d %8d %8d %8d %8d %6d %6d %8d %8d %8d%n%n",arrayLose[0],arrayLose[1],arrayLose[2],
				arrayLose[3],arrayLose[4],arrayLose[5],arrayLose[6],arrayLose[7],arrayLose[8],arrayLose[9],arrayLose[10],
				arrayLose[11],arrayLose[12],arrayLose[13],arrayLose[14],arrayLose[15],arrayLose[16],arrayLose[17],arrayLose[18],
				arrayLose[19],arrayLose[20]);
		
		int totalVictory = 0;
		
		for (int number : arrayVictory) {
			totalVictory += number;
		}
		
		double probabilityWin =  ((double) totalVictory/1000000)*100;
		
		System.out.println("Total winning: " + totalVictory);
		System.out.printf("The probability to win is: %.2f", probabilityWin);
		int length = 0;
		
		for (int number = 0; number < 21; number++) {
			
			length += arrayVictory[number]*number + arrayLose[number]*number;
			
		}
		
		System.out.println("Total length is: "+ length);
		
		double averageLength = ((double) length/1000000);
		
		System.out.println("The average length is: "+ averageLength);
		
	}
	
	
	public static int rollDice(){
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6); // first die roll
		int die2 = 1 + randomNumbers.nextInt(6); // second die roll
		int sum = die1 + die2; // sum of die values
		// display results of this roll
		//System.out.printf("Player rolled %d + %d = %d%n",
			//	die1, die2, sum);
		return sum;
	}
	
}
