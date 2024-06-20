package may13practice;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num = 373;
		int originalNum = num;
		int rem = 0;
		int result = 0;
		
		while(num != 0) {
			rem = num%10;
			result += Math.pow(rem, 3);
			num = num/10;
		}
		
		if(originalNum == result) {
			System.out.println("Given number is Armstrong: " + originalNum);
		}
		else
			System.out.println("Given number is not Armstrong: " + originalNum);

	}

}
