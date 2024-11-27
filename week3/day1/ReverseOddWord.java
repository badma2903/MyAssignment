package assignments.week3.day1;

public class ReverseOddWord 
{

	public static void main(String[] args) 
	{
		//Initialize the string
		String test = "I am a software tester";
		
		//Split the string & stored in array
		String[] split = test.split(" "); 
		
		for(int i = 0; i<split.length;i++)
		{
			//Find the odd index within the loop
			if (i%2==1) 
			{
			
				//Convert the String array into a character array 
				char[] msg = split[i].toCharArray();
				
				//Print the even position words using another loop
				for (int j = msg.length-1; j >=0; j--)
				{
					System.out.print( msg[j]);
					
				}
				System.out.print(" ");
			}
			else 
			{
				System.out.print(split[i]+" ");
			}
					
		}
	}
}

