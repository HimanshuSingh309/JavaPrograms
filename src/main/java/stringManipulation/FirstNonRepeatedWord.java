package stringManipulation;

public class FirstNonRepeatedWord {

	public static void main(String[] args) {
		String str = "This is a first sentence to find the first is a non-repeated this word";
		str = str.toLowerCase();
		String[] str1 = str.split(" ");
		int count = 1;
		
		for(int i = 0; i<str1.length; i++) {
			for(int j = i+1;j<str1.length; j++) {
				if(str1[i].equalsIgnoreCase(str1[j])) {
					count++;
					
				}
			}
			if(count==1) {
				System.out.println(str1[i]);
				break;
			}
			count=1;
		}

	}

}
