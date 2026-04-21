import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Ask user for prices
		System.out.print("Enter the price of the appetizer: ");
		double appetizer = input.nextDouble();
		
		System.out.print("Enter the price of the main course: ");
		double mainCourse = input.nextDouble();
		
		System.out.print("Enter the price of the dessert: ");
		double dessert = input.nextDouble();
		
		// Calculate meal total
		double mealTotal = appetizer + mainCourse + dessert;
		
		// Tax is 8.875% of the meal total
		double tax = mealTotal * 0.08875;
		
		// Tip is 15% of (meal total + tax)
		double tip = (mealTotal + tax) * 0.15;
		
		// Final bill
		double totalBill = mealTotal + tax + tip;
		
		// Display results
		System.out.println("Meal total: $" + mealTotal);
		System.out.println("Tax amount: $" + tax);
		System.out.println("Tip amount: $" + tip);
		System.out.println("Total bill: $" + totalBill);
		
		input.close();
	}
}
