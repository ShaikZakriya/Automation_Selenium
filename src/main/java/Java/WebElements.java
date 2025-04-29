package Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/default.asp");
		
		 
		 List<WebElement> values= driver.findElements(By.xpath("//*[contains(text(),'HTML')]"));
		 
		 System.out.println("Total number of elements are 143");
		 
		 for(int i=0; i<=values.size(); i++) 
		 {
			 System.out.println(values.get(i).getText());
		 }
		 
		 driver.close();
		 
	}
			
			
		

}
   