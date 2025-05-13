package AlphaPractise;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Greenkart_Task {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			WebElement cucumber = driver.findElement(By.xpath("//div[@class='product' and . //h4[text()='Cucumber - 1 Kg']]//a[@class='increment']"));
			
			for (int i=0; i<4; i++)
			{
				cucumber.click();
				Thread.sleep(1000);
			}
			
	            driver.quit();
		}

	}

