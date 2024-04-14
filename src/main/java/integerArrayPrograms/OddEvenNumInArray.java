package integerArrayPrograms;

public class OddEvenNumInArray {

	public static void main(String[] args) {
		int[] arr1 = {7,4,1,9,5,8,3,6};
		System.out.print("Original Array is: ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			if(i<arr1.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("Even Numbers are: ---> ");
		
		boolean comma = false;
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i]%2==0) {
				if(comma) {
					System.out.print(",");
				}
				System.out.print(arr1[i]);
				comma = true;
			}
			
				
		}
		System.out.println();
		System.out.println("Odd Numbers are: ---> ");

		boolean comma1 = false;
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i]%2!=0) {
				if(comma1) {
					System.out.print(",");
				}
				System.out.print(arr1[i]);
				comma1 = true;
			}
			
				
		}

	}

}
