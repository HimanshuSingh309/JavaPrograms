package integerArrayPrograms;

public class smallestAndLargestNumInArray {

	public static void main(String[] args) {
		int arr1[] = {12,1,7,4,19,15,17};
		System.out.print("Original Array is: ");
		for(int i = 0; i<arr1.length; i++) 
		{
			System.out.print(arr1[i]);
			if(i<arr1.length-1) 
			{
				System.out.print(",");
			}
		}
		System.out.println();
		int min = arr1[0];
		int max = arr1[0];
		for(int i = 0; i<arr1.length; i++) 
		{
			if(arr1[i]<min) {
				min = arr1[i];
			}
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		System.out.println("Smallest value of array: " + min);
		System.out.println("Largest value of array: " + max);
	}

}
