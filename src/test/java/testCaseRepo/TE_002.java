package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TE_002  extends BaseClass  {
	      
		
		@Test
	       public void LE_002() throws EncryptedDocumentException, IOException {
			
			HomePage hp=new  HomePage(driver);
			hp.getLeadsMenu().click();
			LeadsPage lp=new LeadsPage(driver);
			lp.clickOnCreateNewLeadIcon();
			String lastname=eutil.getDataFromExcel("Leads", 4, 1);
			String company=eutil.getDataFromExcel("Leads", 4, 2);
			String title=eutil.getDataFromExcel("Leads", 4, 3);
			String leadsource=eutil.getDataFromExcel("Leads", 4, 4);
			String noofemp=eutil.getDataFromExcel("Leads", 4, 5);
			CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
			cnlp.creatingNewLeadPage(lastname, company, title, noofemp, leadsource);
		}
		

	}

