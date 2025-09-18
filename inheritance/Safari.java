package inheritance;

public class Safari extends Browser
{
	
	public void readerMode()
	{
		System.out.println("readerMode");

	}
	
	public void fullScreenMode()
	{
		System.out.println("fullScreenMode");
	}
	
	public static void main(String[] args)
	{
		Safari s = new Safari();
	    s.openURL();
	    s.closeBrowser();
	    s.navigateBack();
	    s.readerMode();
	    s.fullScreenMode();
	    
	}


}
