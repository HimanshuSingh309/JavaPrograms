package searchingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchUsingHashMap {
	// I need to find the price of the fruits
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 150);
		map.put("Banana", 80);
		map.put("Mango", 90);
		map.put("Orange", 60);
		map.put("Graps", 110);
		
		System.out.println("Given Map is: " + map);
		
		// Take the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fruite name: ");
		String fruitName = sc.next();
		
		//Perform Search
		boolean found = false;
		for(String keyValue : map.keySet()) {
			if(keyValue.equalsIgnoreCase(fruitName)) {
				
				found = true;
				int price = map.get(keyValue);
				System.out.println("Price of the " + fruitName + " is " + price + " rs.");
			}
		}
		if(!found) {
			System.out.println("Fruite is not available: " + fruitName);
		}
		
		

	}

}
