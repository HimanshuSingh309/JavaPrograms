package may13practice;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 152;
		int reverse = 0;
		int rem = 0;
		
		int originalNum = num;
		
		while(num!=0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num/10;
		}
		
		if(reverse == originalNum ) {
			System.out.println("Given num is palindrom: " + originalNum);
		}
		else
			System.out.println("Given num is not  palindrom: " + originalNum);

	}

}
