package javaStringhandelingPrograms;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Nitinis";
		str = str.toLowerCase();
		System.out.println("Input String: " + str);
		char ch [] =str.toCharArray();
		int count  = 1;
		for(int i = 0; i<=ch.length-1; i++) {
			
			
			for(int j =i+1; j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					ch[j] = '_';
					count++;
					
				}
			}
			if(count==1 && ch[i]!='_') {
				System.out.print(ch[i]);
				//break; to print first non repeated char
			}
			count=1;
			
		}

	}

}
