package JavaPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num = 370;
		int originalNum = num;
		int rem = 0;
		int result = 0;
		
		while(originalNum!=0) {
			rem = originalNum%10;
			result += Math.pow(rem, 3);
			originalNum=originalNum/10;
			
		}
		if(result==num) {
			System.out.println("Given num is Armstrong: " + result);
		}
		else
			System.out.println("Given num is not Armstrong: " + result);

	}

}
