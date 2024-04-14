package javaStringhandelingPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsAndOccurenceHashMap 
{

	public static void main(String[] args) 
 {
		String str = "Noida is a good city and is a good very good noida good and well maintained";
		
		String [] words = str.split(" ");		
		Map<String, Integer > wordMap = new HashMap<>();
		
		for(String word: words) 
		{
			String lowercaseWord = word.toLowerCase();
			if(wordMap.containsKey(lowercaseWord)) 
			{
				wordMap.put(lowercaseWord, wordMap.get(lowercaseWord) +1 );
				
				
			}
			else 
			{
				wordMap.put(lowercaseWord, 1);
			}
		}
		System.out.println("Duplicate Words and Their Occurrences:");
		for (String word : wordMap.keySet()) 
		{
            if (wordMap.get(word) > 1) 
            {
                System.out.println(word + ": " + wordMap.get(word));
            }
        }

	}
}
