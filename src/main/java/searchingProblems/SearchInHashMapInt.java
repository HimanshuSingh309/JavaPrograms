package searchingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchInHashMapInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Himanshu");
		map.put(104, "amrit");
		map.put(102, "Ramakant");
		map.put(103, "Mayank");
		map.put(106, "Manish");
		map.put(109, "Ankur");
		map.put(108, "Himanshu");
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EMP id to search: ");
		int empId = sc.nextInt();
		
		// Perform Search
		boolean found = false;
		for(int key : map.keySet()) {
			if(key==empId) {
				String empName = map.get(key);
				found = true;
				System.out.println("Name of the emp " + empId + " is " + empName);
				break;
			}
		}
		if(!found) {
			System.out.println("Employee id is not present: " + empId );
		}
		
		
		}

}
