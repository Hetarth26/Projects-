package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		// step 2 : load the url using .get() and maximize the window
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// step 3 : locate the username field
		WebElement userName = driver.findElement(By.id("username"));
		// step 4 : Enter the valid username --> "demosalesmanager"
		userName.sendKeys("demosalesmanager");
		// step 5 : Locate the password field
		WebElement password = driver.findElement(By.name("PASSWORD"));
		// step 6 : Enter the valid password --> "crmsfa" for the given username
		password.sendKeys("crmsfa");
		// step 7 : Locate the login button then click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// step 8 : Print the title of the page
		driver.findElement(By.partialLinkText("CRM")).click();
		String titleOfTheLeaftaps = driver.getTitle();
		System.out.println(titleOfTheLeaftaps);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// step 9 :  identify the element & instantiate the select class
		WebElement selectDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option = new Select(selectDropdown);
		option.selectByValue("LEAD_EMPLOYEE");
		
		// step 10 : select the option by visible text
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2 = new Select(marketingCampaign);
		option2.selectByVisibleText("Automobile");
		
		// step 11 : select the option by value
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option3 = new Select(Ownership);
		option3.selectByValue("OWN_CCORP");
		
		//Click on sumbit button
		driver.findElement(By.name("submitButton")).click();
		
		String Title = driver.getTitle();
        System.out.println("The title of the page is: " + Title);
		
	    driver.close();
	}

}
