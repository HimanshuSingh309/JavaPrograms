package CollectionsExample.searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchElementHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(33);
		set.add(33);
		set.add(43);
		set.add(45);
		set.add(50);
		set.add(60);
		
		System.out.println(set);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to search: ");
		int elementToSearch = sc.nextInt();
		
		boolean flag = false;
		for(int i = 0; i<set.size(); i++) {
			if(set.contains(elementToSearch)) {
				flag = true;
				System.out.println("element found: " + elementToSearch);
				break;
			}
		}
		if(!flag) {
			System.out.println("element not found.");
		}

	}

}
