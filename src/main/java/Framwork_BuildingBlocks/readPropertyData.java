package Framwork_BuildingBlocks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyData {



			public static void main(String[] args) throws IOException {
				
				String value = readPropertyData.properties("browser");
				System.out.println(value);
				

//				
				

			
				
			}

		

			private static String properties(String string) {
				// TODO Auto-generated method stub
				return null;
			}



			private static void readPropertyData(String key) throws IOException {
				// TODO Auto-generated method stub
				
				
				Properties prop = new Properties();
				String path = System.getProperty("user.dir")+"TestData\\Readproperty.properties";
				File file = new File(path);
				FileInputStream fis = new FileInputStream(file);
				prop.load(fis);
				String value = prop.getProperty(key);
				System.out.println(prop.getProperty(key));
		


	}



}
