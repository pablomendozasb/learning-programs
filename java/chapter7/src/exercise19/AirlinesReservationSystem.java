package exercise19;

import java.util.Scanner;
public class AirlinesReservationSystem {

	public static void main (String[] args) {
		
		boolean[] chairs = new boolean [10];
		
		int firstClassLength = 0;
		int economyLength = 5;
		int arrayCounter = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
		
		
		char typeOfFligth = input.next().charAt(0);
		boolean continued;
		char continueFlight;

		
		
		/* 
		 * 
		 * if (1)
		 * 	chairs[firstClassLength]
		 * 		length++
		 * else if (2)
		 * 	chairs[economyLength]++
		 * 
		 * 
		 * */
		
		while (arrayCounter < chairs.length) {
			
			int counter = 0;
			
			while (counter < 1) {
				
				if (typeOfFligth == '1') {
					
					counter++;
					
					if (firstClassLength != 5) {
			
						chairs[firstClassLength] = true;
						firstClassLength++;
						
						System.out.println("seat 1: " + chairs[0]);
						System.out.println("seat 2: " + chairs[1]);
						System.out.println("seat 3: " + chairs[2]);
						System.out.println("seat 4: " + chairs[3]);
						System.out.println("seat 5: " + chairs[4]);
						System.out.println("seat 6: " + chairs[5]);
						System.out.println("seat 7: " + chairs[6]);
						System.out.println("seat 8: " + chairs[7]);
						System.out.println("seat 9: " + chairs[8]);
						System.out.println("seat 10: " + chairs[9]);
						
						System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
						
					}
					
					else if (firstClassLength == 5) {
						System.out.println ("Would you like to go to economy class? Insert 'Y' if you want and 'N' if you don't");
						
						continueFlight = input.next().charAt(0);
						
						if(continueFlight == 'Y' || continueFlight == 'y')
							continued = true;
						
						else
							continued = false;
					
						if (continued == true) {
							chairs[economyLength] = true;
							economyLength++;
							System.out.println("seat 1: " + chairs[0]);
							System.out.println("seat 2: " + chairs[1]);
							System.out.println("seat 3: " + chairs[2]);
							System.out.println("seat 4: " + chairs[3]);
							System.out.println("seat 5: " + chairs[4]);
							System.out.println("seat 6: " + chairs[5]);
							System.out.println("seat 7: " + chairs[6]);
							System.out.println("seat 8: " + chairs[7]);
							System.out.println("seat 9: " + chairs[8]);
							System.out.println("seat 10: " + chairs[9]);
							
							System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
						}
							
						else {
							System.out.println("Next flight is in three hours.");
							System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
						}
						
					}
					
					
				}
				
				else if (typeOfFligth == '2') {
					
					counter++;
					
					if (economyLength != 10) {
					
						chairs[economyLength] = true;
						economyLength++;
						
						System.out.println("seat 1: " + chairs[0]);
						System.out.println("seat 2: " + chairs[1]);
						System.out.println("seat 3: " + chairs[2]);
						System.out.println("seat 4: " + chairs[3]);
						System.out.println("seat 5: " + chairs[4]);
						System.out.println("seat 6: " + chairs[5]);
						System.out.println("seat 7: " + chairs[6]);
						System.out.println("seat 8: " + chairs[7]);
						System.out.println("seat 9: " + chairs[8]);
						System.out.println("seat 10: " + chairs[9]);
						
						
					}	
					
					else if (economyLength == 10) {
						
						System.out.println ("Would you like to go to economy class? Insert 'Y' if you want and 'N' if you don't");
						
						continueFlight = input.next().charAt(0);
						
						if(continueFlight == 'Y' || continueFlight == 'y')
							continued = true;
						
						else
							continued = false;
						
						if (continued == true) {
							chairs[firstClassLength] = true;
							firstClassLength++;
							System.out.println("seat 1: " + chairs[0]);
							System.out.println("seat 2: " + chairs[1]);
							System.out.println("seat 3: " + chairs[2]);
							System.out.println("seat 4: " + chairs[3]);
							System.out.println("seat 5: " + chairs[4]);
							System.out.println("seat 6: " + chairs[5]);
							System.out.println("seat 7: " + chairs[6]);
							System.out.println("seat 8: " + chairs[7]);
							System.out.println("seat 9: " + chairs[8]);
							System.out.println("seat 10: " + chairs[9]);
							
							System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
						}
						
						else {
							System.out.println("Next flight is in three hours.");
							System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight");
						}
						
					}
						
					
				}	
				
				else {
					System.out.println("Please insert a correct value");
					typeOfFligth = input.next().charAt(0);
				
				}
			}	
			
			if (chairs[4] == true && chairs[9] == true)
				System.out.println("All the seats have been occupied.");
			
			arrayCounter++;		
			typeOfFligth = input.next().charAt(0);
			
		}
					
	}	
	
}
