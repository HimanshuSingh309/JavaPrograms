package InheritenceExamples;

public class Max extends Hospital {
	
	public void ultrasound() {
		System.out.println("Printing ultrasound from Max Hospital.");
	}
	public void xRay() {
		System.out.println("Printing X-Ray from Max Hospital.");
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
