package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactsPage;
import objectRepo.HomePage;

public class TE_004  extends BaseClass {
		
		@Test
		public  void CON_001() throws EncryptedDocumentException, IOException {
			
			HomePage hp=new HomePage(driver);
			hp.getContactsMenu().click();
			ContactsPage cp=new ContactsPage(driver);
			cp.clickOnCreatingNewContactIcon();
		    String firstname=eutil.getDataFromExcel("Contacts", 1, 1);
		    String lastname=eutil.getDataFromExcel("Contacts", 1, 2);
		    String title=eutil.getDataFromExcel("Contacts", 1, 3);
		    CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
		    cncp.createNewContact(firstname, lastname, title);
		    
			
			
		}

	}


