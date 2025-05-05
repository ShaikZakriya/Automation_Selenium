package Java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {

	public static void main(String[] args) {
//manually AL
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        
   
        
 //Get the list from UI      
        ArrayList<String> months_UI = new ArrayList<>();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");        
        WebElement dobMonth_ddl = driver.findElement(By.xpath("//select[@placeholder='Month']")); 
        Select sc = new Select(dobMonth_ddl);        
        List<WebElement> months_webElement =	sc.getOptions();  
        
        for(int i=1; i<months_webElement.size();i++)
        {
        	
        	String temp = months_webElement.get(i).getText();
        	String trimmed = temp.trim();
        	months_UI.add(trimmed);
        	
        }
    
         
        System.out.println(months);
       System.out.println(months_UI);
         
        if(months.equals(months_UI))
        {
        	System.out.println("Test Case Pass- Months are in order");
        }
        else
        {
        	System.out.println("Test Case Fail- Months are Not in order");
        }
         driver.quit();
         
         
         
         
	}
	
         

       
}
