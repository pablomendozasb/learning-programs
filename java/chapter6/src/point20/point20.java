package point20;

import java.util.Scanner;
public class point20 {

	public static void main (String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please insert the radius of the circle that is going to be calculated: ");
		
		double radius = input.nextDouble ();
		
		System.out.println("The area of the circle is: " + circleArea(radius));
		
	}
	
	public static double circleArea (double radius) {
		
		double area = Math.PI*Math.pow(radius, 2);
		return area;
		
	}
	
}
