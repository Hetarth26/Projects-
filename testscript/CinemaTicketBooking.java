package testscript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CinemaTicketBooking
{

	public static void main(String[] args) throws InterruptedException
	{

		// Set up the chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://www.myvue.com/");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Accept cookies
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
		//SCroll down 
		driver.executeScript("window.scrollBy(0,500)");
		//Select location as Accrington
		driver.findElement(By.xpath("//span[@class='dropdown-opener__title-value']")).click();
		driver.findElement(By.xpath("//span[text()='Accrington']")).click();
		Thread.sleep(2000);
		//Select Movie as The Conjuring: Last Rites
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[@data-test = 'top-films-card-0-title-clickable']")).click();
		Thread.sleep(2000);
		// Select Date as tomorrow
		driver.findElement(By.xpath("//button[@data-test='filters-day-Tomorrow']")).click();
		Thread.sleep(2000);
		//Select time as 12:00 in screen 2
		driver.findElement(By.xpath("//a[@data-test='session-0']")).click();
		Thread.sleep(2000);
		//scroll down
		driver.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//Select 1 seat in standard
		driver.findElement(By.xpath("//button[4]//img[1]")).click();
		
		//Enter email id 
		driver.findElement(By.xpath("//input[@aria-label='Guest email']")).sendKeys("hetarthajoshi@gmail.com");
		//Get the seat number and print
		String seatNumber = driver.findElement(By.xpath("//span[@class='selected-seats__name']")).getText();
		System.out.println("The selected seat number is: " + seatNumber);
		//Get the total payable amount and print
		String totalAmount = driver.findElement(By.xpath("//dd[@data-test='footer-total-price']")).getText();
		System.out.println("Total payable amount is: " + totalAmount);
		//Click on review and pay button
		driver.findElement(By.xpath("//button[@data-test='review-and-pay-button']")).click();
		//Get the page title and close the browser
		String pageTitle = driver.getTitle();
		System.out.println("The current page title is: " + pageTitle);
		System.out.println("Test Script for booking process executed successfully....");
		driver.quit();
		
			
	}

}
