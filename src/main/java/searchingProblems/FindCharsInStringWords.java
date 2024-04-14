package searchingProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindCharsInStringWords {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		String [] arr = str.split(" ");
		
		Set<String> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter character to search: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		//perform Search
		boolean found = false;
		for(String str1 : set) {
			if(str1.toLowerCase().contains(String.valueOf(ch))) {
				found = true;
				System.out.println("Character found in word: " + str1 );
				
			}
			
		}
		if(!found) {
			System.out.println("Character not found in any word: ");
		}
	}

}
