package assignments.week3.day1;

//Inherits the Testdata class using the extend
public class TestSubclass extends TestData 
{   
	
	//Creating methods & passing string arguments
	public void enterUsername(String Username)

	{
		//Print the message
		System.out.println("Enter the Username:"+Username);
	
	}
	//Creating methods & passing string arguments
	public void enterPassword(int pswd)
	{
		//Print the message
		System.out.println("Enter the Password:"+pswd);
	}
	
	public static void main(String[] args) 
	{
		//Create the object for the class 
		TestSubclass obj = new TestSubclass();
		obj.enterCredentials();
		obj.enterUsername("Priya");
		obj.enterPassword(123);
		obj.navigateToHomePage();
	
	}
	

}
