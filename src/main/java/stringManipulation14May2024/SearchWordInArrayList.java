package stringManipulation14May2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordInArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Himanshu");
		al.add("Nitin");
		al.add("Manish");
		al.add("Ramakant");
		al.add("Ankur");
		System.out.println(al);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search:");
		String WordToSearch = sc.next();
		boolean found = false;
		for(int i = 0; i<al.size(); i++) {
			if(al.get(i).equalsIgnoreCase(WordToSearch)){
			System.out.println("Word found: " + WordToSearch);
			found = true;
			break;
			}
			
		}
		if(!found) {
			System.out.println("Word not found: " + WordToSearch);
		}
	

	}

}
