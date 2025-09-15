package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin
{

	public static void main(String[] args)
	{
		//Set up the chrome driver 
	    ChromeDriver driver= new ChromeDriver();  
	    //Maximize the browser window
	    driver.manage().window().maximize();
	    //Launch the URL
	    driver.get("https://www.facebook.com/"); 
	    //Decline the cookies 
	    driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/span/span")).click();
	    //Enter the username and password
	    driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	    //Click on login button 
	    driver.findElement(By.name("login")).click();
	    //Go to find your account and login 
	    driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a")).click();
	    //Get the title of the page and print 
	    String Title = driver.getTitle();
	    String ExpectedTitle = "Forgotten Password | Can't Log In | Facebook";
		if (Title.equals(ExpectedTitle)) {
			System.out.println("The title of the page is as expected: " + Title);
	} 
		
	    
	    driver.close();
	    
	    
}

}
