package exercise4;

public class exercise4 {

	public static void main (String[] args) {
		
		final int ARRAY_SIZE = 3;
		
		//a
		int[][] table = new int [ARRAY_SIZE][ARRAY_SIZE];
		
		//b) 9
		
		//c
		for (int x = 0; x < table.length; x++)
			for (int y = 0; y < table[x].length; y++)
				table[x][y] = x+y;
		
		
	}
	

}
