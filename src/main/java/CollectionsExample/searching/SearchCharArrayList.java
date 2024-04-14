package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchCharArrayList {

	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('e');
		charList.add('i');
		charList.add('o');
		charList.add('u');
		
		System.out.println(charList);
		
		// Take the input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to search: ");
		char characterToSearch = sc.next().charAt(0);
		
		boolean found = false;
		for(char ch : charList) {
			if(ch == Character.toLowerCase(characterToSearch)) {
				found = true;
				System.out.println("Character found: " + characterToSearch);
			}
		}
		if(!found) {
			System.out.println("Character not found.");
		}

	}

}
