package may13practice;

public class FibonacciSeriesForLoop {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		
		for(int i = 1; i<8; i++) {
			
			int result = a + b;
			a = b;
			b = result;
			System.out.print(" " + result);
		}

	}

}
