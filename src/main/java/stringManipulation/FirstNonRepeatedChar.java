package stringManipulation;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Javk";
		char [] ch = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
				
			}
			if(count == 1) {
				System.out.println(ch[i]);
				break;
			}
			count = 0;
		}
		if(count==0) {
			System.out.println("There is no duplicate");
		}
		
		

	}

}
