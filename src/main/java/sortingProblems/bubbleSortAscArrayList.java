package sortingProblems;

import java.util.ArrayList;
import java.util.List;

public class bubbleSortAscArrayList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(55);
		al.add(45);
		al.add(65);
		al.add(27);
		al.add(21);
		
		System.out.println("Given ArrayList values: " + al);
		int temp = 0;
		for(int i = 0; i<al.size(); i++) {
			for(int j = i+1; j<al.size(); j++) {
				if(al.get(i)>al.get(j)) {
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println("Sorted ArayList values: " + al);

	}

}
