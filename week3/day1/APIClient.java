package assignments.week3.day1;

public class APIClient 
{
	public void sendRequest(String endpoint)
	{
		System.out.println("Send the Request as:"+endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus )
	{
		System.out.println("Send the Request as:"+endpoint+"\n"+"Name the Driver as:"+requestBody+"\n"+"Status is :"+requestStatus);
	}
	public static void main(String[] args) 
	{
		APIClient app = new APIClient();
		app.sendRequest("Get the URL");
		app.sendRequest("URL", "ChromeDriver",true);
	}

}
