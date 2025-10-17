package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//Initialize the ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		//Maximize the browser window
		driver.manage().window().maximize();
		//Launch the Leaftaps application
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(leadID);
		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadID);
		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
