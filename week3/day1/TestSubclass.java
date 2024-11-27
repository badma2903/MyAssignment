package assignments.week3.day1;

public class TestSubclass extends TestData 
{   
	
	
	public void enterUsername(String Username)

	{
		System.out.println("Enter the Username:"+Username);
	
	}
	
	public void enterPassword(int pswd)
	{
		System.out.println("Enter the Password:"+pswd);
	}
	
	public static void main(String[] args) 
	{
		TestSubclass obj = new TestSubclass();
		obj.enterCredentials();
		obj.enterUsername("Priya");
		obj.enterPassword(123);
		obj.navigateToHomePage();
	
	}
	

}
