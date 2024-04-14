package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWordInArrayList {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		al.add("Himanshu");
		al.add("Amrit");
		al.add("Ankur");
		al.add("Manish");
		al.add("Mayank");

		// Convert all the strings into Lowercase
		List<String> lowerCaseList = convertToLowerCase(al);
		System.out.println(lowerCaseList);

		// Take input String word from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input word to search: ");
		String WordToSearch = sc.next();

		// perform search
		boolean flag = false;

		for (int i = 0; i < lowerCaseList.size(); i++) {
			if (lowerCaseList.get(i).equalsIgnoreCase(WordToSearch)) {;
			flag = true;
			System.out.println("Word found at index: " + i + " And word is:  " + WordToSearch);
			break;
		  }
		}
		if (!flag) {
			System.out.println("Word not found: " + WordToSearch);
		}

	}

	public static List<String> convertToLowerCase(List<String> al) {

		List<String> lowerCaseList = new ArrayList<>();
		for (String str : al) {

			lowerCaseList.add(str.toLowerCase());
		}
		return lowerCaseList;

	}

}
