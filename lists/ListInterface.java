package lists;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ListInterface
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
        driver.findElement(By.name("searchVal")).sendKeys("bags");
        driver.findElement(By.className("ic-search")).click();
        //Under the gender filter select men 
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        //And then select the category as fashion bags
        driver.findElement(By.xpath("//label[@class=facet-linkname facet-linkname-categorytype']")).click();
        //Get the count of the items found.
        String items = driver.findElement(By.className("length")).getText();
        System.out.println("The count of items found is: " + items);
        //Get the list of brand of the products displayed in the page and print the list
        List<WebElement> brandList = driver.findElements(By.className("brand"));
        System.out.println("The list of brands are: ");
        for (WebElement brand : brandList)
        {
        	System.out.println(brand.getText());
        }
        //Get the list of names of the bags and print it
        List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
        System.out.println("The list of bag names are: ");
		for (WebElement name : bagNames)
		{
			System.out.println(name.getText());
		}
		driver.close();
		       
        
	}

}
