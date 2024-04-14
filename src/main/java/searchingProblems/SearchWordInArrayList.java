package searchingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordInArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Himanshu");
		al.add("Amrit");
		al.add("Manish");
		al.add("Ankur");
		al.add("Ramakant");
		al.add("Mayank");
		
		System.out.println("Given ArrayList is: " + al);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to search: ");
		String wordToSearch = sc.next();
		boolean found = false;
		
		// Perform Search for a String word in ArrayList
		for(int i = 0; i<al.size(); i++) {
			if(al.get(i).equalsIgnoreCase(wordToSearch)) {
				found = true;
				System.out.println("Word found: " + wordToSearch);
				break;
			}
			
		}
		if(!found) {
			System.out.println("Word not found: " + wordToSearch);
		}

	}

}
