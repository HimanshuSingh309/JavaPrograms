package JavaPrograms;

public class factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int result = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
		for(int i = num; i>=1; i--) {
			 result = result*i;
		}
		System.out.println(result);

	}

}
