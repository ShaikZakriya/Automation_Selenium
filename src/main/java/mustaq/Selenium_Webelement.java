package mustaq;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> links = driver.findElements(By.xpath("//*[contains(text(), 'HTML')]"));
		
		for(int i=0; i<=links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			
			

		}

		

	}
}
