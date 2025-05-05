import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightclickExample {

	public static void main(String[] args) {
		
	
        // Initialize the WebDriver and open the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); // Replace with your URL

        // Locate the element to right-click on
        WebElement element = driver.findElement(By.id("rightClickButton")); // Replace with actual element locator

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform a right-click (context click)
        actions.contextClick(element).perform();

        // Add some delay or verification logic if needed
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to see the effect
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
		// TODO Auto-generated method stub
		
	}

}
