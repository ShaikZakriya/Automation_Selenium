package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart_Task3 {

	public static void main(String[] args) {
		
		GreenKart();

	}

	private static void GreenKart() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> Cards = driver.findElements(By.xpath("//div[@class='product']"));
		
		for (int i=0; i<Cards.size(); i++)

		{
			Cards.get(i).click();
		
		
	}

	}
}
