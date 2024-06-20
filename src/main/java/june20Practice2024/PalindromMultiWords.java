package june20Practice2024;
public class PalindromMultiWords {
	public static void main(String[] args) {
		String[] words = { "racecar", "tenet", "nitin", "saket", "goog", "himanshu" };
		for (int i = 0; i <= words.length - 1; i++) {
			String str = words[i];
			String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
			String actString = cleanStr;
			String reverseStr = "";
			for (int j = cleanStr.length() - 1; j >= 0; j--) {
				reverseStr += cleanStr.charAt(j);
			}
			if (reverseStr.equalsIgnoreCase(actString)) {
				System.out.println("Given String is palindrom: " + actString);
			} else
				System.out.println("Given String is not palindrom: " + actString);

		}

	}
}
