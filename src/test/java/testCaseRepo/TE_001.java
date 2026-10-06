package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TE_001  extends BaseClass {
		
		@Test
		public void LE_01() throws EncryptedDocumentException, IOException {
			
			 HomePage hp=new  HomePage(driver);
			 hp.getLeadsMenu().click();
			 LeadsPage lp=new LeadsPage(driver);
			 lp.clickOnCreateNewLeadIcon();
			 String firstname=eutil.getDataFromExcel("Leads", 1, 1);
			 String lastname=eutil.getDataFromExcel("Leads", 1, 2);
			 String company=eutil.getDataFromExcel("Leads", 1, 3);
			 CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
			 cnlp.creatingNewLeadPage(firstname, lastname, company);
			  
			
		} 
		
		
		

	}


