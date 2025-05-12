package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        WebDriver driver = null;
        
        FileInputStream fis = new FileInputStream("src/main/java/utils/config.properties");
        prop.load(fis);
        
    }
}