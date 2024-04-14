package programming;

public class fibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int num = 0;
		System.out.print(a + " " + b);
		
		for(int i = 1; i<=8; i++) {
			num = a + b;
			a = b;
			b = num;
			System.out.print(" " + num);
			
		}
	

	}

}
