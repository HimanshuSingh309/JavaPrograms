package StringHandling;

public class Mutability {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Himanshu");
		sb.append(" Singh"); // So this sb.append() method is not creating the new object. It's modifying 
							// the existing object only. This changeable behavior known as mutability.
		System.out.println(sb);
		// So basically StringBuffer objects are mutable.

	}

}
