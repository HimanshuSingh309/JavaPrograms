package javaStringhandelingPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceEachWordUsingHashMap {

	public static void main(String[] args) {
		String str = "This is a sample sentence with some words and some more Words";
		String [] words = str.split(" ");
		
		Map<String, Integer> wordmapCount = new HashMap<>();
		for(String word: words) {
			String lowercaseWord = word.toLowerCase();
			if(wordmapCount.containsKey(lowercaseWord)) {
				wordmapCount.put(lowercaseWord,wordmapCount.get(lowercaseWord)+1 );
				
			}
			else
				wordmapCount.put(lowercaseWord, 1);
					
		}
		System.out.println("Print words count: ");
		for(Map.Entry<String, Integer> entry : wordmapCount.entrySet()) {
			if(entry.getValue()>1) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			}
			
		}

	}

}
