package inheritance;

public class Chrome extends Browser

{
	
	public void openIncognito()
	{
		System.out.println("Open Incognito Window");
		
	}

	public void clearCache() 
	{
		System.out.println("Close Browser");

	}

	public static void main(String[] args)
	
	{
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();

	}

}
