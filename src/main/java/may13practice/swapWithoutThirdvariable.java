package may13practice;

public class swapWithoutThirdvariable {

	public static void main(String[] args) {
		int a  = 5;
		int b = 7;
		
		a = a + b; // 5 + 7 = 12
		b = a - b; // 12 - 7 = 5
		a = a - b;
		
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		

	}

}
