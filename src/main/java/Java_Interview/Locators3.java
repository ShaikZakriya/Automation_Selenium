package Java_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
	   System.out.println(driver.findElement(By.xpath("//div/button[2]/parent::div/button[2]")).getText());

	}

}
