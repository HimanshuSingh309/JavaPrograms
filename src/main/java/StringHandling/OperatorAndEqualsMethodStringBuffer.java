package StringHandling;

public class OperatorAndEqualsMethodStringBuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Himanshu");
		StringBuffer s2 = new StringBuffer("Himanshu");
		
		System.out.println(s1==s2); // False
		System.out.println(s1.equals(s2)); // False
		
		// In StringBuilder class == operator & Equals method both are for Reference comparison
		// In StringBuffer class .equals method is not overridden method.
		
		

	}

}
