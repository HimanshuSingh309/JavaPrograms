package ProgramsPractice;

public class GivenNumIsPrimeOrNot {

	public static void main(String[] args) {
		int num = 97;
		boolean flag = false;
		
		for(int i = 2; i*i<=num; i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Given Num is prime number: " + num);
		}
		else
			System.out.println("Given Num is not  prime number: " + num);

	}

}
