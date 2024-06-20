package june20Practice2024;

public class ReverseString {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		String arr[] = str.split(" ");
		
		for(int i = arr.length-1; i>=0; i--) {
			
			
			System.out.print(arr[i] + " ");
			
		}

	}

}
