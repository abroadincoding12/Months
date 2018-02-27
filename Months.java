import javax.swing.JOptionPane;
public class Months
{

	public static void main(String[] args)
	{
		//Declare the variable
		int month;
		String input;
		final double WINTER_MONTH = 0-2;
		final double SPRING_MONTH = 3-5;
		final double SUMMER_MONTH = 6-8;
		final double FALL_MONTH = 9-11;


		input = JOptionPane.showInputDialog("Enter the month number for what season");
		month = Integer.parseInt(input);

		if (month <= 2)
		{
			JOptionPane.showMessageDialog(null, "The month is winter");
		}
		else if (month <= 5)
		{
			JOptionPane.showMessageDialog(null, "The month is spring");
		}
		else if (month <= 8)
		{
			JOptionPane.showMessageDialog(null, "The month is summer");
		}
		else if (month <= 11)
		{
			JOptionPane.showMessageDialog(null, "The month is fall");
		}

		System.exit(0);
	}
}