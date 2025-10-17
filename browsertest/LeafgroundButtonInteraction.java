package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span")).click();
		//Verify the title of the page
		String Title = driver.getTitle();
		String ExpectedTitle = "Dashboard";
		if (Title.equals(ExpectedTitle)) 
		{
			System.out.println("The Title is verified");
		} 
		else
		{
			System.out.println("The Title is not verified");
		}
		
		//navigate to previous page
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		WebElement button = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean isEnabled = button.isEnabled();
		if (!isEnabled) 
		{
			System.out.println("The button is disabled");
		} 
		else 
		{
			System.out.println("The button is enabled");
		}
		//Find the position of the Submit button
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		int x = submitButton.getLocation().getX();
		int y = submitButton.getLocation().getY();
		System.out.println("The position of the Submit button is: (" + x + ", " + y + ")");
		//Find the Save button color
		WebElement saveButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = saveButton.getCssValue("background-color");
		System.out.println("The Save button color is: " + color);
		//Find the height and width of this button
		WebElement buttonSize = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("The height of the button is: " + height);
		System.out.println("The width of the button is: " + width);
		
		//close the browser
		driver.close();
		
		
	}

}
