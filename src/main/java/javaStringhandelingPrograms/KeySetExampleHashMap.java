package javaStringhandelingPrograms;

import java.util.HashMap;
import java.util.Map;

public class KeySetExampleHashMap {

	public static void main(String[] args) {
		// Creating a HashMap to store student IDs and their corresponding names
        Map<Integer, String> studentMap = new HashMap<>();

        // Adding some student details to the HashMap
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Using keySet() to iterate over keys and get corresponding values
        
        System.out.println("Iterating over keys using keySet():");
        
        for (Integer key : studentMap.keySet()) {
            String value = studentMap.get(key);
            System.out.println("Student ID: " + key + ", Name: " + value);
        }

	}

}
