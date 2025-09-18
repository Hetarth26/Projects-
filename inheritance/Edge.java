package inheritance;

public class Edge extends Browser
{
	
	public void takeSnap()
	{
		System.out.println("takeSnap");
		
	}

	public void clearCookies()
	{
		System.out.println("clearCookies");

	}
	public static void main(String[] args)
	{
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();

	}

}
