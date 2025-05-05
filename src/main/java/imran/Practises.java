package imran;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practises {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.xpath("name=email")).sendKeys("immu123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("id=\"pass\"")).sendKeys("9440228678");
		
			driver.findElement(By.xpath("//button[@type=\"submit\"]]")).click();
			driver.quit();
	}

}
