package javaStringhandelingPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayToArrayList {

	public static void main(String[] args) {
		String str [] = {"Orange","Banana","Mango","Graps"};
		List<String> al = new ArrayList<>(Arrays.asList(str));
		System.out.println(al);

	}

}
