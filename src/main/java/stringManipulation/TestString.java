package stringManipulation;

public class TestString {

	public static void main(String[] args) {
		String str = "This is my first java code. I am very happy with it.";
		System.out.println("First Occurence of i = " + str.indexOf("i"));
		System.out.println("2nd occurence of i = " + str.indexOf("i",str.indexOf("i") +1 ));
		
		int secodOccurence = str.indexOf("i",str.indexOf("i") +1 );
		System.out.println(str.indexOf("i", secodOccurence+1));

	}

}
