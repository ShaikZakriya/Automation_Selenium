package imran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seliniumlocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shaik3305@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9440228678");
		driver.findElement(By.name("login")).click();
				
		
		
		
	}
		
	}