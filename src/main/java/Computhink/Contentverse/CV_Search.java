package Computhink.Contentverse;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_Search extends Utility {
	
	WebDriver driver;
	Actions act;
	
	public CV_Search(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//WebElement Added in CV_Search_Page on 28/02/2024 - Suresh
	// Click on "Search"
	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	WebElement clickSearchMenu;

	// Click on "Select Document location
	@FindBy(xpath = "//input[@id='folderLocationForSearch']")
	WebElement txtFloderLocationpath;
	
	@FindBy(xpath = "//a[@id='culstomcolsearch']")
	WebElement customserch;
	
	@FindBy(xpath = "//button[@id='CustomListCancel']")
	WebElement btncancle;
	
	@FindBy(xpath = "//a[@id='documentTemplates']")
	WebElement subMenuDocs;
	
	@FindBy(xpath = "(//form[@id='search-form'])[2]")
	WebElement Clicklogo;
	

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	WebElement btnOkSearchLocation;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle1']")
	WebElement btnCancelSearchLocation;

	// Click on "Select search location X "
	@FindBy(xpath = "//span[@id='navigatorModelClose1']")
	WebElement btnCloseSearchLocation;

	// Click on "Refresh"--
	@FindBy(xpath = "//img[@id='searchfolderrefreshBtn']")
	WebElement imgRefreshSearchLocation;

	// Click on "labelSearchImage1"--
	@FindBy(xpath = "//input[@id='searchLocateNode']")
	WebElement imgSearchDocumentLocation;

	// Click on "All of the words"--
	@FindBy(xpath = "//li[@id='indexOptionMenu_0']")
	WebElement listIndexOption;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='indexOptionMenu_1']")
	WebElement list1IndexOption;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='indexOptionMenu_2']")
	WebElement list2IndexOption;

	// Click on Index Contain Text Area
	@FindBy(id = "indexPhrase1")
	WebElement txtIndexContain;

	// Click on "All of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_0']")
	WebElement listTextContain;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='textOptionMenu_1']")
	WebElement list1TextContain;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_2']")
	WebElement list2TextContain;

	// Click on "Any part of the value"
	@FindBy(xpath = "//li[@id='textOptionMenu_3']")
	WebElement list3TextContain;

	// Click on Text Contain Text Area
	@FindBy(id = "indexPhrase2")
	WebElement txtTextContain;

	// SelectDocumentType
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[1]")
	WebElement ddDocumentType;

	// Click on "Document types / indices"
	@FindBy(xpath = "//img[@id='addIndicesBtn']")
	WebElement imgIndices;

	// Click on "Reset"
	@FindBy(xpath = "//button[@id='navigatorTreeReset6']")
	WebElement btnResetIndices;

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk6']")
	WebElement btnOkIndices;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle6']")
	WebElement btnCancelIndices;

	// Click on "Document Type / Indices ×"
	@FindBy(xpath = "//span[@id='navigatorModelClose6']")
	WebElement btnCloseIndices;

	// Click on "Document Type Refresh"
	@FindBy(xpath = "//img[@id='refreshDocTypeBtn']")
	WebElement imgRefreshDocumentType;

	// SelectDocumentCreator
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[2]")
	WebElement ddDocumentCreator;

	// CreatorrefreshBtn
	@FindBy(xpath = "//img[@id='refreshCreatorBtn']")
	WebElement imgRefreshDocumentCreator;

	// SelectWorkFlow
	@FindBy(xpath = "(//span[@aria-label='dropdownlist'])[1]")
	WebElement ddWorkFlow;

	// CalenderCreatedFrom
	@FindBy(xpath = "//input[@id='createdDateFrom']")
	WebElement txtCreatedFrom;

	// CalenderCreatedTo
	@FindBy(xpath = "//input[@id='createdDateTo']")
	WebElement txtCreatedTo;

	// CalenderModifiedFrom
	@FindBy(xpath = "//input[@id='ModifiedDateFrom']")
	WebElement txtModifiesFrom;

	// CalenderModifiedTo
	@FindBy(xpath = "//input[@id='ModifiedDateTo']")
	WebElement txtModifiedTo;

	// Checkbox All Versions
	@FindBy(xpath = "//input[@id='allVersions']")
	WebElement chkAllVersions;

	// Checkbox Include Comment
	@FindBy(xpath = "//input[@id='includeComment']")
	WebElement chkIncludeComment;

	// Checkbox Append to hitlist
	@FindBy(xpath = "//input[@id='appendToHitList']")
	WebElement chkAppendToHitList;

	// Checkbox Find inhitlist
	@FindBy(xpath = "//input[@id='findInHitList']")
	WebElement chkFindInHitList;

	// Click on "Select saved search"
	@FindBy(xpath = "(//select[@id='savedSearchName']")
	WebElement ddSaveSearch;

	// Click on "Select saved search<New Search>
	@FindBy(xpath = "//select[@id='savedSearchName'])[1]")
	WebElement dd1NewSearch;

	// select "Select saved Button
	@FindBy(xpath = "//img[@id='saveBtnForSaveSearchName']")
	WebElement imgSaveSearchName;

	// select "Select Cancel Button
	@FindBy(xpath = "//img[@id='cancelBtnForSaveSearchName']")
	WebElement imgCancelSearchName;

	// select "Select Refresh Button
	@FindBy(xpath = "//img[@id='refreshBtnForSaveSearchName']")
	WebElement imgRefreshSearchName;

	// Select Find Button
	//@FindBy(xpath = "//button[@id='advFindBtnLabel']")
	//WebElement btnFind;

	// Select Clear Button
	@FindBy(xpath = "//button[@id='clearSearchBtnLabel']")
	WebElement btnClear;

	// SearchDropdown Menu
	@FindBy(xpath = "//ul[@id='customListdropdownmenu']")
	WebElement ddSearchMenu;

	// Select Custom Colmn
	@FindBy(xpath = "//a[@id='culstomcolsearch']")
	WebElement dd1CustomColumn;

	// Search Custom List
	@FindBy(xpath = "//input[@id='searchInput']")
	WebElement txtCustomList;

	// Select Default Btn
	@FindBy(xpath = "//button[@id='DefaultCustomList']")
	WebElement btnDefaultCustomList;

	// Select OK Btn
	@FindBy(xpath = "//button[@id='CustomListOK']")
	WebElement btnOkCustomList;

	// Select Cancel Btn
	@FindBy(xpath = "//button[@id='CustomListCancel']")
	WebElement btnCancelCustomList;

	// Select Close Btn
	@FindBy(xpath = "//span[@id='customListModelClose']")
	WebElement btnCloseCustomList;

	//
	@FindBy(xpath = "//button[@id='resetColumsOk']")
	WebElement dd2ResetColums;
	
	@FindBy(xpath = "//div[@class='e-content e-dropdownbase']/ul/li")
	List<WebElement> ddDocumentTypeOptions;

	@FindBy(xpath = "//ul[@id='docCreatorSpan_options']/li")
	List<WebElement> ddDocumentCreatorOptions;
	
	@FindBy(xpath = "//input[@id='createdDateFrom']")
	WebElement ddCreatedDateFrom;

	@FindBy(xpath = "//input[@id='createdDateTo']")
	WebElement ddCreatedDateTo;

	@FindBy(xpath = "//div[@id='mc-current--year']")
	WebElement currentYear;

	@FindBy(xpath = "//div[@class='mc-calendar mc-calendar--modal mc-calendar--opened']//div[5]")
	WebElement selectYearFrom;
	
	@FindBy(xpath = "//div[@class='mc-calendar mc-calendar--modal mc-calendar--opened']//div[5]")
	WebElement selectYearTo;

	@FindBy(xpath = "//div[@id='mc-current--month']")
	WebElement currentMonth;

	@FindBy(xpath = "//div[@aria-label='March']")
	WebElement selectMonthFrom;
	
	@FindBy(xpath = "//div[@aria-label='April']")
	WebElement selectMonthTo;

	@FindBy(xpath = "//td[@aria-label='Fri Mar 01 2024']")
	WebElement selectDateFrom;

	@FindBy(xpath = "//td[@aria-label='Tue Apr 30 2024']")
	WebElement selectDateTo;

	@FindBy(xpath = "//button[@id='mc-btn__ok']")
	WebElement btnOKCalender;

	@FindBy(xpath = "//button[@id='advFindBtnLabel']")
	WebElement btnFind;
	
	@FindBy(xpath = "//button[@class='cv-btn-loadmore']")
	WebElement btnLoadMore;
	
	@FindBy(xpath = "//table[@id='searchListTable']//tbody")
	WebElement searchListTable;
	
	@FindBy(xpath = "//div[@id='searchDocumentNavigator1']/ul/li")
	List<WebElement> listOfCabinates;

	@FindBy(xpath = "//div[@id='searchDocumentNavigator1']//ul//ul//li")
	List<WebElement> listOfDrawers;
	
	@FindBy(xpath = "//div[@id='searchDocumentNavigator1']//ul//ul//ul//li")
	List<WebElement> listOfFolders;

	@FindBy(xpath = "//div[@id='searchDocumentNavigator1']//ul//ul//ul//li//a")
	List<WebElement> selectFolder;
	
	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	WebElement btnOkBrowseForFolder;
	
	public void Search_CV()
	{
		clickSearchMenu.click();
		txtFloderLocationpath.click();
		btnOkSearchLocation.click();
		btnCancelSearchLocation.click();
		btnCloseSearchLocation.click();
		imgRefreshSearchLocation.click();
		imgSearchDocumentLocation.click();
		listIndexOption.click();	
	}
	
	public void advanceSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		clickSearchMenu.click();
	}
	
	public void selectDocumentType(String CustomDocumentType) throws InterruptedException 
	{	
		ddDocumentType.click();
		for (int i=0; i<ddDocumentTypeOptions.size(); i++) 
		{
			try {	
				if (ddDocumentTypeOptions.get(i).getText().trim().equalsIgnoreCase(CustomDocumentType)) 
					{
					ddDocumentTypeOptions.get(i).click();
					}
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		ddDocumentType.click();
	}
	
	public void selectDocumentCreator(String CustomDocumentCreator) throws InterruptedException 
	{	
		ddDocumentCreator.click();
		for (int i=0; i<ddDocumentCreatorOptions.size(); i++) 
		{
			try {	
				if (ddDocumentCreatorOptions.get(i).getText().trim().equalsIgnoreCase(CustomDocumentCreator)) 
					{
					ddDocumentCreatorOptions.get(i).click();
					}
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		ddDocumentCreator.click();
	}
	
	public void selectDate() throws InterruptedException 
	{
		ddCreatedDateFrom.click();
		currentYear.click();
		selectYearFrom.click();
		currentMonth.click();
		selectMonthFrom.click();
		selectDateFrom.click();
		btnOKCalender.click();
		Thread.sleep(1000);
		ddCreatedDateTo.click();
		currentYear.click();
		selectYearTo.click();
		currentMonth.click();
		selectMonthTo.click();
		selectDateTo.click();
		btnOKCalender.click();
	}

	public void findBtnCustom() 
	{
		btnFind.click();
	}
	
	public boolean customSearchListTable() throws InterruptedException {
		boolean customSearchListTable = false;
		Thread.sleep(3000);
			if (searchListTable.getText().trim().equalsIgnoreCase("No data available in table")) 
			{
				System.out.println(searchListTable.getText());
				Assert.assertEquals(customSearchListTable, true);
				
			} else 
			{
				Assert.assertEquals(customSearchListTable, false);
			}
			return customSearchListTable;
	}
	
	public void loadMore() 
	{
		if(btnLoadMore.isDisplayed())
		{
			btnLoadMore.click();
		}
		else
		{
			System.out.println("Load More button is not available");
		}
	}
	
	public void folderLocation()
	{
		customserch.click();
		try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		btncancle.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		//moveToElementAndClick(Clicklogo);
		if(isClicked(txtFloderLocationpath)==true) 
		{
		 System.out.println("Click ON element");	
		}
		else 
		{
			 System.out.println("Not Click on element");
		}
		//txtFloderLocationpath.click();
	}
	
	public void listOfCabinatesPresentInDataBase(String CabinateName) throws InterruptedException {
		Thread.sleep(5000);
		for (int i = 0; i < listOfCabinates.size(); i++) {
			if (listOfCabinates.get(i).getText().trim().equalsIgnoreCase(CabinateName)) {
				act = new Actions(driver);
				act.doubleClick(listOfCabinates.get(i)).build().perform();
				//moveToElementAndDoubleClick(listOfCabinates.get(i));
				Thread.sleep(5000);
			}
		}
	}

	public void selectDrawerPresentInCabinet(String DrawerName) throws InterruptedException {
		for (int j = 0; j < listOfDrawers.size(); j++) {
			if (listOfDrawers.get(j).getText().trim().equalsIgnoreCase(DrawerName)) {
				act = new Actions(driver);
				act.doubleClick(listOfDrawers.get(j)).build().perform();
			}
		}
	}

	public void selectFolderPresentInDrawer(String FolderName) throws InterruptedException {
		for (int k = 0; k < listOfFolders.size(); k++) {
			if (listOfFolders.get(k).getText().trim().equalsIgnoreCase(FolderName)) {
				Thread.sleep(3000);
				act = new Actions(driver);
				act.moveToElement(selectFolder.get(k)).click().build().perform();
			}
		}
	}
	
	public void clickOkButton()
	{
		btnOkBrowseForFolder.click();
	}

}