package june20Practice2024;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 151;
		int actNum = num;
		int reverse = 0;
		int rem = 0;
		while(num!=0) {
			rem = num%10; // 1,5, 1
			reverse = reverse*10 + rem; //1, 15, 151
			num = num/10; // 15, 1, 0			
		}		
		if(actNum==reverse) {			
			System.out.println("Given num is palindrom: " + actNum);
		} else
			System.out.println("Given num is not palindrom: " + actNum);
	}

}
