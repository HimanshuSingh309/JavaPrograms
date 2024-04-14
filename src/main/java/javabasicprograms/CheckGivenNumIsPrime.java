package javabasicprograms;

public class CheckGivenNumIsPrime {

	public static void main(String[] args) {
		int num = 91;
		boolean flag = false;
		for(int i = 2; i*i<=num; i++) {
			
			if(num%i==0) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Given number is not prime num. " + num);
		}
		else
			System.out.println("Given number is prime num. " + num);

	}

}
