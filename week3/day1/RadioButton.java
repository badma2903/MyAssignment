package assignments.week3.day1;

//Inherits the Radio button class as multilevel
public class RadioButton extends Button
{
	//create methods 
	public void  selectRadioButton()
	{
		System.out.println("Select the Radio Button");
	
	}
	
	public static void main(String[] args)
	{
		//create objects & call methods 
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		rb.click("Logout");
		rb.setText("Successful");
		rb.Submit();
		
		
	}
	
	
}


