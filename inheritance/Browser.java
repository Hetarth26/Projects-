package inheritance;

public class Browser 
{
	
// Variables
private String browserName = "Chrome";
private String browserVersion = "140.0.7339.128";


// Methods

// Display info method


public void displayInfo() 

{
    System.out.println("Browser Name: " + browserName);
    System.out.println("Browser Version: " + browserVersion);
}

public void openURL()
{
	System.out.println("Open URL in Browser");
	
}

public void closeBrowser() 
{
	System.out.println("Close Browser");

}

public void navigateBack()
{
	System.out.println("Navigate Back");
}


public static void main(String[] args) 
{
	Browser b = new Browser();
	b.displayInfo();
	b.openURL();
	b.closeBrowser();
	b.navigateBack();
}

}
