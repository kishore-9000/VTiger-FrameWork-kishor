package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactsPage {
	@FindBy(name="firstname")
	private WebElement firstNameTextField;

	@FindBy(name="lastname")
	private WebElement lastNameTextField;

	@FindBy(name="title")
	private WebElement titleTextField;
	
	@FindBy(name="departement")
	private WebElement departementTextField;
	
	@FindBy(name="email")
	private WebElement emailTextField;
	
	@FindBy(name="mobile")
	private WebElement mobileTextField;
	
	@FindBy(name="mailingcity")
	private WebElement mailingCityTextField;
	
	@FindBy(name="mailingstate")
	private WebElement mailingStateTextField;
	
	
	@FindBy(name="mailingcountry")
	private WebElement mailingCountryTextField;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartementTextField() {
		return departementTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a Business library to create a new contact
	 * @param fname
	 * @param lname
	 * @param title
	 */
	public void createNewContact(String fname,String lname,String title) {
		getFirstNameTextField().sendKeys(fname);
		getLastNameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);	
		getSaveButton().click();
	}
	/**
	 * This is a Business library to create a new contact
	 * @param lname
	 * @param department
	 * @param email
	 * @param mobile
	 */
	public void createNewContact(String lname,String department,String email,String mobile) {
		getLastNameTextField().sendKeys(lname);
		getDepartementTextField().sendKeys(department);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	/**
	 *  This is a Business library to create a new contact
	 * @param lname
	 * @param title
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lname,String title,String email,String mailingCity,
			String mailingState,String mailingCountry) {
		getLastNameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
		
	}
}
	
	
	
			
	
	
	
	





