package JavaPrograms;

public class GetPrimeNumbersInRange {

	public static void main(String[] args) {
		//int num = 37;
		for(int num = 0; num<=100;num++) {
		boolean flag = false;
		if(num<2) {
			
		}
		else {
		for(int i = 2; i*i<num; i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.print(num + " ");
		}
		}
	}

}
}
