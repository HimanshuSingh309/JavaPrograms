package stringManipulation;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "Noida is a good city and is a good very good noida good and well maintained";
		String [] str1 = str.split(" ");
		int count = 1;
		
		for(int i = 0; i<=str1.length-1; i++) {
			
			for(int j = i+1; j<=str1.length-1; j++) {
				if(str1[i].equalsIgnoreCase(str1[j])) {
					
					str1[j] = "_";
					count++;
					
				}
			}
			if(count>=1 && str1[i]!="_") {
				System.out.print(str1[i] + " ");
			}
			count = 1;
		}

	}

}
