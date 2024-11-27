package assignments.week3.day2;


//Create Concrete class 
//Using keyword implements 
public class JavaConnection implements DatabaseConnection
{

	// connecting the methods by using implement
	public void connect() 
	{
		System.out.println("It Connects the DataBase");	
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("It disconnects the database"); 
		
	}

	@Override
	public void executeUpdate() 
	{
		
		System.out.println("It Updates the database");
	}
	
	public static void main(String[] args) 
	{
		// Create object  for concrete class 
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		
	}
	
	
	
}
