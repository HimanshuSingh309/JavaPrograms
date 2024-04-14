package CollectionsExample.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortNewArrayList {

	public static void main(String[] args) {
		// Create an ArrayList of integers
				List<Integer> numbers = new ArrayList<>();
				numbers.add(5);
				numbers.add(2);
				numbers.add(8);
				numbers.add(1);
				numbers.add(9);

				// Print the original list
				System.out.println("Original list: " + numbers);
				
				bubbleSort(numbers);
				
				System.out.println("Sorted list: " + numbers);

	}
	
	public static void bubbleSort(List<Integer> list) {
		int temp  =0;
		for(int i = 0; i<list.size(); i++) {
			for(int j = 0; j<list.size(); j++) {
				if(list.get(i)<list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

}
