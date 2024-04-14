package StringHandling;

public class OperatorAndEqualsMethodInStringClass {

	public static void main(String[] args) {
		String s1 = new String("Himanshu");
		String s2 = new String("Himanshu");
		
		System.out.println(s1==s2); // False
		System.out.println(s1.equals(s2)); // True
		
		// s1 and s2 both are pointing to the different objects. So returning false
		// .equals() method is used for content comparison so returning true.
		
		// Note: In String class == operator is used for reference comparison & .equals method present in
		// object class for reference comparison & it's overridden method in String class so meant for 
		// content comparison in String class.

	}

}
