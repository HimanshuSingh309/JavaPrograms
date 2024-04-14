package InheritenceExamples;

public class Apollo extends Hospital {
	
	public void apolloHelpline() {
		System.out.println("Printing Apollo helpline.");
	}
	public void ortho() {
		System.out.println("Printing Ortho from apollo.");
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
