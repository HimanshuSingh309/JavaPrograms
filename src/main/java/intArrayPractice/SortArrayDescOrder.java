package intArrayPractice;

public class SortArrayDescOrder {

	public static void main(String[] args) {
		int [] arr1 = {5,1,56,34,78,12,9};
		int temp = 0;
		for(int i = 0; i<arr1.length;i++) 
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Printing Sorting array in Desc:");
		
		for(int i =0; i<arr1.length;i++) {
			for(int j = i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
		for(int i = 0; i<arr1.length;i++) 
		{
			System.out.print(arr1[i] + " ");
		}

	}

}
