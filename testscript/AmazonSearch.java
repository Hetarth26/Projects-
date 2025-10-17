package testscript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args)
	{
		// Set up the chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Launch the URL
		driver.get("https://www.amazon.in/");
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Search for phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);	
		
        // Print the number of results found
		String resultsText = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		System.out.println("Number of results found: " + resultsText);
		
		// Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//span[text()='American Tourister'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Generic'])[1]")).click();
		
		// Sort by the newest arrivals
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		//Print the first resulting bag info (name, discounted price)
		String firstItemName = driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base')]")).getText();
		String firstItemPrice = driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText();
    
        System.out.println("First item name: " + firstItemName);
        System.out.println("First item discounted price: " + firstItemPrice);
        
	
		// Get the page title and close the browser
		String pageTitle = driver.getTitle();
		System.out.println("The current page title is: " + pageTitle);
		driver.quit(); 
		
		

	}

}
