package intArrayPractice;

public class NonRepeatedNumbersInArray {

	public static void main(String[] args) {
		int [] arr = {1,1,5,9,3,6,2,3,5,8,3,6};
		int count = 1;
		System.out.println("Original Array:");
		for(int i = 0; i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("New Array after removing duplicates: ");
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j] = ' ';
				}
			}
			if(count==1 && arr[i]!=' ') {
				System.out.println(arr[i] + "____----- " + count);
		}
			count=1;
		
			
		}

	}

}
