package imran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


 
public class Selenium_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
 Select dropdown= new Select(staticDropdown);
 Thread.sleep(2000);
 dropdown.selectByIndex(3);
 Thread.sleep(3000);
 dropdown.selectByValue("AED");
 
  

		 
	
	}

}
