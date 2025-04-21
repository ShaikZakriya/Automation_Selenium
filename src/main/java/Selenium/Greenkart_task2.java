package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart_task2 {

	public static void main(String[] args) {
		
		Task_Greenkart();

	}

	private static void Task_Greenkart() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement product = driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']"));

		
		if(product.isDisplayed()) 
		{
			System.out.println("Product Name: " + product.getText());
		}
		
		else {
			System.out.println("Product not found");
		}
		
		driver.quit();
	}

}
