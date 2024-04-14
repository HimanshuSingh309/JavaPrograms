package javabasicprograms;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 151;
		int rem = 0;
		int reverse = 0;
		int originalNum = num;
		
		while(num!=0) {
			
			rem = num%10; //1,5,1
			reverse = reverse * 10 + rem; //1, 15, 151
			num = num/10; //15,1,0
			
		}
		if (originalNum==reverse) {
			System.out.println("Given Num is Palindrom. " + originalNum);
		}
		else
			System.out.println("Given Num is not Palindrom. " + originalNum);

	}

}
