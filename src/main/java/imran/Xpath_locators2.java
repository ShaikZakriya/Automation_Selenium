package imran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locators2{

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("immu__s07");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Iamimmu@123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
driver.findElement(By.xpath("//div[@role=\"button\"]")).click();
	}

}
