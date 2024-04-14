package CollectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		Map<Integer, String> sortedMap = new HashMap<>();
		sortedMap.put(105, "Kalua");
		sortedMap.put(101, "Amrit");
		sortedMap.put(102, "Himanshu");
		sortedMap.put(112, "Manish");
		sortedMap.put(110, "Ankur");
		
		System.out.println(sortedMap);
		
		// Sort the HashMap by keys in Asc order
		Map<Integer, String> treeMap = new TreeMap<>(sortedMap);
		
		// Sort the HashMap based on Keys
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	}

}
