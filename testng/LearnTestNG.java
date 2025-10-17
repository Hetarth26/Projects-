package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LearnTestNG
{
	@Test
	public  void sampleRun()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		// step 2 : load the url using .get() and maximize the window
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

	}

}