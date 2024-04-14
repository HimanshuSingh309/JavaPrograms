package stringManipulationPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str [] = {"Orange","Banana","Mango","Graps"};
		List<String> al = new ArrayList<>(Arrays.asList(str));
		System.out.println(al);
	}

}
