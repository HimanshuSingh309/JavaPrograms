package stringManipulation14May2024;
public class RemoveDuplicateChar{
//We need to find the duplicate characters and it's occurrence
	public static void main(String[] args) {
		String str = "Nitin Singh Himanshu";
		char [] ch = str.toLowerCase().toCharArray();
		int count = 1;
		for(int i = 0; i<=ch.length-1; i++) {
			for(int j = i+1; j<=ch.length-1; j++) {
				if(ch[i]!=' ') {
				if(ch[i]==ch[j]) {
					ch[j]='_';
					count++;
				}
		}
			}
			if(count>=1 && ch[i]!='_') {
				System.out.print(ch[i] + " ");
			}
			count = 1;
		}

	}

}
