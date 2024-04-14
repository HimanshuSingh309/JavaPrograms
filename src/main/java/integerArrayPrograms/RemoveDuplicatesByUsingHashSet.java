package integerArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesByUsingHashSet {

	public static void main(String[] args) {
		int[] arr = {7,4,2,9,5,2,7,4};
		boolean comma = false;
		Set<Integer> st = new HashSet<>();
		for(int i = 0; i<arr.length; i++) {
			st.add(arr[i]);
		}
		
		for(int num: st) {
			if(comma) {
				System.out.print(",");
			}
			System.out.print(num);
			comma = true;
		}
		

	}

}
