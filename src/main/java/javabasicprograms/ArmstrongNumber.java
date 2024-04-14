package javabasicprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		int rem = 0;
		int originalNum = num;
		int result = 0;
		
		while(num!=0) {
			rem = num%10;
			result +=  Math.pow(rem, 3);
			num = num/10;
		}
		if(originalNum==result) {
			System.out.println("Given number is Armstrong number. " + originalNum);
		}
		else
			System.out.println("Given number is not Armstrong number. " + originalNum);
			

	}

}
