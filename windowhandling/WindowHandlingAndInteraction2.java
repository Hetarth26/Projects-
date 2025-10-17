package windowhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteraction2
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//initialize WebDriver
		ChromeDriver driver = new ChromeDriver(options);
		//maximize window
		driver.manage().window().maximize();
		//launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		//Click Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();	
		String ParentTitle = driver.getTitle();
	
		System.out.println("Parent Window Title: " + ParentTitle);
		
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
	
		String ParentWindowID = windowList.get(0);
		String ChildWindowID = windowList.get(1);
		Thread.sleep(2000);
		//Switch to the new window
		driver.switchTo().window(ChildWindowID);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		//Switch back to Parent window
		driver.switchTo().window(ParentWindowID);
		//Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowList1 = new ArrayList<>(windowHandles1);
		
	
		String ParentWindowID1 = windowList1.get(0);
		String ChildWindowID1 = windowList1.get(1);
		
		//Switch to the new window
		driver.switchTo().window(ChildWindowID1);
		String ChildTitle = driver.getTitle();
		System.out.println("Child Window Title: " + ChildTitle);
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		//Switch back to Parent window
		driver.switchTo().window(ParentWindowID1);
		driver.findElement(By.className("buttonDangerous")).click();
		//Accept the Alert
		driver.switchTo().alert().accept();
		driver.switchTo().window(ParentWindowID1);
		//get title after merge
		String AfterMergeTitle = driver.getTitle();
		System.out.println("Title after merge: " + AfterMergeTitle);
		String verifyTitle = "View Contact | opentaps CRM";
		if(AfterMergeTitle.equals(verifyTitle))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		//close the browser
		driver.quit();
		

	}

}
