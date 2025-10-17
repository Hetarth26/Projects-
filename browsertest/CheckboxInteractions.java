package browsertest;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxInteractions
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on notification checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Verify that the expected message is displayed 

        String alert = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
        System.out.println("Alert message: " + alert);
		String expectedMessage = "Checked";
		if (alert.equals(expectedMessage)) 
		{
			System.out.println("The message is verified");
		} 
		else 
		{
			System.out.println("The message is not verified");
		}
		
		
		//Select favourte language as Java
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//click on the Tri State Checkbox
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]")).click();
	
		//Click on the toggle switch 
		WebElement toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggle.click();
		
		
		
		//Verfiy the expected message is displayed
		String toggleMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String expectedToggleMessage = "Checked";
		if (toggleMessage.equals(expectedToggleMessage)) 
		{
			System.out.println("The toggle message is verified");
		} 
		else 
		{
			System.out.println("The toggle message is not verified");
		}
		
		
		
		//Verify is the checkbox is disabled 
		WebElement disabledCheckbox = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
		boolean isEnabled = false;
		if (!isEnabled) 
		{
			System.out.println("The checkbox is disabled");
		} 
		else
		{
			System.out.println("The checkbox is enabled");
		}

		//Select multiple options from the dropdown
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='ui-selectcheckboxmenu']")));

        dropdown.selectByVisibleText("London");
        dropdown.selectByVisibleText("Paris");
        dropdown.selectByVisibleText("Rome");
        
        
		//Close the browser
		driver.close();
		
		

	}



}
