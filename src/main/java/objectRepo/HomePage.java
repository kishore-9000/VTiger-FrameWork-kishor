package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}

	public void logoutOperatiom(WebDriver driver) {
		
		SeleniumUtility sutil = new SeleniumUtility();
		sutil.mouseHovering(driver, getAccountIcon());
		getSignoutOption().click();
	}
}