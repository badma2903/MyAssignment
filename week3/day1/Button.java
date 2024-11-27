package assignments.week3.day1;

//Inherits the Web element class
public class Button extends WebElement
{
	//Create methods
	public void  Submit()
	{
		System.out.println("Submit the Button");
	}
	
	//Create object for Button class 
	public static void main(String[] args) 
	{
		//call the methods of the inheritance class
		Button bt = new Button();
		bt.click("ok");
		bt.setText("Successful");
		bt.Submit();
		
	}
	
	
}
