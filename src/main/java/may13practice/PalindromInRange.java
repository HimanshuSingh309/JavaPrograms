package may13practice;

public class PalindromInRange {

	public static void main(String[] args) {
		//int num = 151;
		boolean firstNumber = true;
		System.out.print("Palindrom numbers are: ");
		for(int num = 100; num<200; num++) {
		int rem = 0;
		int reverse = 0;
		int originalNum = num;
		
		while(originalNum!=0) {
			
			rem = originalNum%10; //1,5,1
			reverse = reverse * 10 + rem; //1, 15, 151
			originalNum = originalNum/10; //15,1,0
			
		}
		if (num == reverse) {
            if (firstNumber) {
               
                System.out.print(num);
                firstNumber = false; // Update the flag
            } else {
                
                System.out.print("," + num);
            }

	}

}
	}
}
