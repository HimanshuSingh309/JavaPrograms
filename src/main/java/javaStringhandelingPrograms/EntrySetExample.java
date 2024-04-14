package javaStringhandelingPrograms;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {

	public static void main(String[] args) {
		
		Map<Integer, String> ludoMap = new HashMap<>();
		ludoMap.put(120, "Himanshu");
		ludoMap.put(102, "Manish");
		ludoMap.put(110, "Ankur");
		ludoMap.put(112, "Ramakant");
		ludoMap.put(105, "Amrit");
		ludoMap.put(103, "Ankur");
		
		System.out.println(ludoMap);
		
		System.out.println("Ludo group members id & name: ");
		for(Map.Entry<Integer, String> entry :ludoMap.entrySet() ) {
			
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println( key + ": " + value);
			
		}
		

	}

}
