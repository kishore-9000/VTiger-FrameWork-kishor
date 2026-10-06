package objectRepo;
/**
 * @author kishore
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Locating the webelements
	@FindBy(name = "user_name")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement passwordTextField;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	//Initilizing the webelements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Getter methods 

	public LoginPage() {
		
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Utilization of the webelements
	/**
	 * @author kishore
	 */
	public void loginToApplication(String UN,String PWD) {
		getUsernameTextField().sendKeys(UN);
		getPasswordTextField().sendKeys(PWD);
		getLoginBtn().click();
	}
}
		
	
	

	
	


