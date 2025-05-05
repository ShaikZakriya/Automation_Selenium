package Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		

	}

}
