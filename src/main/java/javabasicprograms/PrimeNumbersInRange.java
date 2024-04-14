package javabasicprograms;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		//int num = 97;
		for(int num = 1; num<=100; num++) {
		boolean flag = false;
		for(int i = 2; i*i<=num; i++) {
			if(num%i==0) {
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("Given number is Prime number. " + num);
		}
		flag = false;
		}
	}

}
