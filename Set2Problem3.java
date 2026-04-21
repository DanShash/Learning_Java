import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask the user for their favorite city
		System.out.print("Enter your favorite city: ");
		String city = input.nextLine();
		
		// Display required results
		System.out.println("Number of characters in the city name: " + city.length());
		System.out.println("City name in uppercase: " + city.toUpperCase());
		System.out.println("City name in lowercase: " + city.toLowerCase());
		System.out.println("First character in the city name: " + city.charAt(0));
		
		// Close scanner
		input.close();
	}
}
