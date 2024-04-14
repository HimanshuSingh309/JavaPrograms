package collectionsExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("HImanshu");
		al.add("Singh");
		al.add("Thakur");
		al.add("HImanshu");
		
		System.out.println(al);
		
		Set<String> st = new HashSet<>();
		st.add("Amrit");
		st.add("Sinha");
		st.add("Prabhat");
		st.add("Amrit");
		
		System.out.println(st);
		
		Map<Integer, String> hp = new HashMap<>();
		hp.put(101, "Ajay");
		hp.put(105, "CHaudhry");
		hp.put(103, "Sirohi");
		
		System.out.println(hp);
		
		Set<String> st1 = new LinkedHashSet<>();
		st1.add("Amrit");
		st1.add("Zinha");
		st1.add("Prabhat");
		st1.add("Amrit");
		
		System.out.println(st1);
		

	}

}
