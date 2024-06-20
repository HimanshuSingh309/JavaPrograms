package CollectionsExample.searching;

import java.util.Comparator;

public class RankComparator implements Comparator<EmployeeData>{
	
	@Override
	public int compare(EmployeeData e1,EmployeeData e2 ) {
		
		return Integer.compare(e1.getRank(), e2.getRank());
		
	}
	
	

}
