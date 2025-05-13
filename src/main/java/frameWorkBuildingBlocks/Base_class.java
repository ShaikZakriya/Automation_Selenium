package frameWorkBuildingBlocks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {

	public static void main(String[] args) throws IOException {
		
		String browser = PropertyReader.PropertyReaderData("Browser");



		WebDriver driver = null;


		if (browser.equalsIgnoreCase("chrome"))

		{

		driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge"))

		{

		driver = new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox"))

		{

		driver = new FirefoxDriver();

		}

		else

		{

		System.out.println("Invalid browser name in property file");

		}



		if (driver != null) {

		driver.get("https://www.google.com");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

		}

		}


		}




		
		


