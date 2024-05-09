package Computhink.Contentverse;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CV_SendToWorkflowTestcase extends Base {
	CV_LoginPage login_page;
	WebDriver driver;
	CV_SendToWorkflowPage sendWF;
	

	@BeforeMethod
	public void initalization() throws Exception {
		// Initalization driver and Delcare Object for respective page
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		sendWF = new CV_SendToWorkflowPage(driver);
		
	}

	@AfterMethod
	public void tearDown() {
		// Webdriver End
		driver.quit();
	}

	@Test(priority = 1)
	public void SendToWorkFlow() throws InterruptedException

	{
		// Send Document To workflow from Originator
		login_page.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),
										   sheet.getRow(3).getCell(5).getStringCellValue(), 
										   sheet.getRow(1).getCell(7).getStringCellValue());

		System.out.println("Document Upload and send to workflow Started From Originator Of User :-"+ 
										  sheet.getRow(3).getCell(3).getStringCellValue());
		sendWF.Worflow(sheet.getRow(7).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(3).getStringCellValue(), 
				sheet.getRow(7).getCell(5).getStringCellValue(),
				sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(5).getCell(5).getStringCellValue(),
				sheet.getRow(5).getCell(7).getStringCellValue());
		System.out.println("Document Upload and send to workflow Started From Originator Done");
		System.out.println(">>---------------------------------------------------------------->>");
	}

	@Test(priority = 2)
	public void WorflowVerify_By_First_User() throws InterruptedException

	{
		// Document verification from first User

		login_page.Check_Valid_Credentials(sheet.getRow(9).getCell(3).getStringCellValue(),
										   sheet.getRow(9).getCell(5).getStringCellValue(), 
										   sheet.getRow(1).getCell(7).getStringCellValue());
		System.out.println("Workflow Verify By First User Started UserName:-" + 
					                       sheet.getRow(9).getCell(3).getStringCellValue());
		sendWF.WorflowVerify(sheet.getRow(9).getCell(7).getStringCellValue(),
										   sheet.getRow(7).getCell(3).getStringCellValue(), 
										   sheet.getRow(9).getCell(3).getStringCellValue(),
										   sheet.getRow(5).getCell(3).getStringCellValue(),
										   sheet.getRow(5).getCell(5).getStringCellValue(),
										   sheet.getRow(5).getCell(7).getStringCellValue());
		System.out.println("Workflow Verify By First User Done");
		System.out.println(">>--------------------------------->>");
	}

	@Test(priority = 3)
	public void WorflowVerify_By_Second_User() throws InterruptedException

	{
		// Document verification from Second User

		if (sheet.getRow(9).getCell(7).getStringCellValue().contains("Accept")) {
			login_page.Check_Valid_Credentials(sheet.getRow(9).getCell(9).getStringCellValue(),
					sheet.getRow(9).getCell(11).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
			System.out.println("Workflow Verify By Second User Started of UserName:-"+ sheet.getRow(9).getCell(9).getStringCellValue());
			sendWF.WorflowVerify(sheet.getRow(9).getCell(13).getStringCellValue(),
								                sheet.getRow(7).getCell(3).getStringCellValue(),
								                sheet.getRow(9).getCell(9).getStringCellValue(),
												sheet.getRow(5).getCell(3).getStringCellValue(),
												sheet.getRow(5).getCell(5).getStringCellValue(),
												sheet.getRow(5).getCell(7).getStringCellValue());
			System.out.println("Workflow Verify By Second User Done");
			System.out.println(">>--------------------------------->>");
		} else 
		{
			System.out.println("This Document all rejected By previous User of name "
					+ sheet.getRow(9).getCell(3).getStringCellValue());
		}
	}

	@Test(priority = 4)
	public void WorflowVerify_Reject() throws InterruptedException

	{
		// Reject Case :- If any user reject Document then for verification Purpose

		if ((sheet.getRow(9).getCell(7).getStringCellValue().contains("reject"))|| (sheet.getRow(9).getCell(13).getStringCellValue().contains("reject"))) 
		{
			login_page.Check_Valid_Credentials(sheet.getRow(3).getCell(3).getStringCellValue(),sheet.getRow(3).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
			
			System.out.println("Workflow Rejected case Verified");
			
			sendWF.Verify_Reject_Workflow(sheet.getRow(7).getCell(3).getStringCellValue());
			
			if (sheet.getRow(9).getCell(7).getStringCellValue().contains("reject")) {
				System.out.println("Workflow rejected by first User of name :- "
						+ sheet.getRow(3).getCell(3).getStringCellValue());
			} else if (sheet.getRow(9).getCell(13).getStringCellValue().contains("reject")) {
				System.out.println("Workflow rejected by Second User of name :- "
						+ sheet.getRow(9).getCell(9).getStringCellValue());
			}
			System.out.println(">>--------------------------------->>");
		} else {
			System.out.println("Work In accept flow");
		}

	}

}
