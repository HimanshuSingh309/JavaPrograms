package javaStringhandelingPrograms;

public class DuplicateCharsWithOccurence {

	public static void main(String[] args) {
		String str = "my name is abhinav what is yours";
		str = str.toLowerCase();
		char [] ch1 = str.toCharArray();
		int count = 1;
		for(int i = 0; i<=ch1.length-1; i++) {
			if(ch1[i] != ' ') {
			for(int j = i+1; j<=ch1.length-1;j++) {
				if(ch1[i]==ch1[j]) {
					ch1[j]='_';
					count++;
					
				}
			}
			if(count>1 && ch1[i]!='_') {
				System.out.println(ch1[i] +" ---- " + count);
				
			}
			count =1;
			}
		}

	}

}
