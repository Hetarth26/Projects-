package browsertest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//Set up the chrome driver
		ChromeDriver driver= new ChromeDriver(options);
	    //Maximize the browser window
	    driver.manage().window().maximize();
	    //Launch the URL
	    driver.get("http://leaftaps.com/opentaps/");
	    //Enter the username and password
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //Click on login button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //Click on CRM/SFA link
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    //Click on Create Account
	    driver.findElement(By.linkText("Create Account")).click();
	    //Enter the mandatory fields
	    driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("groupNameLocal")).sendKeys("TestLeaf");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	    driver.findElement(By.name("numberEmployees")).sendKeys("1000");
	    driver.findElement(By.id("annualRevenue")).sendKeys("500000");
	    
	    //Locate the dropdown  
	    WebElement dropdown = driver.findElement(By.name("industryEnumId"));
	    //Select the option using visible text
        Select select = new Select(dropdown);
        select.selectByVisibleText("Computer Software");
        
        
        //Locate the dropdown
        WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
        //Select the option using visible text
        Select select2 = new Select(dropdown2);
        select2.selectByVisibleText("S-Corporation");
        
        //Click on the create account button 
        
       driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[22]/td[2]/input")).click(); 
        
        String Title = driver.getTitle();
		System.out.println("The title of the page is: " + Title);

		

        System.out.println("Account Created Successfully");
        
        //Close the browser
	    
	    driver.close();


	}

}
