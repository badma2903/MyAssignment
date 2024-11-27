package assignments.week3.day1;

//Inherits the Button class as multilevel
public class CheckBoxButton extends Button
{
	//create methods 
	public void clickCheckButton()
	{
		System.out.println("Verifying it clicks the button");
	
	}
	
	public static void main(String[] args)
	{
		//create objects & call methods 
		CheckBoxButton cb = new CheckBoxButton();
		cb.click("Login");
		cb.setText("Successful");
		cb.clickCheckButton();
		cb.Submit();
	}
	
	
}
