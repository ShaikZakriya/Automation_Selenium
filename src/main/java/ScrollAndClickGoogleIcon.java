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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        // Open the website
//        driver.get("https://demo.automationtesting.in/Register.html");
//
//        // Find the Google Icon
//        WebElement googleIcon = driver.findElement(By.xpath("//footer//a[contains(@href,'plus.google.com')]"));
//
//        // Scroll to the Google+ icon
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", googleIcon);
//
//        // Wait for 1 second just to ensure scroll
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        googleIcon.click();
//        Thread.sleep(2000);
//
//        driver.quit();
        
      JavascriptExecutor js=(JavascriptExecutor)driver;
      
      
     js.executeScript("");
      
    }
}
