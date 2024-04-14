package CollectionsExample.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchStringUsingHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Banana", 50);
		map.put("Orange", 70);
		map.put("Graps", 90);
		map.put("Apple", 150);
		map.put("Cherry", 180);
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key to fetch the value: ");
		String searchKey = sc.next();
		
		//Perform Search
		boolean found = false;
		for(String key : map.keySet()) 
		{
		if(key.toLowerCase().equalsIgnoreCase(searchKey)) 
		{	
			found = true;
			int price = map.get(key);
			System.out.println("Price of the " +searchKey + " is: " + price);			
			break;
		}

	}
	if(!found) {
		System.out.println("Fruit not found.");
	}
  }
}
