package frameWorkBuildingBlocks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverObjectCreation {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		String browserType = readPropertyData.getPropertyData("browser");
		System.out.println(browserType);
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();	
			
		}
		
	else if(browserType.equalsIgnoreCase("ie"))
		{
			
			driver = new InternetExplorerDriver();					
		}
		
	else if(browserType.equalsIgnoreCase("edge"))
		{
			
		 	driver = new EdgeDriver();	
		 	
		}
		
		driver.get("https://en.wikipedia.org/wiki/India");
	
	
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	
	

}
