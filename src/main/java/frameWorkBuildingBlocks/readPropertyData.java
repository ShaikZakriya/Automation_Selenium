package frameWorkBuildingBlocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyData {

	public static void main(String[] args) throws IOException {
		
		String value = getPropertyData("browser");
		System.out.println(value);
		

//		
		

	}

	static String getPropertyData(String Key) throws IOException {
		// TODO Auto-generated method stub
	
			
			Properties prop = new Properties();
			String path = System.getProperty("user.dir")+"\\TestData\\propertyFile.properties";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			String value = prop.getProperty(Key);
			
			return value;
		
	}

	private static void readpersonalData(String key) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\TestData\\personalData.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String value = prop.getProperty(key);
		System.out.println(prop.getProperty(key));
	}



}
