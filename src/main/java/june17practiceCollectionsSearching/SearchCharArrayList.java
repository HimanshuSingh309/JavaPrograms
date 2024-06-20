package june17practiceCollectionsSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchCharArrayList {
	public static void main(String [] args) {
	
	List<Character> charList = new ArrayList<>();
	charList.add('a');
	charList.add('b');
	charList.add('c');
	charList.add('d');
	charList.add('e');
	
	System.out.println(charList);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character to search: ");
	char CharacterToSearch = sc.next().charAt(0);
	
	boolean found = false;
	for(char ch : charList) {
		if(ch == Character.toLowerCase(CharacterToSearch)) {
			found = true;
			System.out.println("Character found.");
			break;
		}
		
			
	}
	if(!found)
		System.out.println("Character not found.");
 }
}
