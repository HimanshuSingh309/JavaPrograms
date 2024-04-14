package javaStringhandelingPrograms;

public class FirstNonRepeatedWord {

	public static void main(String[] args) {
		String str = "This is a first sentence to find the first is a non-repeated this word";
		str = str.toLowerCase();
		String arr [] = str.split(" ");
		int count = 1;
		for(int i = 0; i<=arr.length-1; i++) {
			for(int j = i +1; j<=arr.length-1; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				break;
			}
			count=1;
		}
		
		

	}

}
