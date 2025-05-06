package Framwork_BuildingBlocks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Switchs_To_WebElement(null);
		Switch_To_Index(2);
		Switch_nameId("zakir");
		
		
		

	}

	private static void Switchs_To_WebElement(WebElement ele) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
       
        
        
        driver.switchTo().frame(ele);
        
        driver.findElement(By.xpath("//button[@class=\"tox-notification__dismiss tox-button tox-button--naked tox-button--icon\"]")).click();
        
        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(2000);
        
       // driver.findElement(By.id("tinymce")).sendKeys("ZR Zakir");
       
        
        driver.quit();
		
	}

	private static void Switch_nameId(String nameid) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(nameid);
		
		
		
		
	}

	private static void Switch_To_Index(int x) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
       driver.switchTo().frame(x);
		
	}

	private static void Switch_To_WebElement(WebElement ele) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
       
        
        
        driver.switchTo().frame(ele);
        
        driver.findElement(By.xpath("//button[@class=\"tox-notification__dismiss tox-button tox-button--naked tox-button--icon\"]")).click();
        
        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(2000);
        
        driver.findElement(By.id("tinymce")).sendKeys("Zakriya");
        Thread.sleep(2000);
        
        
        
        
       // driver.findElement(By.id("tinymce")).sendKeys("ZR Zakir");
       
        
        driver.quit();
        
   
        
		
	}

}
