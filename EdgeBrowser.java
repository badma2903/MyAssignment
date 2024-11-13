package week1.day2;

public class EdgeBrowser 
{

	public static void main(String[] args)
	{
		Browser bo = new Browser();
		
		
		String launchBrowser = bo.launchBrowser("Microsoft Edge");
		System.out.println(launchBrowser);

		bo.loadUrl();
	}

}
