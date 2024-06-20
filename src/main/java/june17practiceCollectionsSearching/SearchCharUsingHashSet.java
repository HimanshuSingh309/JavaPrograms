package june17practiceCollectionsSearching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchCharUsingHashSet {

	public static void main(String[] args) {
		Set<Character> ch = new HashSet<>();
		ch.add('a');
		ch.add('e');
		ch.add('i');
		ch.add('o');
		ch.add('u');
		ch.add('a');
		
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to be search:");
		char charToSearch = sc.next().charAt(0);
		boolean found = false;
		for(char chList : ch) {
			if(chList == Character.toLowerCase(charToSearch)) {
				found = true;
				System.out.println("Char element found: " + charToSearch);
				break;
			}
		}
		if(!found) {
			System.out.println("Char element not found: " + charToSearch);
		}

	}

}
