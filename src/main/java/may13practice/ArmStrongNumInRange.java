package may13practice;

public class ArmStrongNumInRange {

	public static int getDigitCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static void checkArmstrongNum() {
		boolean comma = true;
		for (int num = 1; num <= 5000; num++) {
			int originalNum = num;
			int rem = 0;
			int result = 0;
			
			int n = getDigitCount(num);

			while (originalNum != 0) {
				rem = originalNum % 10;
				result += Math.pow(rem, n);
				originalNum = originalNum / 10;
			}
			if (num == result) {
				if(comma) {
				System.out.print(num);
				comma = false;
				}
				else {
					System.out.print(","+num);
				}
			}
		}
	}

	public static void main(String[] args) {
		checkArmstrongNum();

	}

}
