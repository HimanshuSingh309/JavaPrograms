package stringManipulationPractice;

public class ReverseStringCharsWithoutSpace {

	public static void main(String[] args) {
		String str = "Himanshu Thakur";
		
		System.out.print("Reverse String without Space: ");
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {
				System.out.print(str.charAt(i));
			}
		}

	}

}
