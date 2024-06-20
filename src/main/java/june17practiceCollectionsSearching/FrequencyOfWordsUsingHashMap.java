package june17practiceCollectionsSearching;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsUsingHashMap {

	public static void main(String[] args) {
		String str = "Noida is very good but Noida people are not good. But still I love noida.";
		
		String inputString = str.replace(".", "");
		System.out.println(inputString);
		String [] words = inputString.toLowerCase().split(" ");
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		for(String word : words) {
			if(word != " ") {
				frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
								
			}
		}
		
		for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			
			String ele = entry.getKey();
			int frequency = entry.getValue();
			if(frequency>1) {
				System.out.println(ele + " : " + frequency);
				
			}
			}
		

	}

}
