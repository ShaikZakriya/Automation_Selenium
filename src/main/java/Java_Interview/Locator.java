package Java_Interview;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"oxd-topbar-header-userarea\"]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000); 
		driver.quit();
		
		//need to work on Assertions 
		
		

	}

}
