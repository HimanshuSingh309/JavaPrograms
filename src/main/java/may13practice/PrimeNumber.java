package may13practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int range = 100;
		System.out.print("Given numbers are prime numbers: ");
		boolean comma = false;
		for(int num = 50; num<range; num++) {
		boolean flag = true;
		for(int i = 2; i*i<=num; i++) {
			if(num%i ==0) {
				flag = false;
				break;
			}
			
		}
		
		
		if(flag) {
			if(comma) {
				System.out.print(",");
			}
			else
				comma = true;
			System.out.print(num);
				
		}
	}

	}
}
