package june20Practice2024;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal, Panama.,999";
		//String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
		String cleanStr = str.replaceAll("[,\\.\\s\\d]", "");
		String actString = cleanStr;
		
		
		String reverseStr = "";
		for(int i = cleanStr.length()-1; i>=0;i--) {
			 reverseStr += cleanStr.charAt(i);
		}
		if(reverseStr.equalsIgnoreCase(actString)) {
			System.out.println("Given String is palindrom: " + actString);
		}
		else
			System.out.println("Given String is not palindrom: " + actString);
		

	}

}
