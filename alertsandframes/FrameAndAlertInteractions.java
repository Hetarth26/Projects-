package alertsandframes;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FrameAndAlertInteractions
{
	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.findElement(By.xpath("//div[@id='accept-choices']")).click();
		
		driver.switchTo().frame("iframeResult"); //switch to the frame"
		
		//click the try it button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click ok on the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.accept();
        //Confirm the action is performed correctly by verifying the text displayed
		
        String text = driver.findElement(By.id("demo")).getText();
        System.out.println("The text displayed is: " + text);
        String expectedText = "You pressed OK!";
		if (text.equals(expectedText)) {
			System.out.println("The action is confirmed");
		} else 
		{
			System.out.println("The action is not confirmed");
		}

        

	}

}
