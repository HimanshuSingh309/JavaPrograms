package integerArrayPrograms;

public class CopyOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int arr2[]= new int[arr1.length];
		
		for(int i = 0; i<=arr1.length-1;i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i<=arr2.length-1;i++) {
			System.out.print(arr2[i]);
			if(i<arr2.length-1) {
				System.out.print(",");
			}
		}

	}

}
