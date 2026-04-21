
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner input = new Scanner(System.in);
				
		// Ask for user input
		System.out.print("Enter your name: ");
		String name = input.nextLine();
				
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
				
		System.out.print("Enter your hourly pay rate: ");
		double rate = input.nextDouble();
				
		// Calculate gross pay
		double grossPay = hours * rate;
				
		// Display results
		System.out.println("Hello " + name);
		System.out.println("Your gross pay is " + grossPay);
				
		// Close scanner, essentially to stop the program.
		input.close();
			
	}

}
