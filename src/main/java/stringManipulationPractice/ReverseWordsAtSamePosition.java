package stringManipulationPractice;

public class ReverseWordsAtSamePosition {

	public static void main(String[] args) {
		String str = "my name is himanshu what is yours";
		String str1 [] = str.split(" ");
		
		System.out.println("Original String is: " + str);
		System.out.print("String after reverse: ");
		
		for(int i = 0; i<str1.length; i++) {
			  char[] ch = str1[i].toCharArray();
			
			for(int j = ch.length-1; j>=0; j-- ) {
					char ch1 = ch[j];
					System.out.print(ch1);
			}
			System.out.print(" ");
		}

	}

}
