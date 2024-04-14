package stringManipulationPractice;

public class FirstNonRepeatedWord {

	public static void main(String[] args) {
		String str = "Noida is a good city and Is a good very good noida good and well maintained good And";
		String [] arr = str.split(" ");
		int count = 1;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("First Non-repeated word is: " + arr[i]);
				break;
			}
			count = 1;
		}

	}

}
