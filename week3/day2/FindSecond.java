package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecond 
{
  public static void main(String[] args) 
  {
	  	 //Declaring array using list add method
		 List<Integer> list = new ArrayList<Integer>();
	     list.add(3);
	     list.add(2);
	     list.add(11);
	     list.add(4);
	     list.add(6);
	     list.add(7);
	     
	     //Sort & print the list
	     Collections.sort(list);
	     
	     //Print the second largest number using get method
	     int j = list.get(4);
	     System.out.println("The Second Largest Element in the array list is:"+j);
	     
	  
   }
}




        