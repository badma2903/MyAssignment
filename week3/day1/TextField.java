package assignments.week3.day1;

//Inherits the Web element class
public class TextField extends WebElement
{
	//Create methods
	public void  getText()
	{
		//using super keyword to pass value of inheritance class
		super.click("Enter Button"); 
	
	}
	
	//Create object for Text field class 
	public static void main(String[] args) 
	{
		//call the methods of the inheritance class
		TextField tf = new TextField();
		tf.click("Next");
		tf.setText("Successful");
		tf.getText();
		
	}
	
	
}
