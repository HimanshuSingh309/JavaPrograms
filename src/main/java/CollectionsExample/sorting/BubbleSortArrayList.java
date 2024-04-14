package CollectionsExample.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortArrayList {

	public static void main(String[] args) {
		// Create an ArrayList of integers
		List<Integer> myList = new ArrayList<>();
		myList.add(45);
        myList.add(25);
        myList.add(55);
        myList.add(48);
        myList.add(15);
		// Print the original list
		System.out.println("Original list: " + myList);

		bubbleSort(myList);
		System.out.println(myList);

	}

	public static void bubbleSort(List<Integer> list) {
		
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < list.size(); i++) {
				
				if (list.get(i - 1) > list.get(i)) {

					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					swapped = true;
				}
				
			}
		}

	}
}


