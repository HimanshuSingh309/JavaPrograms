package InheritenceExamples;

public class Fortis extends Hospital{
	public void mri() {
		System.out.println("Printing MRI from fortis Hospital.");
	}
	public void citiScan() {
		System.out.println("Printing citiScan from fortis Hospital.");
	}
	@Override
	public void gynechologiest() {
		System.out.println("Printing---- gynechologist Override");
	}
	@Override
	public void emergency() {
		System.out.println("Printing---- emergency Override");
	}

}
