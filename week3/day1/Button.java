package assignments.week3.day1;

public class Button extends WebElement
{
	public void  Submit()
	{
		System.out.println("Submit the Button");
		
	
	}
	public static void main(String[] args) 
	{
		Button bt = new Button();
		bt.click("ok");
		bt.setText("Successful");
		bt.Submit();
		
	}
	
	
}
