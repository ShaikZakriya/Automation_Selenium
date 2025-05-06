package Java_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Switch_To_WebElement();
		Switch_To_Id();
		Switch_name();
		

	}

	private static void Switch_name() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	private static void Switch_To_Id() {
		// TODO Auto-generated method stub
		
	}

	private static void Switch_To_WebElement() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
       
        
        
        WebElement iframe =  driver.findElement(By.id("//iframe[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(iframe);
        
        driver.findElement(By.xpath("//div[@class=\"tox-notification tox-notification--in tox-notification--warning\"]")).click();
        
        driver.findElement(By.id("tinymce")).clear();
        
        
        
        
        
        
        
		
	}

}
