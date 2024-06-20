package june20Practice2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		String str = "I am a good boy";
		String arr[] = str.split(" ");
		
		List<String> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);

	}

}
