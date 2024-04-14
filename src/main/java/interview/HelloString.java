package interview;

public class HelloString {

	public static void main(String[] args) {
		String str = "My mobile price is $100.27 in india.";
		String str2 = "";
		String result = "";
		
		String [] str1 = str.split(" ");
		
		for(int i = 0; i<str1.length; i++) {
			
			System.out.print(str1[i]);
		}
		System.out.println();
		System.out.print("Resulted data is:---> ");
		for(int i = 0; i<str1.length; i++) {
			
			if(str1[i].contains("100.27")) {
				
				str2 = str1[i];
				result = str2.replace("$","");
				System.out.print(result);
				break;
			}
			
			
		}

	}

}
