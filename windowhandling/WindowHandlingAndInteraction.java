package windowhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndInteraction

//Automate interactions with a webpage, focusing on window handling and navigating between them
{

	public static void main(String[] args)
	{
		//initialize WebDriver
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//launch URL
		driver.get("https://www.amazon.in/");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "Mobiles"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		//Scroll down
		driver.executeScript("window.scrollBy(0,400)");
		//Click on first search result
		driver.findElement(By.xpath("(//span[contains(text(),'iQOO Z10 5G (Stellar Black, 12GB RAM, 256GB Storage)')])[1]")).click();
	 
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
		
		//Switch to the new window
		driver.switchTo().window(windowList.get(1));
		
		driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']")).click();
		
		//Get the title of the new window
		String title = driver.getTitle();
		
		
		System.out.println("Title of the new window: " + title);
		
		//Switch to the new window
		driver.switchTo().window(windowList.get(0));
	
		//Close the new window
		driver.close();
	
		

	}

}
