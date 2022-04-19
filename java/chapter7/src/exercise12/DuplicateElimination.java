package exercise12;

import java.util.Scanner;
public class DuplicateElimination {

	public static void main (String[] args) {
		
		int[] array = new int [5];
		int[] arrayDisplay = new int [5];
		Scanner input = new Scanner (System.in);
		System.out.print("Please insert number between 10 and 100: ");
		
		int newCounter = 1;
		int number;
			
			number = input.nextInt();
			
			if (number >= 10 && number <= 100) {
				
				array[0] = number;
				arrayDisplay[0] = array[0];
				
				if (array[0] != array [1])
					System.out.println(array[0]);
				
				for (int constant = 1; constant < array.length; constant++) {
					System.out.print("Please insert number: ");
					array[constant] = input.nextInt();
					
					int counter = 0;
					
					for (int otherCounter = 0; otherCounter < constant; otherCounter++) {
						if (array[otherCounter] == array[constant])
							
							counter++;
					}
					
					if (counter == 0) {
						System.out.println(array[constant]);
						arrayDisplay[constant]=array[constant];
						
						for(int newNumber = 0; newNumber < arrayDisplay.length; newNumber++) {
							if (arrayDisplay[newNumber] != 0)
								System.out.print( arrayDisplay[newNumber] + " ");	
						}
					}
					
					else {
						arrayDisplay[constant] = 0;
						for(int newNumber = 0; newNumber < arrayDisplay.length; newNumber++) {
							if (arrayDisplay[newNumber] != 0)
								System.out.print( arrayDisplay[newNumber] + " ");	
						}	
					}	
				}							
			}			
			else 
				System.out.println("Please insert a correct number:");	
	}
}
