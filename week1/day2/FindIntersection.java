package week1.day2;

public class FindIntersection 
{
	public static void main(String[] args) 
	{
		int[] array_1 = {3,2,11,4,6,7};
		int[] array_2 = {1,2,8,4,9,7};
		
		for(int i=0;i<array_1.length;i++)
		{
			for(int j=0; j<array_2.length;j++)
			{
				if(array_1[i] == array_2[j])
				 {
					 System.out.println("The Intersection Elements are:"+array_2[j]);
				 }
			}
		}

	}

}
