package programming;

public class PrimeNumInRange {

	public static void main(String[] args) {
		//int num = 97;
				int range = 100;
				for(int num = 2; num<=range; num++) {
				boolean flag = false;
				for(int i = 2; i*i<=num; i++) {
					if(num%i==0) {
						flag = true;
						break;
					}
					
				}
				
				if(flag==false)
					System.out.println("Given num is  prime number-- " + num);
				}	


	}

}
