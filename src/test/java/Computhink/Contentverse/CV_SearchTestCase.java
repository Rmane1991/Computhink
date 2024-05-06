package Computhink.Contentverse;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CV_SearchTestCase extends Base{

	WebDriver driver;
	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	CV_Search cvSP;
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 driver = launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
		 cvSP = new CV_Search(driver);
	}
	
	@Test
	public void searchDocument() throws Exception
	{
		//cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvSP.advanceSearch();
		Thread.sleep(3000);
		
		cvSP.folderLocation();
		cvSP.listOfCabinatesPresentInDataBase(sheet.getRow(3).getCell(3).getStringCellValue());
		cvSP.selectDrawerPresentInCabinet(sheet.getRow(3).getCell(5).getStringCellValue());
		cvSP.selectFolderPresentInDrawer(sheet.getRow(3).getCell(7).getStringCellValue());
		cvSP.clickOkButton(); 
		
		//cvSP.selectDocumentType(getCustomDocumentType());
		//cvSP.selectDocumentCreator(getCustomDocumentCreator());
		cvSP.selectDocumentType(sheet.getRow(14).getCell(3).getStringCellValue());
		cvSP.selectDocumentCreator(sheet.getRow(14).getCell(5).getStringCellValue());
		
		cvSP.selectDate();
		cvSP.findBtnCustom();
		cvSP.customSearchListTable();
		
		cvSP.loadMore();
		Thread.sleep(3000);
		
		//cvHP.selectMultipleDocuments(getCustomDocName1(), getCustomDocName2());
		//cvHP.selectMultipleDocuments(sheet.getRow(14).getCell(7).getStringCellValue(), sheet.getRow(14).getCell(9).getStringCellValue());
		
		Thread.sleep(2000);
		//Assert.assertEquals(cvHP.exportDocument(), true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
