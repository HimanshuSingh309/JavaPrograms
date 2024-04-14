package ProgramsPractice;

public class PrimeNumInRange {

	public static void main(String[] args) {
	//	int num = 97;
		for(int num=1;num<=200;num++) {		
		boolean flag = true;		
		for(int i = 2; i*i<=num; i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Given Num is prime number: " + num);
		}
		}
	}

}
