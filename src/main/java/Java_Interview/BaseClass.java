package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import groovy.beans.PropertyReader;

public class BaseClass {
	

	public static void main(String[] args) {
	
		String browser = PropertyReader.readPropertyData("Browser");



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

            Thread.sleep(3000);

            driver.quit();

        }

  



}








		
	}

