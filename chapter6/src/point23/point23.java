package point23;


import java.util.Scanner;
public class point23 {

	public static float num1;
	public static float num2;
	public static float num3;
	public static float min1;
	public static float min2;
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please insert three numbers and system will show the minimum number: ");
		
		num1 = input.nextFloat();
		num2 = input.nextFloat();
		num3 = input.nextFloat();
		
		System.out.println("The minimum number is: " + minimum3(num1,num2,num3));
		
	}
	
	public static float minimum3 (float num1, float num2, float num3) {
		
		min1 = Math.min(num1, num2);
		min2 = Math.min(min1, num3);
		
		return min2;
		
	}
	
}
