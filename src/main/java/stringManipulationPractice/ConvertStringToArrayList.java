package stringManipulationPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		String str = "My name is Himanshu";
		
		List<String> al = new ArrayList<>(Arrays.asList(str));
		System.out.println(al);

	}

}
