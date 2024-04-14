package CollectionsExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapCustomeObjects {

	public static void main(String[] args) {
	        // Define a custom class
	        class Student {
	            int id;
	            String name;

	            public Student(int id, String name) {
	                this.id = id;
	                this.name = name;
	            }

	            public int getId() {
	                return id;
	            }

	            public String getName() {
	                return name;
	            }
	        }

	        // Create a HashMap of custom objects
	        Map<Integer, Student> map = new HashMap<>();
	        map.put(5, new Student(102, "Alice"));
	        map.put(1, new Student(101, "Bob"));
	        map.put(3, new Student(103, "Charlie"));

	        // Convert HashMap to ArrayList of Map.Entry
	        List<Map.Entry<Integer, Student>> list = new ArrayList<>(map.entrySet());

	        // Sort the ArrayList by custom field (e.g., student ID)
	        list.sort(Comparator.comparingInt(entry -> entry.getValue().getId()));

	        // Create a LinkedHashMap to maintain the insertion order
	        Map<Integer, Student> sortedMap = new LinkedHashMap<>();
	        for (Map.Entry<Integer, Student> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        // Print the sorted map
	        System.out.println("Sorted HashMap of Custom Objects by ID:");
	        for (Map.Entry<Integer, Student> entry : sortedMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue().getName());
	        }
	    }


	}
