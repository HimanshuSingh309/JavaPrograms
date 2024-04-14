package interfaceExamples;

public class College implements UsaUniversity, UKuniversity, CanadaUniversity {

	@Override
	public void media() {
		System.out.println("Printing --- media.");
		
	}

	public void business() {
		System.out.println("Printing --- business.");
		
	}

	public void medical() {
		
		System.out.println("Printing --- medical.");
		
	}

	@Override
	public void engineering() {
		System.out.println("Printing --- engineering.");
		
	}

	public void arts() {
		System.out.println("Printing --- arts.");
		
	}
	public static void main(String[] args) {
		College c = new College();
		c.arts();
		c.business();
		c.engineering();
		
	}

}
