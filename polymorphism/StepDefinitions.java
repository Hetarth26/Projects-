package polymorphism;

public class StepDefinitions

	// Method Overloading
{
	public void reportStep()
	{
		System.out.println("Step executed");
	}
	
	
	public void reportStep(String stepDetail, String status)
	{
		System.out.println(stepDetail);
		System.out.println("The status is:" + status);
	}
	
	public void reportStep(String stepDetail, String status, boolean bSnap)
	{
		System.out.println(stepDetail);
		System.out.println("The status is:"  + status);
		if (bSnap)
		{
			System.out.println("Snap is captured");
		}
	}
	
	

	public static void main(String[] args)
	{
		StepDefinitions step = new StepDefinitions();
		step.reportStep();
		step.reportStep("Login is successful", "PASS");
		step.reportStep("Login is failed", "FAIL", true);	

	}

}
