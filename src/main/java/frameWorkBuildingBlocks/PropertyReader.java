package frameWorkBuildingBlocks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	
		public static String PropertyReaderData(String key) throws IOException {

			Properties prop = new Properties();

			String path = System.getProperty("user.dir")+"\\TestData\\PropertyReader";

			FileInputStream fis = new FileInputStream(path);

			prop.load(fis);


			String value = prop.getProperty(key);

			System.out.println(value);


			return value;

	}

}
