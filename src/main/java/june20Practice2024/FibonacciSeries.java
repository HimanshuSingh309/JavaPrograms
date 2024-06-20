package june20Practice2024;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci series is: ");
		System.out.print(a +","+ b);
		for(int i = 3; i<9; i++) {
		int result = a+b;
		a = b;
		b = result;
		System.out.print(","+result);
		}
		

	}

}
