package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties p ;
	
	static {
	
	try {
		
	FileInputStream file = new FileInputStream("src/test/resources/configuration.properties");
	p = new Properties();
	p.load(file);
	}
	catch(IOException e)
	{
		System.out.println("failed to load properties file : " + e.getMessage());
	}
  }
	
	public static String getProperty(String key)
	{
		return p.getProperty(key);
	}
}

