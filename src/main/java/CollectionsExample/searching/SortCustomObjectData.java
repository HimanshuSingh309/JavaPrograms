package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomObjectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeData> al = new ArrayList<>();
		al.add(new EmployeeData("Himanshu", "QA Lead", 4));
		al.add(new EmployeeData("Pawan", "S.QA Lead", 3));
		al.add(new EmployeeData("Ramakant", "A Architect", 2));
		al.add(new EmployeeData("Manish", "Chief Architect", 1));
		al.add(new EmployeeData("Amrit", "QA Engineer", 5));
		
		Collections.sort(al, new RankComparator());
		
		for(EmployeeData data :al) {
			
			System.out.println(data);
		}

	}
	
	

}
