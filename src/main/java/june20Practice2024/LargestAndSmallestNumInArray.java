package june20Practice2024;

public class LargestAndSmallestNumInArray {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 5, 9, 31, 6, 21, 32, 5, 8, 37, 6,23 };
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Smallest number: " + min);
		System.out.println("Largest number: " + max);

	}

}
