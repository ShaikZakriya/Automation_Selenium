package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_values {

	public static void main(String[] args) {	
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		
		List<WebElement> values = driver.findElements(By.xpath("//*[contains(text(), 'HTML')]"));
		System.out.println("Total Elements Having HTML as Text in the HTML:"+values.size());
		
		for (int i=0; i<=values.size();i++)
		{
		   System.out.println(values.get(i).getText());
		}

	}

}


