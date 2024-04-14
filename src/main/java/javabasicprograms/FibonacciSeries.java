package javabasicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// FibonacciSeries = 0,1,1,2,3,5,8,13
		
		int a = 0;
		int b = 1;
		
		System.out.print(a +" " + b +" ");
		
		for(int i = 1; i<8; i++) {
			
		int result = a + b;  // 1 , 2
		a = b;  // 1 , 1
		b = result; // 1 ,2
		
		System.out.print(result + " ");
		}

	}

}
