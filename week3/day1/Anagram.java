package assignments.week3.day1;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args)
	{
		String text1 = "stops"; 
		String text2 = "potss";
		
		// check if length is same
	    if(text1.length() == text2.length()) 
	    {
	    	// convert strings to char array
	        char[] charArray1 = text1.toCharArray();
	        char[] charArray2 = text2.toCharArray();

	        // sort the char array
	        Arrays.sort(charArray1);
	        System.out.println(charArray1);
	        Arrays.sort(charArray2);
	        System.out.println(charArray2);
	        
	        // if sorted char arrays are same
	        // then the string is anagram
	        boolean result = Arrays.equals(charArray1, charArray2);
	        if(result) 
	        {
	          System.out.println( text1 + " and " + text2 + " anagram.");
	        }
	        else
	        {
	          System.out.println("The given Strings are not anagram.");
	        }
	    }
	    else 
	    {
	        System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	    }
	}

}


