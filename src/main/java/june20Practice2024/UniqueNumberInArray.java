package june20Practice2024;

public class UniqueNumberInArray {

	public static void main(String[] args) {
		// Find the unique numbers in given input array
		
		int [] arr = {6,3,3,5,5,6,2,1,1,7};
		int count  = 1;
		for(int i = 0; i<=arr.length-1; i++) {
			
			for(int j = i+1; j<=arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					arr[j] = ' ';
					count++;
				}
			}
			
			if(count==1 && arr[i]!=' ') {
				System.out.println(arr[i] +" ---> " + count);
		}
			count = 1;
		
		}

	}

}
