package Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Odd_countries {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			
			WebElement dropdown = driver.findElement(By.xpath("//select"));
		    
		    Select sc = new Select(dropdown);
		    List<WebElement> options = sc.getOptions();
		    int length = options size();
		    
		    for (int i =0; i<=options.size(); i++) {
		    	
		   
		    	if(!(i%2==0));
		    	
		    	{
		    		String str = Alloptions.get(i).getText();
		    		
		    		
		    	}
		    	
		    	
		    	
		    	
		    }
		    		
		    
		    
		  
		}
		    

	}

