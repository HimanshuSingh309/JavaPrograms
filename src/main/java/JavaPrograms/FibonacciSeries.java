package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp = 0;
		System.out.print(a + " " + b);
		
		for(int i = 3; i<10; i++) {
			
			temp = a+b;
			a = b;
			b = temp;
			System.out.print(" "+temp);
		}

	}

}
