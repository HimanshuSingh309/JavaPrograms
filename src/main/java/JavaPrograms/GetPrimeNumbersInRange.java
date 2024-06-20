package JavaPrograms;

public class GetPrimeNumbersInRange {

	public static void main(String[] args) {
		// int num = 37;
		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			if (num < 2) {

			} else {
				for (int i = 2; i * i < num; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print(num + " ");
				}
			}
		}

	}
}
