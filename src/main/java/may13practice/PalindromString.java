package may13practice;

public class PalindromString {

	public static void main(String[] args) {
		String str = "nitin";
		boolean isPalindrom = true;
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++) {
			int j = ch.length-1-i;
				if(ch[i]!=ch[j]) {
					isPalindrom = false;
					break;
				}
			}
			
		if(isPalindrom) {
			System.out.println("Given String is palindrom: " + str);
		}
		else
			System.out.println("Given String is not palindrom: " + str);

	}

}
