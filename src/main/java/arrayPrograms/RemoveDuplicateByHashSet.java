package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateByHashSet {

	public static void main(String[] args) {
		int[] arr1 = {7,4,2,9,5,2,7,4};
		boolean comma = false;
		
		Set<Integer> st = new HashSet<>();
		for(int i = 0; i<arr1.length; i++) {
			st.add(arr1[i]);
		}
		for(int num : st) {
			if(comma) {
			System.out.print(",");
		}
			System.out.print(num);
			comma = true;
		}
	}

}
