package example5;

//Bar Chat Printing Program
public class BarChart {

	public static void main (String[] args) {
		
		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grade distribution: ");
		
		//for each array element, output a bar of the chat 
		for (int counter = 0; counter < array.length; counter++) {
			
			//for each array element, output a bar of the chart 
			if (counter == 10)
					System.out.printf ("%5d: ", 100);
			else 
				System.out.printf("%02d-%02d: ", counter*10, counter*10 + 9);
			
			//print  bar of asterisks 
			for (int stars = 0; stars < array[counter]; stars++ ) 
				System.out.print("*");
			
			System.out.println(); //start a new line of output
			
		} //end outer for
	} //end main
} //end class BarCharts
