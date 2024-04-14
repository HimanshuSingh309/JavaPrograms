package integerArrayPrograms;

public class FindDuplicatesAndOccurence {

	public static void main(String[] args) {
		int[] arr = {7,4,2,9,5,2,7,4,12,7};
		int count = 1;
		System.out.print("Original Array is:---> ");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j] = '_';
					count++;
				}
			}
			if(count>1 && arr[i]!='_') {
				System.out.println(arr[i] + " ---> " + count);
			}
			count=1;
		}

	}

}
