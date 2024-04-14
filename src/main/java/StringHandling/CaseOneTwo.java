package StringHandling;

public class CaseOneTwo {

	public static void main(String[] args) {
		// How many objects will be created in below case:
		
		String s1 = new String("Himanshu");
		String s2 = new String("Himanshu");
		String s3 = "Himanshu";
		String s4 = "Himanshu";
		
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		
		//Case 2
		
		String str = new String("Himanshu");
		str.concat("Singh");
		str = str.concat("Thakur");
		
		System.out.println("**********");
		System.out.println(str);
		
		// How many objects will be created ?
		
		

	}

}
