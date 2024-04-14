package sortingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortingHashSetDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<>();
		hs.add(55);
		hs.add(45);
		hs.add(65);
		hs.add(27);
		hs.add(29);
		hs.add(78);
		
		System.out.println("Given HashSet List: "+hs);
		
		// Convert HashSet into ArrayList
		ArrayList<Integer> al = new ArrayList<>(hs);
		// Perform Sorting
		 Collections.sort(al, Collections.reverseOrder());
		 
		 // Print the sorted arrayList
		 System.out.println("Sorted List in Desc: " + al);

	}

}
