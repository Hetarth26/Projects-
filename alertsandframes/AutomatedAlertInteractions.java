package alertsandframes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedAlertInteractions {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();;
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click on prompt alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		//switch to alert
		Alert alert  = driver.switchTo().alert();
		alert.sendKeys("TestLeaf");
		//wait for 3 seconds
		Thread.sleep(3000);
		//click ok
		alert.accept();
		//Retrieve the text and verify
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("The text displayed for first alert is: " + text);
		String expectedText = ("User entered name as: TestLeaf");
		if (text.equals(expectedText))
		{
			System.out.println("The text is verified");
		} else 
		{
			System.out.println("The text is not verified");
		}
		
		//Dismiss the alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button")).click();
		//wait for 3 seconds
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		//wait for 3 seconds
		Thread.sleep(2000);
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println("The text displayed for second alert is: " + text2);
		String expectedText2 = ("User Clicked : Cancel");
		if (text2.equals(expectedText2))
		{
			System.out.println("The text is verified");
		}
		else
		{
			System.out.println("The text is not verified");
		}
		
		
		driver.close();
	}

}
