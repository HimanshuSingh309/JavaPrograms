package javaStringhandelingPrograms;

import java.util.HashMap;
import java.util.Map;

public class SearchKeyInHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> ludoGroup = new HashMap<>();
		ludoGroup.put(101, "Himanshu");
		ludoGroup.put(102, "Amrit");
		ludoGroup.put(103, "Manish");
		ludoGroup.put(104, "Ramakant");
		ludoGroup.put(105, "Ankur");
		
		System.out.println(ludoGroup);
		
		// Check if the HashMap contains a specific Key
		
		int searchKey = 107;
		String searchValue = "Kalua";
		if(ludoGroup.containsKey(searchKey)) {
			System.out.println("Kalua is mentally fit : " + searchKey);
		}
		else {
			System.out.println("Kalua is in DND mode: " + searchKey);
		}
		
		if(ludoGroup.containsValue(searchValue)) {
			System.out.println("Kalua is present in group." + searchValue);
		}
		else
			System.out.println("Kalua is not present in group: " + searchValue);
			

	}

}
