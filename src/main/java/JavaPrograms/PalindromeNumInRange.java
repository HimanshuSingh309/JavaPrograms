package JavaPrograms;

public class PalindromeNumInRange {

	public static void main(String[] args) {
		int limit = 1000;
		
		for(int num = 1; num<=limit; num++) {
		int originalNum = num;
		int rem = 0;
		int reverse = 0;
		
		while(originalNum!=0) {
			
			rem = originalNum%10;
			reverse = reverse*10 + rem;
			originalNum = originalNum/10;
		}
		if(num==reverse) {
			System.out.println("Given number is palindrome: " + reverse);

		}
		
		}
	}

}
