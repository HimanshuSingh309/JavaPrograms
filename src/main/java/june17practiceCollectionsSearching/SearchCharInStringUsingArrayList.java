package june17practiceCollectionsSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchCharInStringUsingArrayList {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");
        
        System.out.println(stringList);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character to search.");
        char ch = sc.next().toLowerCase().charAt(0);
        
        boolean found = false;
        for(String str : stringList) {
        	
        	if(str.toLowerCase().contains(String.valueOf(ch))){
        		found = true;
        		System.out.println("Character " + ch + " found in string: " + str);
        	}
        }
        if(!found) {
        	System.out.println("Character not found in any string");
        }

	}

}

