package stringManipulationPractice;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Himanshuim";
		str = str.toLowerCase();
		char [] ch1 = str.toCharArray();
		int count = 1;
		for(int i = 0; i<=ch1.length-1; i++) {
			for(int j = i+1; j<=ch1.length-1;j++) {
				if(ch1[i]==ch1[j]) {
					count++;
					
				}
			}
			if(count==1) {
				System.out.print("First Non-repeated character is: "+ch1[i]);
				break;
			}
			count =1;
		}


	}

}
