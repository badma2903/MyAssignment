package assignments.week3.day1;

public class RemoveDuplicates 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		  //Initializing the string
		  String text = "We learn Java basics as part of java sessions in java week1";

	        // Split the input into an array of words
	        String[] textArray = text.split(" ");
	        int count;

	        // Iterate through the array to find duplicates
	        for (int i = 0; i < textArray.length; i++) 
	        {
	        	// Initialize count for each word
	            count = 1; 

	            // Skip empty strings
	            if (textArray[i].equals(" ")) 
	            {
	                continue;
	            }

	            // Compare the current word with the rest of the array
	            for (int j = i + 1; j < textArray.length; j++) 
	            {
	                // Check for duplicate words (case-insensitive)
	                if (textArray[i].equalsIgnoreCase(textArray[j])) 
	                {
	                	// Increment count
	                    count++; 
	                    // Replace the duplicate with an empty string
	                    textArray[j] = " "; 
	                }
	            }
	        }

	        // Print the modified array, skipping empty strings
	        for (int i = 0; i < textArray.length; i++) 
	        {
	            if (!textArray[i].equals(""))
	            {
	                System.out.print(textArray[i] + " ");
	            }
	        }
	    }
	}
	

	


