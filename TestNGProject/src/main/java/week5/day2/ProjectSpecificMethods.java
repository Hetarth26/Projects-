package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	// declaring the driver as the global variable
	RemoteWebDriver driver;

	@Parameters({ "url", "uname", "pword", "browser" })
	@BeforeMethod
	public void preConditions(String url, String userName, String password, String browser) {
		// initializing the driver instance
		switch (browser.toLowerCase()) {
		case "firefox":
			FirefoxOptions optFirefox = new FirefoxOptions();
			optFirefox.addArguments("--private");
			driver = new FirefoxDriver(optFirefox);
			System.out.println("firefox browser will be used to execute the current script");
			break;
		case "edge":
			EdgeOptions optEdge = new EdgeOptions();
			optEdge.addArguments("--inprivate");
			driver = new EdgeDriver(optEdge);
			System.out.println("edge browser will be used to execute the current script");
			break;
		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			System.out.println("chrome browser will be used as the default browser to execute the current script");
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}

}
