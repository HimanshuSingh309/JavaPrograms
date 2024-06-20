package june17practiceCollectionsSearching;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchNumElementUsingHashSet {

	public static void main(String[] args) {
		Set<Integer> intList = new HashSet<>();
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
		
		for(int i = 0; i<=intList.size()-1; i++) {
			if(intList.contains(NumberToSearch)) {
				found = true;
				System.out.println("Num element found: " + NumberToSearch);
				break;
			}
		}
		if(!found) {
			System.out.println("Num element not found: " + NumberToSearch);
		}

	}

}
