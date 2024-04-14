package CollectionsExample.searching;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchCharInStringUsingHashSet {

	public static void main(String[] args) {
		// Create an ArrayList to store strings
        Set<String> setList = new HashSet<>();
        
        // Populate the ArrayList with strings
        setList.add("apple");
        setList.add("banana");
        setList.add("cherry");
        setList.add("date");
        setList.add("elderberry");
        
        // Print the ArrayList
        System.out.println("ArrayList: " + setList);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to search in String ArrayList: ");
       char ch =  sc.next().toLowerCase().charAt(0);
       
       // Perform Search
       boolean found  = false;
       for(String str : setList) {
    	   if(str.toLowerCase().contains(String.valueOf(ch))) {
    		   found = true;
    		   System.out.println("Character " + ch + " found in string " + str);
    		   
    	   }
       }
       if(!found) {
    	   System.out.println("Character " + ch + " is not found in any string. ");
       }

	}

}
