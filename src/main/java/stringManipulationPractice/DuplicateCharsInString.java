package stringManipulationPractice;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String str = "My name is Himanshu and what is yours";
		str = str.toLowerCase();
		char ch [] = str.toCharArray();		
		System.out.println("Given String is: " + str);
		int count = 1;
		
		for(int i = 0; i<=ch.length-1; i++) {
			if(ch[i] != ' ') {
			for(int j = i+1; j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) 
				{
					ch[j] = '_';
					count++;
				}
				
			}
			if(count>1 && ch[i] != '_') 
			{
				System.out.println(ch[i] + " ------ " + count);
			}
			count = 1;
			
		}
	}
	}
}
