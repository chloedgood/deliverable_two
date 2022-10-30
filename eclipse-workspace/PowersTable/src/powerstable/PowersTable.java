package powerstable;

import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input= "";
		do
		{	
		System.out.println("Learn your squares and cubes!");
		System.out.println("Enter an integer: ");
		int num = in.nextInt();
		
		System.out.printf("%-10s  %-10s  %10s %n", "NUMBER", "SQUARED", "CUBED");
		System.out.printf("=======     ========        ========%n");
		
		for(int i = 1; i <= num; i++) {
			
			System.out.printf("%-15d%-15d%-15d\n", i,  i*i, i*i*i);

			
		
	
		
	}System.out.println("Would you like to continue? (y/n)");
	input = in.next();
		}while(input.equals("y"));

	}
}

