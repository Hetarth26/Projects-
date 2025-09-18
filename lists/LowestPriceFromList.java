package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.time.Duration;


public class LowestPriceFromList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Set up the chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Launch the URL
		driver.get("https://www.amazon.in/");
		// Search for phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);		

		Thread.sleep(3000);
		
		// Capture all the mobile prices
		List<WebElement> MobilePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		// Create list and store all the mobile prices in the list
		ArrayList<Integer> priceList = new ArrayList<Integer>();
		// Iterate through the prices
		for (WebElement eachPrice : MobilePrices)
		{
			String price = eachPrice.getText();
			price = price.replace(",", "");
			priceList.add(Integer.parseInt(price));
		}

		
		// Find the lowest price from the list
		Integer lowestPrice = priceList.get(0);
		for (Integer price : priceList) 
		{
			if (price < lowestPrice) 
			{
				lowestPrice = price;
			}
		}
		
		// Sort the list
		Collections.sort(priceList);
		
		// Print the price list
		System.out.println("Price List: " + priceList);
        // Print the lowest price
		System.out.println("Lowest Price is: " + lowestPrice);
		
		// Close the browser
		driver.close();
		
		
	}

}
