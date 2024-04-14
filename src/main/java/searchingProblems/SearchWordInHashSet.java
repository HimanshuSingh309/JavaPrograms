package searchingProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchWordInHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Himanshu");
		set.add("anKur");
		set.add("Amrit");
		set.add("Ramakant");
		set.add("Manish");
		
		System.out.println("Given HashSet is: " + set);
		
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to search: ");
		String wordToSearch = sc.next().toLowerCase();
		
		//Perform Search
		boolean found = false;
			for(String word : set) {
				if(word.equalsIgnoreCase(wordToSearch)) {
					System.out.println("Word found: " + wordToSearch);
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("Word not found: " + wordToSearch);
			}
		

	}

}
