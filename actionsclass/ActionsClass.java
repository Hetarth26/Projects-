package actionsclass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsClass
{
	public static void main(String[] args)
	{
		//automate interactions using Selenium WebDriver's Actions class to simulate mouse and keyboard actions.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
		//-Scroll down to the "Conditions of Use and Sale" section at the bottom of the page using Actions class.
		actions.scrollToElement(driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"))).perform();
		//Get the text of "Conditions of Use and Sale" and print it in the console.
		String text = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")).getText();
		System.out.println("Text of the link is: " + text);
	
		//Close the browser.
		driver.quit();
	}

}
