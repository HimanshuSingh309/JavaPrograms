package javaStringhandelingPrograms;

public class ReverseStringChars {

	public static void main(String[] args) {
		String str = "Himanshu Thakur";
		char ch[] = str.toCharArray();
		System.out.println(ch.length);
		
		for(int i = ch.length-1; i>=0; i--) {
			char ch1 = ch[i];
			if(ch[i]!=' ') {
				System.out.print(ch1);
			}
		}

	}

}
