package point22;



import java.util.Scanner;
public class c {
	
	public static int temperature;
	public static double celsius;
	public static double fahrenheit;
	public static char option;

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please insert the option that you want to have the equivalent. If you want celsius, please insert 'c' and if you want fahrenheit"
				+ "please insert 'f': "  );
		
		option = input.next().charAt(0);
		
		equivalent (option, temperature);
	
	}
	
	
	public static void equivalent (char option, int temperature ) {
		
		Scanner input = new Scanner (System.in);
		
		if (option == 'c') {
			System.out.println("Please insert the corresponding number in celsius that you want in fahrenheit:");
			celsius = input.nextDouble();
			System.out.printf ("The equivalent in celsius of the fahrenheit temperature that was added is: %.2f. %n%n", fahrenheit(celsius));
		}
		
		else if (option == 'f') {
			System.out.println("Please insert the corresponding number in fahrenheit that you want in celsius:");
			fahrenheit = input.nextDouble();
			System.out.printf ("The equivalent in fahrenheit of the celsius temperature that was added is: %.2f. %n%n", Celsius(fahrenheit));
		}
		
		else {
			System.out.println ("Please insert a correct option. ");
		}
		
	}
	
	public static double fahrenheit (double celsius) {
		return fahrenheit = ( 9.0/5.0)*celsius + 32;
	}
	
	public static double Celsius (double fahrenheit) {
		return celsius = ( 5.0/9.0)*(fahrenheit - 32);
	}
	
}
