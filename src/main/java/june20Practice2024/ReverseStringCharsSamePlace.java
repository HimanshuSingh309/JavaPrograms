package june20Practice2024;

public class ReverseStringCharsSamePlace {

	public static void main(String[] args) {
		String str = "My name is himanshu";
		//String str1[] = str.split(" ");
		
		for(int i = 0; i<=str.length()-1; i++) {
			char ch [] = str.toCharArray();
			for(int j = ch.length-1; j<=0; j--) {
				char ch1 = ch[j];
				System.out.print(ch1);
			}
		}

	}

}
