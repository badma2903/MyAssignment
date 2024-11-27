package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement 
{
	public static void main(String[] args) 
	{
		//Initializing the array list
		List<Integer> find = new ArrayList<Integer>();
		
		//add the values
		find.add(1);
		find.add(2);
		find.add(3);
		find.add(4);
		find.add(10);
		find.add(6);
		find.add(8);
		
		//sort the list
		Collections.sort(find);
		
		//using for loop to iterate
		for (int i = 0; i < find.size()-1; i++)
		{
            int currentElement = find.get(i);
            int nextElement = find.get(i+1);

            // Check if current element + 1 is not equal to next element
            if (currentElement+1!= nextElement) 
            {
               //Prints the missing elements
            	System.out.println(currentElement+1);

            }
		}
	}
} 
