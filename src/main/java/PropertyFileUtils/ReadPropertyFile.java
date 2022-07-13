package PropertyFileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public FileInputStream fis;
	public Properties prop;
	
	public void readPropertyFile()
	{
	
	 try {
		fis= new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/java/PropertyFileUtils/config.properties"));
	} catch (FileNotFoundException e) {
		
		System.out.println("Config property file not found");
	}
	 prop= new Properties();
	 try {
		prop.load(fis);
	} catch (IOException e) {
		
		System.out.println("Property File is not loaded");
	}
	 
}
	
	public String getProperty(String key)
	{
		return prop.getProperty(key);
	}
	
}
