package CollectionsExample.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortingUsingLinkedHashMap {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 10);
		map.put("banana", 5);
		map.put("orange", 8);
		map.put("grapes", 3);

		System.out.println(map);
		LinkedHashMap<String, Integer> sortByKeys = sortByKey(map);
		
		System.out.println("Sort By Key: " + sortByKeys);
		
		LinkedHashMap<String, Integer> sortByValues = sortByValue(map);
		System.out.println("Sort By Value: " + sortByValues);
	}

	public static LinkedHashMap<String, Integer> sortByKey(HashMap<String, Integer> map) {
		
		// Create a list from the entries of the HashMap
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		// Sort the list based on keys
		list.sort(Map.Entry.comparingByKey());

		// Create a new LinkedHashMap to store the sorted entries
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());

		}
		return sortedMap;
	}
	
	public static LinkedHashMap<String, Integer>  sortByValue(HashMap<String, Integer> map) {		
		// Create a list from the entries of the HashMap
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		// Sort the list based on keys
		list.sort(Map.Entry.comparingByValue());

		// Create a new LinkedHashMap to store the sorted entries
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());

		}
		return sortedMap;
	}

}
