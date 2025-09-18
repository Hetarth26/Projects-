package polymorphism;

public class LoginPage extends BasePage 
{
	
	@Override
	public void performCommonTasks() 
	{
		
		System.out.println("Method Overriding - Performing common tasks from LoginPage");
	}

	public static void main(String[] args) 
	{
		//ovveriding
		BasePage bp = new LoginPage();
		
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();	
		
	
	}

}
