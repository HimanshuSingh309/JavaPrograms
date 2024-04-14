package intArrayPractice;

public class MultipleMissingNumbers {

	public static void main(String[] args) {
		int [] arr = {3,6,12,15,21,24,27,33,42};
		int diff1 = 0;
		int diff2 = 0;
		int actualDiff = 0;
		int temp = 0;
		int missingNum = 0;
		for(int i = 0; i<arr.length-2;i++) {
			diff1 = arr[i+1]-arr[i];
			diff2 = arr[i+2]-arr[i+1];
			if(diff1==diff2) {
				actualDiff = diff2;
				System.out.println("Actual difference between each number: " + actualDiff);
				break;
			}
		}
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i] !=actualDiff && arr[i+1]-arr[i] !=0) {
				temp  =arr[i+1]-arr[i];
				missingNum = arr[i];
				
			}
			while(temp>actualDiff) {
				missingNum = missingNum + actualDiff;
				System.out.println(missingNum + " ");
				temp = temp-actualDiff;
			}
		}

	}

}
