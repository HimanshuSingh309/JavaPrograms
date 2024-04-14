package programming;

public class swapNumbers {

	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		
		a = a + b; // 6 + 7 = 13 = a
		b = a - b; // 13 - 7 = 6
		a = a - b; // 13 - 6 = 7
		
		System.out.println("New value of a is: " + a);
		System.out.println("New value of b is: " + b);

	}

}
