import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		// Create Scanner for input
		Scanner input = new Scanner(System.in);
		
		// Ask user for age
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		// Ask user for resting heart rate
		System.out.print("Enter your resting heart rate: ");
		int restingRate = input.nextInt();
		
		// Calculate training heart rate
		double trainingHeartRate = 0.7 * (220 - age) + 0.3 * restingRate;
		
		// Display result
		System.out.println("Your training heart rate is: " + trainingHeartRate);
		
		// Close scanner
		input.close();
	}
}
