package CollectionsExample.FrequencyWordsAndCharacters;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCharHashMap {

	public static void main(String[] args) {
		String str = "Himanshu Singh";
		str = str.toLowerCase();
		System.out.println("Words frequencies are: ");
		
		HashMap<Character, Integer> frequencyMap = frequencyChars(str);
		for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			
			if(value>1){
				System.out.println(key + ": " + value);
			}
		}
	}

	public static HashMap<Character, Integer>  frequencyChars(String str) {
		
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		
		for(char ch :charArray ) {
			if(ch==' ') {
				continue;
			}
			
			if(frequencyMap.containsKey(ch)) {
				frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
			}
			else
				frequencyMap.put(ch, 1);
			
		}
		return frequencyMap;

		
	}
	


}
