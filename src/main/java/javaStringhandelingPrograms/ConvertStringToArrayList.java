package javaStringhandelingPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		String str = "This is a first sentence to find the first is a non-repeated this word";
		String [] arr = str.split(" ");
		
		List<String> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println("New ArrayList is: " + al);

	}

}
