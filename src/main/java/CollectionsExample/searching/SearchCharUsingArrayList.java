package CollectionsExample.searching;



	import java.util.ArrayList;
	import java.util.Scanner;
	public class SearchCharUsingArrayList {
	
	    public static void main(String[] args) {
	        // Create an ArrayList to store strings
	        ArrayList<String> stringList = new ArrayList<>();
	        
	        // Populate the ArrayList with strings
	        stringList.add("apple");
	        stringList.add("banana");
	        stringList.add("cherry");
	        stringList.add("date");
	        stringList.add("elderberry");
	        
	        // Print the ArrayList
	        System.out.println("ArrayList: " + stringList);
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter character to search in String ArrayList: ");
	       char ch =  sc.next().toLowerCase().charAt(0);
	       
	       // Perform Search
	       boolean found  = false;
	       for(String str : stringList) {
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

