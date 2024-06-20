package june17practiceCollectionsSearching;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharsUsingHashMap {

	public static void main(String[] args) {
		String str = "vshgdfsvdbxvcvzzz";
		String inputString = str.toLowerCase();
		System.out.println("Input String value is: " + inputString);
		
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char ch : inputString.toCharArray()) {
			if(ch != ' ') {
				frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:frequencyMap.entrySet()) {
			char ele = entry.getKey();
			int frequency = entry.getValue();
			if(frequency>1) {
			System.out.println(ele +" : " + frequency);
			}
			
		}

	}

}
