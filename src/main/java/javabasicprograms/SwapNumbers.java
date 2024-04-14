package javabasicprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.println("Initial value of a -- > " + a);
		System.out.println("Initial value of b -- > " + b);
		System.out.println();
		System.out.println("**************************");
		
		a = a + b;  //5 + 7 = 12
		b = a - b; // 12 - 7 = 5
		a = a - b; // 12 - 5 = 7
		
		System.out.println();
		System.out.println("New value of a -- > " + a);
		System.out.println("New value of b -- > " + b);

	}

}
