package polymorphism;

public class SubClass extends SuperClass
{
	
	
	@Override public void takeSnap()
	{
		System.out.println("Method Overriding - Snap is captured in SubClass");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Method Overriding
		SubClass step = new SubClass();
		
		step.reportStep();
		step.takeSnap();
		
		

	}

}
