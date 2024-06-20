package june20Practice2024;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int i = 2; i*i <= num; i++) {
				if (num % i == 0) {
					flag = false;
					break;

				}

			}
			if (flag) {
				System.out.print(num + ",");
			}

		}
	}
}
