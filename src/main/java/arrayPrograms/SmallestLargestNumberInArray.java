package arrayPrograms;

public class SmallestLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr1 = {7,4,2,9,5,8,3,6};
		System.out.print("Original Array is: ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			if(i<arr1.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		int min = arr1[0];
		int max = arr1[0];
		
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i]<min) {
				min = arr1[i];
			}
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		System.out.println("Min value of Array:---> " + min);
		System.out.println("Min value of Array:---> " + max);

	}


}
