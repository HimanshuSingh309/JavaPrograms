package interview;

public class HelloClass {

	public static void main(String[] args) {
		int [] arr = {3,3,8,3,6,7,8};
		int count = 0;
		
		System.out.print("Original int array: ---> ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.print("Resulted int array: ---> ");

		for(int i= 0 ; i<arr.length;i++) {
			
			for(int j = 0; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]);
			}
			count=0;
			
		}

	}

}
