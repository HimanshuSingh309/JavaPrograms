package CollectionsExample.FrequencyWordsAndCharacters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingHashSet {

	public static void main(String[] args) {
		
		Set<Integer> myHashSet = new HashSet<>();
		myHashSet.add(45);
		myHashSet.add(25);
		myHashSet.add(35);
		myHashSet.add(18);
		myHashSet.add(50);
		myHashSet.add(48);
		
		System.out.println(myHashSet);
		
		// Call the function to sort the hashset
		System.out.println("Sorted HashSet: " + sortHashSet(myHashSet)); 
		

	}
	public static List<Integer> sortHashSet(Set<Integer> myHashSet) {
		// Convert the HashSet to the ArrayList
		
		List<Integer> sortedList = new ArrayList<>(myHashSet);
		
		// Sort the list
		Collections.sort(sortedList);
		
		
		return sortedList;
	}

}
