package stringManipulationPractice;

public class ReverseStringWithCharReverse {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
