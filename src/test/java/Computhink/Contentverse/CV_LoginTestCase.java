package Computhink.Contentverse;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CV_LoginTestCase extends Base {

	CV_LoginPage login_page;
	WebDriver driver;

	@BeforeMethod
	public void initalization() throws Exception 
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	// @AfterSuite
	public void SendMail() {
		sendEmailWithReport();
	}

	@Test(priority = 1)
	public void check_InValid_UserName()

	{
		login_page.Invalid_Username(sheet.getRow(5).getCell(7).getStringCellValue(),sheet.getRow(5).getCell(9).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
	}

	@Test(priority = 2) // , groups = "smoke"
	public void check_InValid_Password()

	{
		login_page.Invalid_Password(sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(5).getCell(7).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
	}

	@Test(priority = 3)
	public void check_Blank_Username()

	{
		login_page.Blank_Username(sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(1).getCell(7).getStringCellValue()); // getValidUsername()
	}

	@Test(priority = 4)
	public void check_Blank_Password()

	{
		login_page.Blank_Password(sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(1).getCell(7).getStringCellValue());// , getInvalidPassword()
	}

	@Test(priority = 5)
	public void check_Select_Room()

	{
		login_page.Select_Room(sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(5).getCell(5).getStringCellValue());
	}

	@Test(priority = 6) // ,groups = "smoke"
	public void Check_Valid_Credentials()

	{
		login_page.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
	}

}
