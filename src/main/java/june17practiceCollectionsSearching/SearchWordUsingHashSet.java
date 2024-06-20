package june17practiceCollectionsSearching;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchWordUsingHashSet {

	public static void main(String[] args) {
		Set<String> hsList = new HashSet<>();
		hsList.add("apple");
		hsList.add("banana");
		hsList.add("cherry");
		hsList.add("date");
		hsList.add("elderberry");
		hsList.add("date");
        
        System.out.println(hsList);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to Search:");
        String wordToSearch = sc.next();
        boolean found = false;
        for(String words : hsList) {
        	if(words.equalsIgnoreCase(wordToSearch)) {
        		found = true;
        		System.out.println("String word found: " + wordToSearch);
        		break;
        	}
        }
        if(!found) {
        	System.out.println("String word not found: " + wordToSearch);
        }

	}

}
