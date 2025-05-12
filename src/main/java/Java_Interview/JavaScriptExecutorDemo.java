package Java_Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
/*
 * The below syntax is for java executor
 * JavascriptExecutor js = (JavascriptExecutor)driver;
 * 
 * */

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
		
driver.findElement(By.xpath("//table[@id='product']//tbody//tr/td[4]"));
List <WebElement> values = driver.findElements(By.xpath("//table[@id='product']//tbody//tr/td[4]"));

int sum = 0;
for(int i = 0; i < values.size(); i++) 
{
	sum = sum + Integer.parseInt(values.get(i).getText());
}

System.out.println( sum);
int total = Integer.parseInt(driver.findElement(By.xpath("//div[@class=\\'totalAmount\\'']")).getText().split(":")[1].trim());

Assert.assertEquals(sum, total);
		Thread.sleep(2000);
		driver.quit();

	}

}
