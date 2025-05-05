package imran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Dynamic {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("to-testID-origin")).click();
		driver.findElement(By.xpath("//div[@class=css-76zvg2 r-cqee49 r-ubezar r-1kfrs79])[11]")).click();
		driver.findElement(By.xpath("//div[@class=css-76zvg2 r-cqee49 r-ubezar r-1kfrs79])[24]")).click();
		
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
