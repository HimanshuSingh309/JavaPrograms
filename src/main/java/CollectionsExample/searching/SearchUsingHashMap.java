package CollectionsExample.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchUsingHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Himanshu");
		map.put(104, "amrit");
		map.put(102, "Ramakant");
		map.put(103, "Mayank");
		map.put(106, "Manish");
		map.put(109, "Ankur");
		map.put(108, "Himanshu");
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key to fetch the value: ");
		int searchKey = sc.nextInt();
		
		//Perform Search
		if(map.containsKey(searchKey)) {
			
			String emp = map.get(searchKey);
			System.out.println("Value of the Key is: " + emp);
		}
		else
			System.out.println("Value of the Key is not found.");
			

	}

}
