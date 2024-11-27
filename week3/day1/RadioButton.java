package assignments.week3.day1;

//Inherits the button class using extends
public class RadioButton extends Button
{
	//creating new method 
	public void  selectRadioButton()
	{
		System.out.println("Select the Radio Button");
	
	}
	
	public static void main(String[] args)
	{
		//creating object for the class 
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		rb.click("Logout");
		rb.setText("Successful");
		rb.Submit();
		
		
	}
	
	
}


