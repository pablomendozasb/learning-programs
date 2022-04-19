package exercise19;

public class practice {

	public static void main (String[] args) {
		
		int economyLength = 9;
		
		int firstClassLength = 4;
		
		if (economyLength != 10 && firstClassLength != 4)
			System.out.println("Please insert 1 if you want First Class flight and 2 if you want a Economy flight. ");
		
		if (economyLength == 10) {
			System.out.println("Section is full. Do you want to go to economy class? Put 'Y' if yes and 'N' if no.\"");
		}
		
		if (firstClassLength == 4)
			System.out.println("Section is full. Do you want to go to first class? Put 'Y' if yes and 'N' if no.\"");
		
	}
	
}
