package stringManipulationPractice;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str = "Noida is a good city and Is a good very good noida good and well maintained good And";
		String [] str1 = str.split(" ");
		
		int count = 1;
		for(int i = 0; i<=str1.length; i++) {
			
			for(int j = i+1; j<str1.length; j++) {
				if(str1[i].equalsIgnoreCase(str1[j])) {
					str1[j] = "_";
					count++;
				}
			}
			if(count>1 && str1[i]!= "_") {
				System.out.println(str1[i] + " ---- " + count++);
			}
			count=1;
		}
	}

}
