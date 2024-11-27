package assignments.week3.day1;

public class CheckBoxButton extends Button
{

	public void clickCheckButton()
	{
		System.out.println("Verifying it clicks the button");
	
	}
	
	public static void main(String[] args)
	{
		CheckBoxButton cb = new CheckBoxButton();
		cb.click("Login");
		cb.setText("Successful");
		cb.clickCheckButton();
		cb.Submit();
	}
	
	
}
