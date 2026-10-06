package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println("start");
//		FileInputStream fis = new FileInputStream("C:\\SELENIUM\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.setProperty("email", "kishorreddy@mail.com");
//		FileOutputStream fos =new FileOutputStream("C:\\SELENIUM\\TestData.properties");
//		prop.store(fos, "email was updated");
		PropertiesUtility pu = new PropertiesUtility();
		pu.writeDataToProperties("phone","9390546632");
		System.out.println("end");
		
		

	}

}
