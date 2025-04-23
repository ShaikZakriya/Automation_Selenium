package mustaq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oddnumbers_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 WebElement dropdownElement = driver.findElement(By.xpath("//select"));
		 
		 Select sc = new Select(dropdownElement);
		 
		 
		List<WebElement> options =  sc.getOptions();
		int lenght = options.size();
		 
		for(int i=0; i<=lenght; i++)
		{
			String str = options.get(i).getText();
			
			if(!(i%2==0))
			{
				System.out.println(str);
			}
			
			
		}
		
		
		
		
		
	}

}
