package javaStringhandelingPrograms;

public class ReverseStringDifferentWay {
	static String result = "";
	public static boolean handleNullInput(String input) {
		return input==null;       
    }

    public static String handleNoLoveInput(String input) {
    	if(!input.toLowerCase().contains("love")) {
    		
    	}
    	return "Input string does not contain 'love'.";
        
    }
	public static String reverseCharInWord(String word) {
		for(int i = word.length()-1; i>=0; i--) {
			result += word.charAt(i);
		}
		return result;
	}
	
	public static String reverseString(String inputString) {
		String [] str = inputString.split(" ");
		int len = str.length;
		String str1 = "";
		for(int i = 0; i<len; i++) {
			if(str[i].equalsIgnoreCase("Love")) {
				str1 += reverseCharInWord("love") + " ";
			}
			else
				str1 += str[i] + " ";
			
		}
		return str1;
	}
	
	public static void main(String[] args) {
		String inputString = "I love java coding";
		if(handleNullInput(inputString)) {
			System.out.println("Input String is null..");
		}
		else {
			if(!inputString.contains("love")) {
				String ExpectedStringWithoutLove = handleNoLoveInput(inputString);
				System.out.println(ExpectedStringWithoutLove);
				
			}
			else {
				String expectedString = reverseString(inputString);
			System.out.println(expectedString);
			}	
		}
		
		

	}

}
