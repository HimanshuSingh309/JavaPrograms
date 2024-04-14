package intArrayPractice;

public class ReverseIntArray 
{

	public static void main(String[] args) 
	{
		int [] arr1 = {5,1,56,34,78,12,9};
		int count=0;
		for(int i = 0; i<arr1.length;i++) 
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Printing reverse array:");
		
		for(int i = arr1.length-1; i>=0; i--) 
		{
			
			if(count==0) 
			{
				System.out.print(arr1[i]);
				count++;
				
			}
		
			else {
			System.out.print(","+arr1[i]);}
			
			
				 }

	   }

}

