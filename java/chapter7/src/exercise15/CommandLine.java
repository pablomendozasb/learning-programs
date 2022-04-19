package exercise15;

public class CommandLine {

	public static void main(String[] args) {
		// declare variable array and initialize it with an array object
		
		int ARRAY_LENGTH;
		
		if (args.length > 0) {
			
			ARRAY_LENGTH = Integer.parseInt(args[0]);
			 // create the array object		
		}
		
		else
			ARRAY_LENGTH = 10;
		
		int[] array = new int[ARRAY_LENGTH];
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
} // end class InitArray