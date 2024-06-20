package june17practiceCollectionsSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordInArrayList {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");
        stringList.add("date");
        
        System.out.println(stringList);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to Search:");
        String wordToSearch = sc.next();
        
        boolean found = false;
        int count = 0;
        for(String wordList : stringList) {
        	if(wordList.equalsIgnoreCase(wordToSearch)) {
        		found = true;
        		count++;
        		
        	}
        	
        }
        
        if(found) {
        System.out.println("Word found " + count + " times.");
        }
        
        else
        	System.out.println("Word not found");
        

	}

}
