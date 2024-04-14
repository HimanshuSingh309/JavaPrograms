package stringManipulationPractice;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "Kalua";
		char[] ch = str.toCharArray();
		
		int count = 1;
		for(int i = 0; i<=ch.length-1; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='_';
				}
			}
			if(ch[i] !='_' && count>=1) {
				System.out.print(ch[i]);
			}
			count = 1;
		}

	}

}
