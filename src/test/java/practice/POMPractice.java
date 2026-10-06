package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.LoginPage;

public class POMPractice {

	@FindBy(name = "uesr_name") WebElement usernameTf;
	
	public  POMPractice(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	

	public static void main(String[] args) throws IOException {
		SeleniumUtility sutil = new  SeleniumUtility();
		PropertiesUtility putil = new	PropertiesUtility();
		WebDriver driver = new ChromeDriver();
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		String URL = putil.getDataFromProperties("url");
		String UN = putil.getDataFromProperties("username");
		String PWD = putil.getDataFromProperties("password");
		sutil.accessApplication(driver, URL);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);






	}
	
		
	}


