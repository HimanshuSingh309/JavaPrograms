package CollectionsExample.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingHashSetDesc {

	public static void main(String[] args) {
		
		Set<Integer> myHashSet = new HashSet<>();
		myHashSet.add(14);
		myHashSet.add(55);
		myHashSet.add(34);
		myHashSet.add(44);
		myHashSet.add(11);
		
		System.out.println(myHashSet);
		
		System.out.println("Sorted HashSet in Reverse order: " + sortMyHashSet(myHashSet));

	}
	
	public static List<Integer> sortMyHashSet (Set<Integer> hashSet){
		
		List<Integer> sortedList = new ArrayList<>(hashSet);
		
		Collections.sort(sortedList, Collections.reverseOrder());
		
		return sortedList;
	}

}
