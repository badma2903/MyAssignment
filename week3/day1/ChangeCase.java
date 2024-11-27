package assignments.week3.day1;

public class ChangeCase 
{

	public static void main(String[] args) 
	{
			//Given String
			String str = "changeme";  
			 
			// Convert the string to a character array
			char[] charArray = str.toCharArray();  
			        
			        // Iterate through the array 
			        for (int i = charArray.length - 1; i >= 0; i--) 
			        {
			            // Check if the index is odd
			            if (i % 2 != 0) 
			            {
			                // Change the character to upper case if the index is odd
			                charArray[i] = Character.toUpperCase(charArray[i]);
			            }
			        }
			        
			        // Print the result
			        System.out.println(new String(charArray));
			    }
			

	}


