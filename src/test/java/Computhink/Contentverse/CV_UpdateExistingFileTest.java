package Computhink.Contentverse;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CV_UpdateExistingFileTest extends Base
{

	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	CV_NewDocument cvND;
	
		
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
		 cvND = new CV_NewDocument(driver);
	}
	
	@Test
	public void updateExistingDoc() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(5).getCell(3).getStringCellValue());
		cvHP.selectDrawerPresentInCabinet(sheet.getRow(5).getCell(5).getStringCellValue());
		cvHP.selectFolderPresentInDrawer(sheet.getRow(5).getCell(7).getStringCellValue());
		Thread.sleep(3000);
		cvHP.editDocument(sheet.getRow(7).getCell(3).getStringCellValue());		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
