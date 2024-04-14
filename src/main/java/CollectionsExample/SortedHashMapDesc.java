package CollectionsExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMapDesc {

	public static void main(String[] args) {
		Map<Integer, String> sortedMap = new HashMap<>();
		sortedMap.put(105, "Kalua");
		sortedMap.put(101, "Amrit");
		sortedMap.put(102, "Himanshu");
		sortedMap.put(112, "Manish");
		sortedMap.put(110, "Ankur");
		
		System.out.println(sortedMap);
		
		// 
		Map<Integer, String> entryMap = new TreeMap<>(Collections.reverseOrder());
		entryMap.putAll(sortedMap);
		
		for(Map.Entry<Integer, String> entry :entryMap.entrySet() ) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
