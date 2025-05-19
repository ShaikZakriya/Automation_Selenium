package Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class AutoSuggestive {

	    

		public static void main(String[] args) throws InterruptedException, IOException {
			
          FileInputStream fis= new FileInputStream("C:\\Users\\blues\\MyWork\\Automation_Selenium\\src\\main\\java\\amandata\\data.properties");
			
			Properties p=new Properties();
			p.load(fis);
			String mybrowser=p.getProperty("browser");
			System.out.println(mybrowser);
	
			
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(3000);
	    
	    List<WebElement> options= driver.findElements(By.xpath("//a[text()='India']"));
	    
		for(WebElement option: options)  
	    {
			if(option.getText().equalsIgnoreCase("India"));
			{
				option.click();
				break;
				
			}
	    }
		}

		
	}

