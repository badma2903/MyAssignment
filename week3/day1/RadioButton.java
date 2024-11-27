package assignments.week3.day1;

public class RadioButton extends Button
{
	
	public void  selectRadioButton()
	{
		System.out.println("Select the Radio Button");
	
	}
	
	public static void main(String[] args)
	{
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		rb.click("Logout");
		rb.setText("Successful");
		rb.Submit();
		
		
	}
	
	
}


