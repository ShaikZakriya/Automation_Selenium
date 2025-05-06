package Framwork_BuildingBlocks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ScrollAndClickGoogleIcon {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


      driver.get("https://demo.automationtesting.in/Register.html");

      WebElement googleIcon = driver.findElement(By.xpath("//footer//a[contains(@href,'plus.google.com')]"));

     // Scroll to the Google+ icon
      JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].scrollIntoView(true);", googleIcon);
     Thread.sleep(2000);
     
     js.executeScript("arguments[0].click();",googleIcon);
     
     System.out.println("Google Icon Clicked Successfully");
     Thread.sleep(2000);
        driver.quit();
        
     
      
    }
}
