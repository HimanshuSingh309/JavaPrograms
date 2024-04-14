package arrayPrograms;

public class FindDuplicatesAndOccurence {

	public static void main(String[] args) {
		int[] arr = {7,4,2,9,5,2,7,4,12,7};
		System.out.print("Original Array is: ---> ");
		boolean comma = false;
		for(int i = 0; i<arr.length; i++) {
			if(comma) {
				System.out.print(",");
			}
			System.out.print(arr[i]);
			comma= true;
		}
		System.out.println();
		System.out.println("Duplicate values and occurences: ---> ");
		int count = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j] = '_';
					count++;
				}
			}
			if(count>1 && arr[i]!='_') {
				System.out.println(arr[i] + " --- " + count);
			}
			count = 1;
		}

	}

}
