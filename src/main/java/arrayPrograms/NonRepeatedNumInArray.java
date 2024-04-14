package arrayPrograms;

public class NonRepeatedNumInArray {

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
		
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
			count=0;
		}

	}

}
