package stringManipulation14May2024;

public class ReverseString {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		System.out.println(str.length());
		
		// Reverse the words char with space
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		// Reverse the words char without space
		System.out.println();
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i)!=' ') {
			System.out.print(str.charAt(i));
			}
		}
		
		// Reverse the words with space
		System.out.println();
		String str1 [] = str.split(" ");
		for(int i = str1.length-1; i>=0; i--) {
			String str2 = str1[i];
			System.out.print(str2 +" ");
		}
	}

}
