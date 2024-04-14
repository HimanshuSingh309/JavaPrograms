package stringManipulation;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "I am from india";
		String arr [] = str.split(" ");
		System.out.println(arr.length);
		String str1 = "";
		
		for(int i = arr.length-1; i>=0;i--) {
			str1 = str1 + arr[i] + " ";
			
		}
		System.out.println(str1);

	}

}
