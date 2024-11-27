package assignments.week3.day1;

public class TextField extends WebElement
{
	public void  getText()
	{
		super.click("Enter Button");
	
	}
	
	public static void main(String[] args) 
	{
		TextField tf = new TextField();
		tf.click("Next");
		tf.setText("Successful");
		tf.getText();
		
	}
	
	
}
