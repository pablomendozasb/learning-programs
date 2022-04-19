package exercise14;

public class VariableLength {

	public static void main (String[] args) {
		
		int d1 = 5;
		int d2 = 4;
		int d3 = 8;
		int d4 = 22;
		
		System.out.printf("d1 = %d%nd2 = %d%nd3 = %d%nd4 = %d%n%n",
				d1, d2, d3, d4);
		
		System.out.printf("Product of d1 and d2 is %d%n",
				product(d1, d2) );
		
		System.out.printf("Product of d1,d2 and d3 is %d%n",
				product(d1, d2,d3) );
		
		System.out.printf("Product of d1,d2,d3 and d4 is %d%n",
				product(d1, d2,d3,d4) );
		
	}
	
	
	public static int product (int... numbers) {
		
		int total = 1;
		
		for (int d : numbers)
			total *= d;
		
		return total;
		
	}
	
}
