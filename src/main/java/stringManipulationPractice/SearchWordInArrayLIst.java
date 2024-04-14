package stringManipulationPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordInArrayLIst {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Himanshu");
		al.add("Amrit");
		al.add("Ankur");
		al.add("Manish");
		al.add("Mayank");
		System.out.println(al);
		
		// Take input String word from user
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter input word to search: ");
				String WordToSearch = sc.next();
				
				boolean found = false;
				for(int i = 0; i<al.size(); i++) {
					if(al.get(i).equalsIgnoreCase(WordToSearch)) {
						System.out.println("Word Found: " + WordToSearch);
						found = true;
						break;
					}
					
				}
				if(!found) {
					System.out.println("Word not Found: " + WordToSearch);
				}

	}

}
