package Computhink.Contentverse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CV_CreateCabinateDrawerTest extends Base 
{
	//WebDriver driver;

	CV_LoginPage cvLP;
	CV_HomePage cvHP;
		
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
	}
	
	@Test
	public void createCabinate() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(7).getStringCellValue(),
				sheet.getRow(5).getCell(9).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		Thread.sleep(3000);
		Assert.assertEquals(cvHP.cv_CabinateCreation(), true);
	
	}
	
	@Test
	public void createDrawer() throws Exception
	{
		createCabinate();
		cvHP.cvCreateDrawer();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
