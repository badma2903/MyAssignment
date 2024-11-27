package assignments.week3.day1;

//Inherits the Test data class
public class LoginTestData extends TestData 
{
	//Create methods & pass arguments
	public void enterUsername(String Username)
	{
		System.out.println("Enter the Username:"+Username);
	
	}
	
	//Create methods & pass arguments
	public void enterPassword(int pswd)
	{
		System.out.println("Enter the Password:"+pswd);
	}
	
	//Create object for the class
	public static void main(String[] args) 
	{
		//call the inheritance class methods 
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername("Priya");
		obj.enterPassword(123);
		obj.navigateToHomePage();
		
		
	}

}
