package stringManipulation14May2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		String [] str1 = str.split(" ");
		
		List<String> al = new ArrayList<>(Arrays.asList(str1));
		System.out.println(al);

	}

}
