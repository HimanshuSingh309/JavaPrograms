package ProgramsPractice;

public class GivenNumIsArmstrongOrNot {
	
	public static int digitCounts(int num) {
		int count=0;
		while(num!=0) {
		num = num/10;
		count++;
		}
		return count;
	}

	public static void main(String[] args) {
		//int originalNum = 370;
		for(int originalNum=1; originalNum<=10000;originalNum++) {
		int num = originalNum;
		int rem = 0;
		int result =0;
		int n = digitCounts(num);
		
		while(num!=0) {
			rem = num%10;
			result += (int) Math.pow(rem, n);
			num = num/10;
		}
		if(result==originalNum) {
			System.out.println("Given num is Armstrong: " + result);
		  }
		}	

	}
}
