package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProjectSpecificMethod
{
	ChromeDriver driver;
	@BeforeMethod
	//Create two methods: preCondition and postCondition
	public void preCondition()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//initalize the driver instance
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

	
}
