package javaStringhandelingPrograms;

public class ReverseChars {

	public static void main(String[] args) {
		String str = "Himanshu";
		String str1 = "Thakur";
		char [] ch = str.toCharArray();
		int len = ch.length;
		
		for(int i = len-1; i>=0;i--) {
			
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i = str1.length()-1; i>=0;i--) {
			char ch1 = str1.charAt(i);
			System.out.print(ch1);
		}

	}

}
