package ProgramsPractice;

public class GivenNumIsPalindromOrNot {

	public static void main(String[] args) {
		int originalNum = 132;
		int num = originalNum;
		int rem = 0;
		int result = 0;
		
		
		while(num!=0) {
			rem = num%10;
			result = result*10 +rem;
			num = num/10;
		}
		if(result==originalNum) {
		System.out.println("Given Num is Palindrom: " + result);
		}
		else
			System.out.println("Given Num is not Palindrom: " + result);
			
	}

}
