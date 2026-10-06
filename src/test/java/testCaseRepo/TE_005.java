package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactsPage;
import objectRepo.HomePage;

public class TE_005  extends BaseClass {

	@Test
	public void CN_002() throws EncryptedDocumentException, IOException {

		HomePage hp=new HomePage(driver);
		hp.getContactsMenu().click();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String lastname=eutil.getDataFromExcel("Contacts", 4, 1);
		String department=eutil.getDataFromExcel("Contacts", 4, 2);
		String email=eutil.getDataFromExcel("Contacts", 4, 3);
		String mobile=eutil.getDataFromExcel("Contacts", 4, 4);
		CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
		cncp.createNewContact(lastname, department, email, mobile); 


	}
}

