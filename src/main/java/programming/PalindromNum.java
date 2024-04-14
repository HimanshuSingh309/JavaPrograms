package programming;

public class PalindromNum {

	public static void main(String[] args) {
		int num = 323;
		int originalNum = num;
		int rem = 0;
		int reverse = 0;
		while(num!=0) {
			
			rem = num%10; // 3, 2, 3
			reverse = reverse*10 + rem; // 0 * 10 + 3 = 3, 32, 323
			num = num/10; // 32, 3, 0
		}
		System.out.println(reverse);
		if(originalNum==reverse) {
			System.out.println("Given number is palindrom: " + originalNum);
		}
		else
			System.out.println("Given number is not palindrom: " + originalNum);
		

	}

}
