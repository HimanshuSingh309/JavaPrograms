package JavaPrograms;

public class ArmstrongNumbersInRange {
	//static int count = 0;
	
	public static int countDigits(int num) {
		int count=0;
		while(num!=0) {
		num = num/10;
		count++;
		}
		return count;
	}
	public static void checkArmstrong() 
	{
		for(int num = 1; num<=1000; num++) 
		{
			int rem = 0;
			int originalNum = num;
			int result = 0;
			int n = countDigits( num);
			
			while(originalNum!=0)
			{
				rem = originalNum%10;
				result += (int) Math.pow(rem, n);
				originalNum = originalNum/10;
			}
			if (num==result) 
			{
				System.out.print(" " + result);
			}
			
		}
	}
		
	public static void main(String[] args) {
		ArmstrongNumbersInRange.checkArmstrong();
			
		}

	}
