package stringManipulation;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "helleojh javoaz";
		String str1 = str.replaceAll(" ", "");
		System.out.println("Input String---> " + str1);
		char [] ch = str1.toCharArray();
		int count = 1;
		int i =0;
		int j = i+1;
		
		for( i = 0; i<ch.length-1; i++) {
			for( j = i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j] = '_';
					count++;
				}
			}
			if(count>=1 && ch[i]!='_') {
				
				System.out.print(ch[i]);
				
			}
			
			count = 1;
		}
		
		

	}

}
