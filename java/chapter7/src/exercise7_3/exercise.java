package exercise7_3;

public class exercise {

	public static void main (String[] args) {
		
		int total = 0;
		
		//a
		final int ARRAY_SIZE = 10;
		
		//b
		double[] fractions = new double[ARRAY_SIZE];
		
		//c
		fractions[ 4 ] = 0;
		
		//d
		fractions[ 9 ] = 1.667;
		
		//e
		fractions[ 6 ] = 3.333;
		
		//f
		for (int x = 0;  x < fractions.length; x++)
			total += fractions[x];
		
		System.out.println(total);
		
		
	}
	
}
