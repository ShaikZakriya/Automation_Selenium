package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://passbook.epfindia.gov.in/MemberPassBook/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("101250102069");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("King@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.quit();
		
		
	

	}

}
