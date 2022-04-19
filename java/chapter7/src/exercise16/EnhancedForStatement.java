package exercise16;

public class EnhancedForStatement {

	public static void main (String[] args) {
		
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[1]);
		double number3 = Double.parseDouble(args[2]);
		double number4 = Double.parseDouble(args[3]);
		
		System.out.printf("The result of two numbers is: %.1f%n", operation(number1,number2));
		System.out.printf("The result of three numbers is: %.1f%n", operation(number1,number2,number3));
		System.out.printf("The result of four numbers is: %.1f%n", operation(number1,number2,number3,number4));
		
	}
	
	public static double operation (double... numbers )  {
		
		double operationResult = 0;
		
		for (double number : numbers)
			operationResult += number;
		
		return operationResult;
		
	}
	
}
