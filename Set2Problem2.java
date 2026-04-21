import javax.swing.JOptionPane;
public class Problem2 {

	public static void main(String[] args) {
		// Ask for user's name
		String name = JOptionPane.showInputDialog("Enter your name:");
				
		// Ask for hours worked
		String hoursStr = JOptionPane.showInputDialog("Enter number of hours worked:");
		double hours = Double.parseDouble(hoursStr);
				
		// Ask for hourly rate
		String rateStr = JOptionPane.showInputDialog("Enter your hourly pay rate:");
		double rate = Double.parseDouble(rateStr);
				
		// Calculate gross pay
		double grossPay = hours * rate;
				
		// Show results in a dialog box
		JOptionPane.showMessageDialog(null, 
				"Hello " + name + "\nYour gross pay is " + grossPay);

	}

}
