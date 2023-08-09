package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configclass {
	public static Properties initialiseproperty() throws IOException {
		
		Properties pr=new Properties();
		File fi=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		FileInputStream fi1=new FileInputStream(fi);
		pr.load(fi1);
		return pr;
	}

}
