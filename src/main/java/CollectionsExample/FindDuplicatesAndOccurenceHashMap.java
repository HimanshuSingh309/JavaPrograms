package CollectionsExample;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesAndOccurenceHashMap {

	public static void main(String[] args) {
		String str = "Noida is a good city and is a good very good noida good and well maintained";
		String [] words = str.split(" ");
		
		//Create a HashMap
		Map<String, Integer> wordsCountMap = new HashMap<>();
		
		for(String word : words) {
			
			String lowerCaseWords = word.toLowerCase();
			if(wordsCountMap.containsKey(lowerCaseWords)) {
				wordsCountMap.put(lowerCaseWords, wordsCountMap.get(lowerCaseWords)+1);
			}
			else
				wordsCountMap.put(lowerCaseWords, 1);
		}
		System.out.println("Duplicates & occurences are: ");
		for(Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			if(entry.getValue()>1) {
				System.out.println(key +": " + value);
			}
		}

	}

}
