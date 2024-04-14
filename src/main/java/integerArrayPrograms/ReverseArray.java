package integerArrayPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		if(arr.length==0 || arr==null) {
			System.out.println("Array is empty.");
		}
		else {
		System.out.print("Original Array values are: ");
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.print("Reverse Array values are: ");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
			if(i>0) {
				System.out.print(",");
			}
		}

	}

}
}
