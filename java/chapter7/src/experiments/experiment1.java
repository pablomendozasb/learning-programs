package experiments;

public class experiment1 {

	
	
	public static void main (String[] args) {
		
		int t[][] = {{1,2,3},{4,5},{7,8,9},{10,11,12,13,14}};
		
		for(int i = 0; i < t.length; i++) {
			
			for (int j =0; j < t[i].length; j++)
				System.out.printf("%d ",t[i][j]);
			
			System.out.println();
			
		}
		
		
	}
	
	
	
	
}
