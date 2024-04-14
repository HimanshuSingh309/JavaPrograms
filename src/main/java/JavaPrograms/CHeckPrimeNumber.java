package JavaPrograms;

public class CHeckPrimeNumber {

	public static void main(String[] args) {
		int num = 37;
		boolean flag = false;
		
		for(int i = 2; i*i<num; i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Given number is not prime: " + num);
		}
		else
			System.out.println("Given number is prime: " + num);
		
		

	}

}
