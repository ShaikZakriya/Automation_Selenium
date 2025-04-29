package framebuilding_blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		
		readPersonalData("name");	
		readPersonalData("age");
		readPersonalData("State");
		readPersonalData("Street");
	}

	private static void readPersonalData(String key) throws IOException {
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\TestData\\personalData.properties";
		File file = new File (path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);		
		System.out.println(prop.get(key));

	}
		
		
}
