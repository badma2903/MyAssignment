package assignments.week3.day2;


//Create Concrete class 
//using keyword implements 
public class JavaConnection implements DatabaseConnection
{

	// Inherits the methods & print
	public void connect() 
	{
		System.out.println("It Connects the DataBase");	
		
	}

	// Inherits the methods & print
	public void disconnect() 
	{
		System.out.println("It disconnects the database"); 
		
	}

	// Inherits the methods & print
	public void executeUpdate() 
	{
		
		System.out.println("It Updates the database");
	}
	
	public static void main(String[] args) 
	{
		// Create object  for concrete class 
		// call the methods & print 
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		
	}
	
	
	
}
