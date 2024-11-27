package assignments.week3.day1;

//Inherits the Web element class using extend keyword
public class TextField extends WebElement
{
	//Creating the void method 
	public void  getText()
	{
		// Using super keyword
		super.click("Enter Button");
	
	}
	
	public static void main(String[] args) 
	{
		//Creating object for the classs
		TextField tf = new TextField();
		tf.click("Next");
		tf.setText("Successful");
		tf.getText();
		
	}
	
	
}
