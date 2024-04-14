package intArrayPractice;

public class CopyOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		int [] arr1 = {5,1,56,34,78,12,9};
		int [] newArray = new int [arr1.length];
		int temp = 0;
		System.out.println("Original Array:");
		for(int i = 0; i<arr1.length;i++) 
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("New Array:");
		for(int i = 0; i<arr1.length;i++) {
			newArray[i]=arr1[i];
			System.out.print(newArray[i] +" ");
		}

	}

}
