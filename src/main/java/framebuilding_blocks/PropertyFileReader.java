package framebuilding_blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		
		//readPersonalData("Name");
		String browserType = educationData("browserType");
		System.out.println(browserType);
//		readPersonalData("age");
//		readPersonalData("State");
//		readPersonalData("Street");
	}

private static String educationData(String key) throws IOException {
	 Properties prop = new Properties();
	 String path = System.getProperty("user.dir")+"\\TestData\\EducationData.properties";
	 FileInputStream fis = new FileInputStream(path);
	 prop.load(fis);
		
	 String value = prop.getProperty(key);
	 //System.out.println(value);
	 
	 return value;
		
	}

//	private static void readPersonalData(String key) throws IOException {
//		
//		Properties prop = new Properties();
//		String path = System.getProperty("user.dir")+"\\TestData\\personalData.properties";
//		File file = new File (path);
//		FileInputStream fis = new FileInputStream(file);
//		prop.load(fis);		
//		System.out.println(prop.get(key));
//
//	}
	
	private static void readPersonalData(String key) throws IOException {
	    Properties prop = new Properties();
	    String path = System.getProperty("user.dir")+"\\TestData\\Educational.properties";
	    File file = new File(path);
	    FileInputStream fis = new FileInputStream(file);
	    prop.load(fis);
	    System.out.println(prop.getProperty(key));
	}
}
	
