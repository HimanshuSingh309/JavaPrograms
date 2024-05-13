package may13practice;

public class FibonacciSeriesWhileLoop {

	public static void main(String[] args) {
		int range = 7;
		
		int n1 = 0;
		int n2 = 1;
		int temp = 0;
		System.out.print(n1 + " " + n2);
		while(range>0) {
		temp = n1 + n2;
		n1 = n2;
		n2 = temp;
		System.out.print(" "+temp);
		range--;
		
		}
	}

}
