package arrayPrograms;

public class MultipleMissingNumInArray {

	public static void main(String[] args) {
		int [] arr = {2,6,8,10,14,18,22,24,32};
		int diff1 = 0;
		int diff2 = 0;
		int actualDiff = 0;
		int no = 0;
		int temp = 0;
		
		for(int i = 0; i<arr.length-2;i++) {
			diff1 = arr[i+1]-arr[i];
			diff2 = arr[i+2]-arr[i+1];
			if(diff1==diff2) {
				actualDiff = diff2;
				System.out.println("Difference between each num is:---> " + actualDiff);
				break;
			}		
			
		}
		System.out.println();
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i+1]-arr[i] != actualDiff && arr[i+1]-arr[i] != 0) {
				no = arr[i];  //2
				temp = arr[i+1]-arr[i];  // 6 - 2 = 4
				while(temp > actualDiff) {
					no = no + actualDiff;
					temp = temp - actualDiff;  // 4 - 2  = 2
					System.out.println(no);   
				}
			}
		}

	}

}
