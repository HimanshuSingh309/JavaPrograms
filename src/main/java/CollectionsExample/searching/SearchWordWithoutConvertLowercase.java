package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordWithoutConvertLowercase {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Himanshu");
		al.add("Amrit");
		al.add("Ankur");
		al.add("Manish");
		al.add("Mayank");
		System.out.println(al);
		
		//Take the input String from User
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the word to search");
		String wordToSearch = scanner.next();
		
		
		// Perform Search
		boolean flag = false;
		for(int i = 0; i< al.size(); i++) {
			if(al.get(i).equalsIgnoreCase(wordToSearch)) {
				flag = true;
				System.out.println("Word found at index " + i + " And word is: " + wordToSearch);
			}
		}
		if(!flag) {
			System.out.println("Word not found.");
		}


	}

}
