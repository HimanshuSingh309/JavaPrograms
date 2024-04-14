package JavaPrograms;

public class ArmstrongNumInRange {

	public static void main(String[] args) {
		
		//int num = 373;
		System.out.println("Numbers are Armstrong: ");
		for(int num =1; num<=10000;num++) {
		int originalNum = num;
		int rem = 0;
		int result = 0;
		int numDigits = String.valueOf(num).length();
		
		while(originalNum!=0) {
			rem = originalNum%10;
			result += Math.pow(rem,numDigits );
			originalNum = originalNum/10;
		}
		if(num==result) {
			System.out.println(" "+result);
		}
//		else
//			System.out.println("Number is not Armstrong: " + result);
		}	

	}

}
