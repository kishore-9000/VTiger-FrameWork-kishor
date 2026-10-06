package practice;

import java.io.IOException;
import genericUtility.PropertiesUtility;

public class RedingDataFromPropertiesFile{
	public static void main (String[] args) throws IOException {
//	FileInputStream fis =new FileInputStream("C:\\SELENIUM\\TestData.properties");
//	Properties prop = new Properties();
//	prop.load(fis);
//	String URL=prop.getProperty("url");
//	System.out.println(URL);
		PropertiesUtility pu = new PropertiesUtility();
		String URL = pu.getDataFromProperties("url");
		String UN = pu.getDataFromProperties("username");
		String PWD = pu.getDataFromProperties("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}
}
