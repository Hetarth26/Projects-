package browsertest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		//Set up the chrome driver 
	    ChromeDriver driver = new ChromeDriver();  
	    //Maximize the browser window
	    driver.manage().window().maximize();
	    //Launch the URL
	    driver.get("http://www.google.com/");   
	    driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
	    
	    //Wait for 3 seconds
	    Thread.sleep(4000);
	    
	    System.out.println("Test is completed successfully");
	    //Close the browser
	    driver.close();

	}

}
