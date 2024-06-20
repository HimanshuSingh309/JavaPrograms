package june17practiceCollectionsSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchNumInArrayList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(15);
		intList.add(25);
		intList.add(35);
		intList.add(45);
		intList.add(55);
		
		System.out.println(intList);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be search:");
		int NumberToSearch = sc.nextInt();
		boolean found = false;
		for(int i= 0; i<=intList.size()-1; i++) {
			if(intList.get(i)==NumberToSearch) {
				found = true;
				System.out.println("Number found: " + NumberToSearch);
				break;
			}
		}
		if(!found) {
			System.out.println("Number not found: " + NumberToSearch);
		}
	}

}
