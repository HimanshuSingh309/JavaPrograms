package june20Practice2024;

public class FactorialProg {

	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		for(int i = num; i>1; i--) {
			
			fact = fact * i;
			
		}
		System.out.println(fact);

	}

}
