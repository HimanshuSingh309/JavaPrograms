package javaStringhandelingPrograms;

public class ReverseStringWordAtSameIndex {

	public static void main(String[] args) {
		String str = "Himanshu Singh Thakur";
		System.out.println("Original String: " + str);
	      System.out.print("Reverse String: ");
	      reversewordsAtSameIndex(str);

	}

	public static void reverseCharacter(String str) {
		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			char ch1 = ch[i];
			if (ch[i] != ' ') {
				System.out.print(ch1);
			}
		}
	}
	
	public static void reversewordsAtSameIndex(String str) {
		
		String str1[] = str.split(" ");
		
		for(int i = 0; i<=str1.length-1; i++) {
			reverseCharacter(str1[i]);
			System.out.print(" ");
		}
	}
	
	

}
