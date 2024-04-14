package CollectionsExample.searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchStringWordHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
	       set.add("Himanshu");
	        set.add("Ankur");
	         set.add("amrit");
	          set.add("Manish");
	           set.add("Ramakant");
	           
	           Scanner sc = new Scanner(System.in);
	           System.out.println("Enter word to search: ");
	           String wordToSearch =  sc.next();
	           
	           boolean flag = false;
	           for(String word : set){
	               if(word.toLowerCase().equalsIgnoreCase(wordToSearch)){
	                   flag = true;
	                   System.out.println("Word found: " + wordToSearch);
	                   break;
	               }
	           }
	           if(!flag){
	               System.out.println("Word not found");
	           }

	}

}
