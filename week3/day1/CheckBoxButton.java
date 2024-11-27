package assignments.week3.day1;
 //Inherits the Button class using extends
public class CheckBoxButton extends Button
{
	//Creating new method
	public void clickCheckButton()
	{
		//prints the message
		System.out.println("Verifying it clicks the button");
	
	}
	
	public static void main(String[] args)
	{
		//Create the object for the class
		CheckBoxButton cb = new CheckBoxButton();
		cb.click("Login");
		cb.setText("Successful");
		cb.clickCheckButton();
		cb.Submit();
	}
	
	
}
