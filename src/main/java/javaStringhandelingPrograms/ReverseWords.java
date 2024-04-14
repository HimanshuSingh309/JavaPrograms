package javaStringhandelingPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "I am from Noida";
		String str1[] = str.split(" ");
		System.out.println(str1.length);
		
		for(int i = str1.length-1; i>=0; i--) {
			System.out.print(str1[i] + " ");
		}

	}

}
