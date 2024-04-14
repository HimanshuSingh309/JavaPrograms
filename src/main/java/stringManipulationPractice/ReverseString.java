package stringManipulationPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "my name is himanshu what is yours";
		String [] str1 = str.split(" ");
		for(int i = str1.length-1; i>=0;i--) {
			System.out.print(str1[i] + " ");
			
			
		}

	}

}
