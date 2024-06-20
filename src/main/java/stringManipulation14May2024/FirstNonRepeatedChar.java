package stringManipulation14May2024;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Himanshu Smingh Thakur";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int count = 1;
		
		for(int i = 0; i<=ch.length-1; i++) {
			for(int j = i+1;j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j] = '_';
					
				}
			}
			if(count==1 && ch[i]!='_') {
				System.out.println(ch[i]);
				break;
			}
			count=1;
		}


	}

}
