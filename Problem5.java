
public class Problem5 {

	public static void main(String[] args) 
	{
		// Example values
		double fahrenheit = 98.6;   // body temperature as example for this application
		double celsius = 37.0;      // You Can use any values you want for conversion
		
		// F to C: C = (F - 32) * 5 / 9
		double fToC = (fahrenheit - 32) * 5.0 / 9.0;
		
		// C to F:  F = (C * 9 / 5) + 32
		double cToF = (celsius * 9.0 / 5.0) + 32;
		
		// Print results
		System.out.println(fahrenheit + "°F is equal to " + fToC + "°C");
		System.out.println(celsius + "°C is equal to " + cToF + "°F");
	}

}
