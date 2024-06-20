package june20Practice2024;

public class ArmstrongNumber {
	public static int getDigitCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		// int num = 153;
		boolean flag = true;
		for (int i = 1; i <= 10000; i++) {
			int num = i;
			int rem = 0;
			int result = 0;
			int ActualNum = num;
			//int digitCount = getDigitCount(num);
			int digitCount = String.valueOf(num).length();

			while (num != 0) {
				rem = num % 10;
				result += (int) Math.pow(rem, digitCount);
				num = num / 10;
			}

			if (result == ActualNum) {
				if (!flag) {
					System.out.print(",");

				}
				System.out.print(ActualNum);
				flag = false;

			}

		}

	}
}
