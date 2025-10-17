package parameterization;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod
{
	ChromeDriver driver;
	@Parameters({"url","username","password"})

	@BeforeMethod
	//Create two methods: preCondition and postCondition
	public void preCondition(String url, String uname, String pwd)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//initalize the driver instance
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("url");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

	
}
