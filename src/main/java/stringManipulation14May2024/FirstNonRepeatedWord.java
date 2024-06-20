package stringManipulation14May2024;

public class FirstNonRepeatedWord {

	public static void main(String[] args) {
		String str = "This is a first  to word   find the first non-repeated is a to  find non-repeated this word sentence";
		str = str.replaceAll("\\s+", " ").trim();
		String [] str1 = str.toLowerCase().split(" ");
		int count = 1;
		for(int i = 0; i<=str1.length-1; i++) {
			for(int j = i+1; j<=str1.length-1; j++) {
				if(str1[i].equalsIgnoreCase(str1[j])) {
					count++;
					str1[j]="_";
				}
			}
			if(count==1 && str1[i]!="_") {
				System.out.println("First Non Repeated Word is: " + str1[i]);
				break;
			}
			count=1;
		}

	}

}
