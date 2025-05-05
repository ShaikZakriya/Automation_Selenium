package Java_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    
	    int i = 5;
	while(i<5)
	{
		driver.findElement(By.id("hrefDecAdt")).click();
		i++;
		
		
		
	}
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    

	}

}
