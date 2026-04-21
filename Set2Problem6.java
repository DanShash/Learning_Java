
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Ask for hours in each activity
		System.out.print("Enter hours spent bicycling: ");
		double bikingHours = input.nextDouble();
		
		System.out.print("Enter hours spent jogging: ");
		double joggingHours = input.nextDouble();
		
		System.out.print("Enter hours spent swimming: ");
		double swimmingHours = input.nextDouble();
		
		// Calories burned per activity
		double bikingCalories = bikingHours * 200;
		double joggingCalories = joggingHours * 475;
		double swimmingCalories = swimmingHours * 275;
		
		// Total calories
		double totalCalories = bikingCalories + joggingCalories + swimmingCalories;
		
		// Pounds lost (1 pound = 3500 calories)
		double poundsLost = totalCalories / 3500.0;
		
		// Display results
		System.out.println("Total calories burned: " + totalCalories);
		System.out.println("Pounds lost: " + poundsLost);
		
		input.close();
	}
}
