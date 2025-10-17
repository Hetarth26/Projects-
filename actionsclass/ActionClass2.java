package actionsclass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args)
	{
		//Learn to automate interactions using Selenium WebDriver's Actions class to simulate mouse and keyboard actions.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
		//Search for "oneplus 9 pro" 
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("oneplus 9 pro").perform();
		//Click on the search button.
		actions.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().perform();
		
		//Get the price of the first product displayed and print it in the console.
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Price of the first product is: " + price);
		//Print the number of customer ratings for the first displayed product.
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();

		System.out.println("Number of customer ratings for the first product is: " + ratings);
		
		//Click on the first text link of the first image.
		actions.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'JGD PRODUCTS for OnePlus 9 Pro Premium Transparent')])[1]"))).click().perform();
		//Switch to the new window.
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}

		//Click the 'Add to Cart' button.
		actions.moveToElement(driver.findElement(By.id("add-to-cart-button"))).click().perform();
		
		//Get the cart subtotal and verify if it is correct.
		String subtotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']//span[@class='a-price-whole']")).getText();
		

		
		System.out.println("Cart subtotal is: " + subtotal);
		if(subtotal.equals(price))
		{
			System.out.println("Cart subtotal is correct.");
		}
		else
		{
			System.out.println("Cart subtotal is incorrect.");
		}
		
		
		//Close the browser.	
		driver.quit();



}
}