package StringHandling;

public class CaseThree {

	public static void main(String[] args) {
		// Case 3 ---> How many objects will be created below:
		String s1 = new String("Himanshu");
		s1.concat("Singh");
		
		String s2 = s1.concat("Thakur");
		s2.concat("Jadaun");
		System.out.println(s1); //Himanshu
		System.out.println(s2); // HimanshuThakur
	}

}
