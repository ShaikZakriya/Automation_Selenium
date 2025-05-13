package Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Odd_countries {

    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Navigate to the demo site
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.xpath("//select"));

        // Use Select class to handle the dropdown
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();

        System.out.println("Countries at odd positions:");

        // Loop through the dropdown options and print only those at odd positions (1st, 3rd, 5th, etc.)
        for (int i = 0; i < options.size(); i++) {
            if (i % 2 == 0) {  // Even index = Odd position (1st, 3rd, etc.)
                String country = options.get(i).getText();
                System.out.println(country);
            }
        }

        // Close the browser
        driver.quit();
    }
}