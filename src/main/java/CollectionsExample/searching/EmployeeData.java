package CollectionsExample.searching;

public class EmployeeData {

	
		private String name;
		private String designation;
		private int Rank;
		
		public EmployeeData(String name, String designation, int Rank) {
			this.name = name;
			this.designation = designation;
			this.Rank = Rank;
		}

		public String getName() {
			return name;
		}

		public String getDesignation() {
			return designation;
		}

		public int getRank() {
			return Rank;
		}
		
		public String toString() {
			return "name: " + name + ", Designation: " + designation + ", Rank: " + Rank;
		}

	

}
