package Computhink.Contentverse;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CV_CreateDocumentTest extends Base
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
	public void createWordDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(5).getCell(3).getStringCellValue());
		cvHP.selectDrawerPresentInCabinet(sheet.getRow(5).getCell(5).getStringCellValue());
		cvHP.selectFolderPresentInDrawer(sheet.getRow(5).getCell(7).getStringCellValue());
		int beforeCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		cvND.selectTypeToCreateNewDocument("Word");
		int afterCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		Assert.assertTrue(beforeCreatingfileTotalFiles<afterCreatingfileTotalFiles);
	}
	
	@Test
	public void creatExcelDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(5).getCell(3).getStringCellValue());
		cvHP.selectDrawerPresentInCabinet(sheet.getRow(5).getCell(5).getStringCellValue());
		cvHP.selectFolderPresentInDrawer(sheet.getRow(5).getCell(7).getStringCellValue());
		int beforeCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		cvND.selectTypeToCreateNewDocument("Excel");
		int afterCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		Assert.assertTrue(beforeCreatingfileTotalFiles<afterCreatingfileTotalFiles);
	}
	
	@Test
	public void creatPdfDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(5).getCell(3).getStringCellValue());
		cvHP.selectDrawerPresentInCabinet(sheet.getRow(5).getCell(5).getStringCellValue());
		cvHP.selectFolderPresentInDrawer(sheet.getRow(5).getCell(7).getStringCellValue());
		int beforeCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		cvND.selectTypeToCreateNewDocument("Pdf");
		int afterCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		Assert.assertTrue(beforeCreatingfileTotalFiles<afterCreatingfileTotalFiles);
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
