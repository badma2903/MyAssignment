package assignments.week1.day2;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int input = 121;
		int remain = 0;
	
		for(int i= input; i>0; i=i/10 )
		{
			remain=(remain*10+i%10);
				
		}
		
		System.out.println(remain);
		
		int output = remain;
		if(input==output) 
			{
				System.out.println("It is a palindrome number");
			}
			
	}
		

}

	



