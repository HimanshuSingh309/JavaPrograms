package stringManipulation14May2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringArrayToArrayList {

	public static void main(String[] args) {
		String [] str = {"Orange", "Banana", "Apple","cherry"};
		List<String> al = new ArrayList<>(Arrays.asList(str));
		System.out.println(al);

	}

}
