package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(35);
		al.add(45);
		al.add(55);
		
		// print ArrayList
		System.out.println(al);
		
		// Get the input from user to search
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();
        
        // Perform the Search
        
        boolean flag = false;
        for(int i = 0; i<al.size(); i++) {
        	if(al.get(i)==elementToSearch) {
        		flag = true;
        		System.out.println("Element found at index: " + i + " and element is: " + elementToSearch);
        		break;
        		
        	}
        	
        }
        if(!flag) {
        	
        		System.out.println("Element not found: " + elementToSearch);
        }
		

	}

}
