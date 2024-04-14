package ProgramsPractice;

public class PalindromNumInRange {

	public static void main(String[] args) {
		//int originalNum = 132;
		for(int originalNum = 1; originalNum<=200; originalNum++ ) {
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
	  }

	}

}
