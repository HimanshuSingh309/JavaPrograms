package javabasicprograms;

public class PalindromNumbersInRange {

	public static void main(String[] args) {
		for(int num = 100; num<=200; num++) {
		//int num = 151;
		int originalNum = num;
		int rem = 0;
		int reverse = 0;
		
		while(originalNum!=0) {
			rem = originalNum%10;
			reverse = reverse *10 + rem;
			originalNum = originalNum/10;
			
		}
		if(reverse == num) {
			System.out.print(num + ",");
		}

	}
	}
}
