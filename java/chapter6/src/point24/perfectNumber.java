package point24;


import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class perfectNumber {

	public static int multiplier = 1;
	public static int entireDivisor;
	public static int sum = 0;
	public static int showedMultipliedNumber;
	
	public static void main (String[] args) {
		
		isPerfect();
		
	}
	
	public static void isPerfect () {
			
		for (int b =1 ; b <= 1000000000; b++) {
			
			int sum = 0;
			
			for (int a = 1; a <= b; a++) {
			
				entireDivisor = b/a;
			
				if (b%a == 0 && b != entireDivisor) {
					sum += entireDivisor;
				}
			}
		
			if (b==sum)
				System.out.println("The perfect number is:" +b);
		}
		
	}	
}
