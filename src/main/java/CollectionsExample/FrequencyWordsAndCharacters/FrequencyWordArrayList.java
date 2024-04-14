package CollectionsExample.FrequencyWordsAndCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyWordArrayList {

	public static void main(String[] args) {
		String str = "Noida is a good city and is a good very good noida good and noida is well maintained good";
		System.out.println("Words frequencies are: ");
		
		HashMap<String, Integer> frequencyMap = frequencyWords(str);
		for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(value>1){
				System.out.println(key + ": " + value);
			}
		}
	}

	public static HashMap<String, Integer>  frequencyWords(String str) {

		String[] words = str.split("\\s+");

		// Create an ArrayList

		List<String> uniqueWords = new ArrayList<>();

		// Create A HashMap

		HashMap<String, Integer> frequencyMap = new HashMap<>();

		// Iterate through each word

		for (String word : words) {
			word = word.toLowerCase();
			
			if(!uniqueWords.contains(word)) {
				uniqueWords.add(word);
				
			}
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);

		}
		return frequencyMap;
	}

}
