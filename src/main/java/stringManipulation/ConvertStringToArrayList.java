package stringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		String str  = "test1, test 2, test3";
		String [] str1 = str.split(",");
		
		List<String> al = new ArrayList<>(Arrays.asList(str1));
		System.out.println("ArrayList is: " + al);

	}

}
