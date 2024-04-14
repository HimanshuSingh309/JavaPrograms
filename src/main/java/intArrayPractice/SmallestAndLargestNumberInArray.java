package intArrayPractice;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 5, 9, 3, 6, 2, 3, 5, 8, 3, 6 };

		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Smallest Num: " + min);
		System.out.println("Largest Num: " + max);

	}

}
