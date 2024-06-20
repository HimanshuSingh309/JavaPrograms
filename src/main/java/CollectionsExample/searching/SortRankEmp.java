package CollectionsExample.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRankEmp {
	private String name;
	private String profile;
	private int rank;
	
	public SortRankEmp(String name, String profile, int rank) {
		this.name = name;
		this.profile = profile;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public String getProfile() {
		return profile;
	}

	public int getRank() {
		return rank;
	}
	
	public String toString() {
		return "Name: " + name + " --- Profile: " + profile + " --- Rank:" + rank;
	}
	
	   static class RankComparator implements Comparator <SortRankEmp>{
		   
		   @Override
		   public int compare(SortRankEmp s1, SortRankEmp s2) {
			   return Integer.compare(s1.getRank(), s2.getRank());
			   
		   }		   
		   
	   }
	   
	   public static void main(String[] args) {
		   
		   List<SortRankEmp> al = new ArrayList<>();
		   al.add(new SortRankEmp("Pawan","Sr QA", 2));
		   al.add(new SortRankEmp("Himanshu","Sr QA Automation", 3));
		   al.add(new SortRankEmp("Ramakant","QA Director", 1));
		   
		   Collections.sort(al, new RankComparator());
		   
		   for(SortRankEmp sortedEmpList : al) {
			   
			   System.out.println(sortedEmpList);
		   }
	   }

}
