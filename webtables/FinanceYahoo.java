package webtables;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Accept cookies
		driver.findElement(By.xpath("//button[@id='scroll-down-btn']")).click();
		driver.findElement(By.xpath("//button[text()='Accept all']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//Hover on Markets tab using mouse
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Markets']"))).perform();
		
		//Click on “Crypto” tab
		driver.findElement(By.xpath("//div[@class='_yb_1ad2758'][normalize-space()='Crypto']")).click();
		
		
		
	}

}
