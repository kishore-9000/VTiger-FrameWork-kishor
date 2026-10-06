package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;

	@FindBy(xpath="//input[@name='company']")
	private WebElement companyNameTextField;

	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleNameTextField;

	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadsourceDropdown;

	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noofempTextField;

	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNOTextField;

	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;

	@FindBy(xpath="//input[@name='city']")
	private WebElement cityNameTextField;

	@FindBy(xpath="//input[@name='state']")
	private WebElement stateNameTextField;

	@FindBy(xpath="//input[@name='country']")
	private WebElement countryNameTextField;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;


	public  CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}


	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}


	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}


	public WebElement getTitleNameTextField() {
		return titleNameTextField;
	}


	public WebElement getLeadSourceDropdown() {
		return leadsourceDropdown;
	}


	public WebElement getNoofempTextField() {
		return noofempTextField;
	}


	public WebElement getMobileNOTextField() {
		return mobileNOTextField;
	}


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getCityNameTextField() {
		return cityNameTextField;
	}


	public WebElement getStateNameTextField() {
		return stateNameTextField;
	}


	public WebElement getCountryNameTextField() {
		return countryNameTextField;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * This is the Business library to create the new lead
	 * @param fname
	 * @param lname
	 * @param company
	 */
	public void creatingNewLeadPage(String fname , String lname , String company) {

		getFirstNameTextField().sendKeys(fname);	
		getLastNameTextField().sendKeys(lname);
		getCompanyNameTextField().sendKeys(company);
		getSaveBtn().click();
	}
	/**
	 * This is the Business library to create the new lead
	 * @param Name
	 * @param company
	 * @param title
	 * @param leadsource
	 * @param noOfEmps
	 */
	public void creatingNewLeadPage(String Name , String company , String title , String leadsource, String noOfEmps) {
		getLastNameTextField().sendKeys(Name);
		getCompanyNameTextField().sendKeys(company);
		getTitleNameTextField().sendKeys(title);
		new SeleniumUtility().selectOptionByValue(getLeadSourceDropdown(), leadsource);
		getNoofempTextField().sendKeys(noOfEmps);
		getSaveBtn().click();
	}

	/**
	 * This is the Business library to create the new lead
	 * @param Name
	 * @param company
	 * @param mobile
	 * @param email
	 * @param city
	 * @param state
	 * @param country
	 */
	public void creatingNewLeadPage(String Name , String company , String mobile , String email, String city, String state,String country) {
		getLastNameTextField().sendKeys(Name);
		getCompanyNameTextField().sendKeys(company);
		getMobileNOTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getCityNameTextField().sendKeys(city);
		getStateNameTextField().sendKeys(state);
		getCountryNameTextField().sendKeys(country);
		getSaveBtn().click();
	
		
	}
}
 























