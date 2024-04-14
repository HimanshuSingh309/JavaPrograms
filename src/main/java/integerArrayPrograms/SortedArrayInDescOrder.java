package integerArrayPrograms;

public class SortedArrayInDescOrder {

	public static void main(String[] args) {
		int arr1[] = {12,1,7,4,19,15,17};
		System.out.print("Original Array is: ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			if(i<arr1.length-1) {
				System.out.print(",");
			}

	}
		int temp = 0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i]>arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array in Desc order : ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			if(i<arr1.length-1) {
				System.out.print(",");
			}
		}


	}

}
