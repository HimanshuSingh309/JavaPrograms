package stringManipulation14May2024;

public class ReverseWordsAtSamePosition {

	public static void main(String[] args) {
		String str = "My name is Himanshu what is yours";
		String [] str1 = str.split(" ");
		
		for(int i = 0; i<=str1.length-1; i++) {
			char ch [] = str1[i].toCharArray();
			for(int j = ch.length-1; j>=0; j--) {
				char ch1 = ch[j];
				System.out.print(ch1);
			}
			System.out.print(" ");
		}

	}

}
