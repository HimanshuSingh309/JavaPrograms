package june17practiceCollectionsSearching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchStringUsingHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("banana", 70);
		map.put("apple", 150);
		map.put("orange", 90);
		map.put("graps", 120);
		map.put("watermelon", 80);
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name to search the price: ");
		String fruitName = sc.next().toLowerCase();
		
		if(map.containsKey(fruitName)) {
			int fruitPrice = map.get(fruitName);
			System.out.println("Price of the " + fruitName + " is " + fruitPrice);
		}
		else
			System.out.println("Fruit is not available in the stock.");

	}

}
