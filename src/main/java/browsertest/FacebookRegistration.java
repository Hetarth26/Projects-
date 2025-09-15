package browsertest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Launch the Facebook application
		driver.get("https://en-gb.facebook.com/");
		//Decline optional cookies if any
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/span/span")).click();
		//Add implicit wait 
		Thread.sleep(3000);
		//Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		//Fill the first name
		driver.findElement(By.name("firstname")).sendKeys("Ravi");
		//Fill the last name
		driver.findElement(By.name("lastname")).sendKeys("Chopra");
		Thread.sleep(3000);
		
		//Select the day of birth from dropdown
		
		WebElement DayofBirth = driver.findElement(By.id("day"));
		Select option = new Select(DayofBirth);
		option.selectByValue("15");
		
		//Select the month of birth from dropdown
		
		WebElement MonthofBirth = driver.findElement(By.id("month"));
		Select option1 = new Select(MonthofBirth);
		option1.selectByVisibleText("May");
		
		//Select the year of birth from dropdown
		WebElement YearofBirth = driver.findElement(By.id("year"));
		Select option2 = new Select(YearofBirth);
		option2.selectByValue("1990");
		
		Thread.sleep(3000);
		
		//Select the male gender from radio button
		
		driver.findElement(By.xpath("//input[@value='2']")).click();  
		
		Thread.sleep(3000);
		
		//Enter the mobile number
		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		
		Thread.sleep(3000);
		
		//Enter the password
		
		driver.findElement(By.id("password_step_input")).sendKeys("Ravi@1234");
		
		Thread.sleep(3000);
		
		//Print the completion message 
		System.out.println("Facebook registration form completed successfully..");
		
		//Close the browser
		driver.close();
		
		
	}

}
