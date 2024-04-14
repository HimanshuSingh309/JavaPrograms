package javabasicprograms;

public class ArmstrongNumbersInRange {
	//static int count = 0;
	public static int getDigitCount(int num) {
		int count = 0;
		while(num!=0) {
			num=num/10;
			 count++;
		}
		return count;		
	}
	
	public static void checkArmStrongNumber() 
	{
		
		for(int num =1; num<=10000;num++) 
		{
			int originalNum = num;
			int rem = 0;
			int result = 0;
			int n = getDigitCount(num);
			while(originalNum!=0) 
			{
				rem = originalNum%10;
				result += Math.pow(rem, n);
				originalNum = originalNum/10;
			}
			if(num == result) {
				
				System.out.print( num + "," );
			}
		}
		
	}

	public static void main(String[] args) {
		
		checkArmStrongNumber();

	}

}
