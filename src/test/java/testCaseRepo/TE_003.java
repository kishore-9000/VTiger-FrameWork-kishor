package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TE_003  extends BaseClass {
		
		@Test
		public void  LE_003() throws EncryptedDocumentException, IOException  {
			
			HomePage hp=new HomePage(driver);
			hp.getLeadsMenu().click();
			LeadsPage lp=new LeadsPage(driver);
			lp.clickOnCreateNewLeadIcon();
			String lasrtname=eutil.getDataFromExcel("Leads", 7, 1);
			String companyname=eutil.getDataFromExcel("Leads", 7, 2);
			String  mobile=eutil.getDataFromExcel("Leads", 7, 3);
			String email=eutil.getDataFromExcel("Leads", 7, 4);
			String city=eutil.getDataFromExcel("Leads", 7, 5);
			String state=eutil.getDataFromExcel("Leads", 7, 6);
			String coutry=eutil.getDataFromExcel("Leads", 7, 7);
			 CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
			cnlp.creatingNewLeadPage(lasrtname, companyname, mobile, email, city, state, coutry); 
			
	}

	}

