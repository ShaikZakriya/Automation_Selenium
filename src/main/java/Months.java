import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Months {
	
	
    public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       
         
       //ArrayList1
         ArrayList<String> months1 = new ArrayList<>();
         months1.add("January");
         months1.add("February");
         months1.add("March");
         months1.add("May");
         months1.add("April");
         months1.add("June");
         months1.add("July");
         months1.add("August");
         months1.add("September");
         months1.add("October");
         months1.add("November");
         months1.add("December");
         
         driver.get("https://demo.automationtesting.in/Register.html");

        
         WebElement list = driver.findElement(By.xpath("//select[@placeholder='Month']"));

         
         Select sc = new Select(list);
         List<WebElement> options = sc.getOptions();

        
         ArrayList<String> monthsFromDropdown = new ArrayList<>();
         for (int i = 1; i < options.size(); i++) {
             monthsFromDropdown.add(options.get(i).getText().trim());
         }

        
         if (months1.equals(monthsFromDropdown)) {
             System.out.println("Dropdown list matches the expected list");
         } else {
             System.out.println("Mismatch found");
             System.out.println("Expected: " + months1);
             System.out.println("Actual  : " + monthsFromDropdown);
         }

         driver.quit();
        
         }
         
         
         
         
    	
        
        

        
       
        
        

    }
