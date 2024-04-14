package JavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int num = 323;
		int OriginalNum = num;
		int rem = 0;
		int reverse = 0;
		
		while(OriginalNum!=0) {
			
			rem = OriginalNum%10;
			reverse = reverse*10 + rem;
			OriginalNum = OriginalNum/10;
		}
		if(num==reverse) {
			System.out.println("Given number is palindrome: " + reverse);
		}
		else
			System.out.println("Given number is not palindrome: " + reverse);

	}

}
