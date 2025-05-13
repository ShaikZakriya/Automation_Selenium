package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
	

	
				WebDriver driver = new ChromeDriver();
				
				//launching the url
				driver.get("https://www.facebook.com/login/");
				
				//finding the elements
				 WebElement   UserId   = driver.findElement(By.xpath("//input[@id='email']"));
				 WebElement   Password = driver.findElement(By.xpath("//input[@type='password']"));
				 WebElement   Loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
				 
				 //Operations on elements
				 UserId.sendKeys("8317602586");
				 Thread.sleep(3000);
				 Password.sendKeys("Aman 2001");
				 Thread.sleep(3000);
				 Loginbtn.click();
				 Thread.sleep(3000);
				
				
				
				
				
				
			}

		

	}

