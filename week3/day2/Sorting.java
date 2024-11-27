package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting
{
	public static void main(String[] args)
	{
		//Initializing the array list 
		List<String> web = new ArrayList<String>();
		//use add method
		web.add("HCL");
		web.add("Wipro");
		web.add("Aspire Systems");
		web.add("CTS");
		
		//sort the list
		Collections.sort(web);
		
		//iterate the loop to print reverse
	    for (int i = web.size()-1; i>= 0; i--) 
        { 
           //Prints the reverse list 
            System.out.print(web.get(i)+","); 
        } 
	    
	}
	
}
