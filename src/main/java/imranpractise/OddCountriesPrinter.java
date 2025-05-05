package imranpractise;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OddCountriesPrinter {
    public static void main(String[] args) {
      
      ///  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

     
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

            
            driver.manage().window().maximize();

           
            WebElement countryDropdown = driver.findElement(By.xpath("//select"));

      

            
            Select selectCountry = new Select(countryDropdown);

            List<WebElement> allOptions = selectCountry.getOptions();

            System.out.println("Countries at odd-numbered positions:");

           
            for (int i = 0; i < allOptions.size(); i++) {
                if (i % 2 == 0) { 
                    System.out.println(allOptions.get(i).getText());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}
