package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactsPage;
import objectRepo.HomePage;

public class TE_006 extends BaseClass{
		
		@Test
		public void CN_003() throws EncryptedDocumentException, IOException {
			
			HomePage hp=new HomePage(driver);
			hp.getContactsMenu().click();
			ContactsPage cp=new ContactsPage(driver);
			cp.clickOnCreatingNewContactIcon();
			String lastname=eutil.getDataFromExcel("Contacts", 7, 1);
			String title=eutil.getDataFromExcel("Contacts", 7, 2);
			String email=eutil.getDataFromExcel("Contacts", 7, 3); 
			String mailingCity=eutil.getDataFromExcel("Contacts", 7, 4);
			String mailingstate=eutil.getDataFromExcel("Contacts", 7, 5);
			String mailingCountry=eutil.getDataFromExcel("Contacts", 7, 6);
			CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
			cncp.createNewContact(lastname, title, email, mailingCity, mailingstate, mailingCountry);
			
			
			
		}

	}


