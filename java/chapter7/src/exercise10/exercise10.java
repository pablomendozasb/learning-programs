package exercise10;

import java.util.Scanner;
public class exercise10 {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] salesPeople = new int [9];
		
		double gross;
		double sales;
		char cont = 'e';
		
		System.out.println("Please insert how many the salesman sold and the system will say hoy much he won (insert c if you want to stop):");
		gross = input.nextDouble();
		
		sales = 200 +  0.09*gross; 
		
		while (cont != 'c') {
		
			if (sales == 200 || sales <= 299)
				salesPeople[0]++;
		
			else if (sales == 300 || sales <= 399)
				salesPeople[1]++;
		
			else if (sales == 400 || sales <= 499)
				salesPeople[2]++;
		
			else if (sales == 500 || sales <= 599)
				salesPeople[3]++;
		
			else if (sales == 600 || sales <= 699)
				salesPeople[4]++;
		
			else if (sales == 700 || sales <= 799)
				salesPeople[5]++;
		
			else if (sales == 800 || sales <= 899)
				salesPeople[6]++;
		
			else if (sales == 900 || sales <= 999)
				salesPeople[7]++;
		
			else
				salesPeople[8]++;
		
			System.out.println("continue?");
			cont = input.next().charAt(0);
			if (cont == 'c')
				break;
			System.out.println("Insert gross sales:");
			gross = input.nextDouble();
			sales = 200 +  0.09*gross; 
		
		
		}
		
		System.out.println("\t $200–299|$300–399|$400–499|$500–599|$600–699|$700–799|$800–899|$900–999|$1000 and over");
		System.out.printf("\t\t %d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d", salesPeople[0],salesPeople[1],salesPeople[2],salesPeople[3],
				salesPeople[4],salesPeople[5],salesPeople[6],salesPeople[7],salesPeople[8]);
		
	} 
	
}
