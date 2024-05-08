package Computhink.Contentverse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.SoftAssert;

import cv_resources.Utility;

public class CV_NewDocument extends Utility {
	// Web Elements added in CV_NewDocuments Amol - 04/03/2024
	String file_Name;
	// Clicked on Sundyne
	@CacheLookup
	// Cabinet
	@FindBy(xpath = "(//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	WebElement iconPlusCabinet; // New Cabinet
	// Drawer
	@FindBy(xpath = "(//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	WebElement iconPlusDrawer; // Amol
	// Folder
	@FindBy(xpath = "(//*[contains(text(), 'QA_Test')])[2]")
	WebElement iconFolder; // QA_Test
	// File opening loader after click on document
	@FindBy(xpath = "(//div[@id='progressMsg'][text()='Opening document...'])[2]")
	WebElement loaderFileOpening;
	// Document Checkbooks
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement chkDocument;
	// Add New Document
	// ----------------------------------------------------------------------------------
	// If Direct Click on New Document

	@FindBy(xpath = "//a[@id='createDocument']")
	WebElement menuNewDocument;
	// After click on New Document Menu - Destination Folder
	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	WebElement txtDestinationFolder;

	// Tab Browse For Folder
	@FindBy(xpath = "//div[@id='nevDiv']")
	WebElement tabBrowserForFolder;
	// Cabinet
	@FindBy(xpath = "//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement iconPlusSelectCabinet; // New Cabinet
	// Drawer
	@FindBy(xpath = "//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement iconPlusSelectDrawer; // Amol
	// Folder
	@FindBy(xpath = "//*[contains(text(), 'QA_Test')]")
	WebElement iconSelectFolder; // QA_Test

	// Search Icon
	@FindBy(xpath = "//input[@id='locateNode']//input[@id='createDocuemtnLocation']")
	WebElement btnSearchBrowseForFolder;

	// ok Button
	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	WebElement btnOkBrowseForFolder;
	// Cancle Button
	@FindBy(xpath = "//button[@id='navigatorTreeCancle']")
	WebElement btnCancleBrowseForFolder;

	// Document Type
	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement ddDoctype;
	// Authors List
	@FindBy(xpath = "//input[@id='indicesViewText_1']")
	WebElement txtAuthorsList;
	// Retain button
	@FindBy(xpath = "//input[@id='retainBtn']")
	WebElement chkbxRetain;
	// Folder Create Button
	@FindBy(id= "createDocumentSubmit")
	WebElement btnNewDocCreate;
	// Loader (Loading...)
	@FindBy(xpath = "(//div[@id='progressMsg'][text()='Loading...'])[2]")
	WebElement loaderNewDocCreate;
	// Folder Cancel Button
	@FindBy(xpath = "createDocumentClear")
	WebElement btnClear;
	// After click on Create Button - Label
	// ---------------------------------------------------------------
	@FindBy(xpath = "//span[@id='createDocumentMessage']")
	WebElement lblMessage;
	// Navigate button
	@FindBy(xpath = "//button[@id='modelHome'][text()='Navigate']")
	WebElement btnNavigate;
	// View Button
	@FindBy(xpath = "//button[@id='viewCreatedDocument'][text()='View ']")
	WebElement btnView;
	// New Button
	@FindBy(xpath = "//button[@id='modelNewDocument'][text()='New']")
	WebElement btnNew;
	// After clicking view button - Send to Workflow Button
	// -----------------------------------------------
	@FindBy(xpath = "//span[@id='viewSendToWrkflw'][text()='Send To Workflow...']")
	WebElement btnSendToWorkflow;
	// Document Type
	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement ddDocumentType;
	// Properties
	@FindBy(xpath = "//div[@class='elementHeader']/span[text()='Properties']")
	WebElement lblProperties;
	// Update Button
	@FindBy(xpath = "//a[@id='editproperties_983'][text()='Update']")
	WebElement btnUpdate;
	// After click on Update button - Save button
	@FindBy(xpath = "//a[@id='saveproperties_1016']")
	WebElement btnSave;
	// Cancel Button
	@FindBy(xpath = "//a[@id='cancelproperties_1016']")
	WebElement btnCancel;
	// Comments
	@FindBy(xpath = "//span[text()='Comments ']")
	WebElement lblComments;
	// After click on Comments - Search Box
	@FindBy(xpath = "//input[@id='commentsInput']")
	WebElement txtSearchBox;
	// Add Comment
	@FindBy(xpath = "//button[@id='addComment']")
	WebElement btnAddComment;
	// Close Button
	@FindBy(xpath = "//button[@id='cancelComments']")
	WebElement btnClose;
	// Close
	@FindBy(xpath = "//span[@id='commentsModalClose']")
	WebElement Close;
	// References
	@FindBy(xpath = "//span[@id='referenceView_1016']")
	WebElement lblReferences;
	// After click on References - Close
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default'][text()='Cancel']")
	WebElement btnReferencesCancel;
	// Versions
	@FindBy(xpath = "//span[text()='Versions']")
	WebElement lblVersions;
	// After click on Versions - Set Active Version
	@FindBy(xpath = "//a[@id='setVersions_1016']")
	WebElement btnSetActiveVersion;
	// Delete All Versions
	@FindBy(xpath = "//a[@id='delVersions_1016']")
	WebElement btnDeleteAllVersions;
	// Comments
	@FindBy(xpath = "//a[@id='CommentVersion_1016']")
	WebElement btnComments;
	// General
	@FindBy(xpath = "//span[text()='General']")
	WebElement lblGeneral;
	// After click on General - Full Text Search
	@FindBy(xpath = "//a[@id='fullTextSearch_1016']")
	WebElement btnFullTextSearch;
	// History
	@FindBy(xpath = "//span[text()='History']")
	WebElement lblHistory;
	// After Click on History - Excel Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='Excel Export']")
	WebElement btnExportExcel;
	// PDF Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='PDF Export']")
	WebElement btnPdfExport;
	// Search bar
	@FindBy(xpath = "//input[@id='historyConfirm_searchbar']")
	WebElement txtHistorySearchBar;
	// Print All
	@FindBy(xpath = "//button[@class='btn modalDialogButtons']")
	WebElement btnPrintAll;
	// Cancel
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default']")
	WebElement btnHistoryCancel;
	// After click on New button - Plus icon
	// ---------------------------------------------------------------
	@FindBy(xpath = "//div[@id='addPagesDropDown']")
	WebElement ddPlusIcon;
	// Browse
	@FindBy(xpath = "//input[@id='viewDocumentAddPages']") // (//div[@id='fileUpload'])[2]
	WebElement ddBrowseButton;
	// Camera
	@FindBy(xpath = "//div[@id='fileUploadComp']") // div[@id='fileUploadComp']
	WebElement ddCameraButton;
	// Scan
	@FindBy(xpath = "//div[@id='scan']") // div[@id='scan']
	WebElement ddScanButton;
	// New Word Document
	@FindBy(xpath = "//div[@id='addWordFile']") // addWordFile
	WebElement ddNewWordDocumentButton;
	
	@FindBy(xpath = "//div[@id='addExcelFile']") // addWordFile
	WebElement ddNewExcelDocumentButton;
	
	
	
	// Enter File Name
	@FindBy(xpath = "//input[@id='newTemplateFileName']")
	WebElement txtNewDocumentEnterFileName;
	// Ok Button
	@FindBy(xpath = "//button[@id='templateOK']")
	WebElement btnNewDocumentOk;
	// Cancel Button
	@FindBy(xpath = "//button[@id='templateCanel']")
	WebElement btnNewDocumentCancel;
	// Close Navigation
	@FindBy(xpath = "//span[@id='navigatorModelCloseTemplate9']")
	WebElement btnNewDocumentClose;
	// Container of New Word Document
	@FindBy(xpath = "//div[@id='djvuViewerDiv_editor_viewerContainer']")
	WebElement tabNewWordDocument;

	// Save Add Pages
	@FindBy(xpath = "//div[@id='saveAddedPages']")
	WebElement btnSaveNewWordDocument;

	// After Click on OK - Loader
	@FindBy(xpath = "(//div[text()='Adding page(s)...'][@id='progressMsg'])[2]")
	WebElement msgNewDocument;
	// New Excel Spreadsheet
	@FindBy(xpath = "//div[@id='addExcelFile']") // addExcelFile
	WebElement ddNewExcelSpreadsheetButton;
	// New PDF Document
	@FindBy(xpath = "//div[@id='addPdfFile']") // addPdfFile
	WebElement ddNewPdfDocumentButton;
	// Fab Menu Button
	// --------------------------------------------------------------------------------------
	@FindBy(xpath = "//i[@id='fabButton'][@class='fa fa-bars']")
	WebElement btnFabMenu;
	// Fab Save Button
	@FindBy(xpath = "//i[@id='saveFabButton']")
	WebElement btnFabSaveDocument;
	// Fab Delete Button
	@FindBy(xpath = "//i[@id='deleteFabButton']")
	WebElement btnFabDeleteDocument;
	// Fab Upload Button
	@FindBy(xpath = "//i[@id='uploadFabButton']")
	WebElement btnFabploadDocument;
	// Fab Full Screen View
	@FindBy(xpath = "//i[@id='fullScreenFabButton']")
	WebElement btnFabFullScreenView;	
	
	@FindBy(id="indices_11")
	WebElement mandatoryPropertiesEmpName;
	
	@FindBy(id="indices_5")
	WebElement mandatoryProperties_CVReportEmpName;
	
	//input[@id='indices_5']
	
	@FindBy(id="newdocModelCloseTemplate")
	WebElement btnCloseMessageBox;
	
	@FindBy(id="commentModel")
	WebElement permissionDenidedMessageBox;
	
	@FindBy(xpath = "//span[@id='pdfViewerDiv_annotationIcon']")
	WebElement ToolAddannotation;
	
	@FindBy(xpath = "//div[@ondragover='event.preventDefault()']")
	WebElement NameOfPDF;
	
	@FindBy(xpath = "//span[@id='pdfViewerDiv_annotation_freeTextEditIcon']")
	WebElement ToolAddannotationAddText;
	
	@FindBy(xpath = "//div[@id='pdfViewerDiv0_diagramAdornerLayer']")
	WebElement txtarea;

	WebDriver driver;

	public CV_NewDocument(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);

	}
	
	// Following method is added by Ajay Sharma
	public void selectTypeToCreateNewDocument(String documentType) throws InterruptedException 
	{
		SoftAssert sf = new SoftAssert();
		Thread.sleep(2000);
		menuNewDocument.click();				
		if(isDisaplyedW(permissionDenidedMessageBox, 5))
		{
			System.out.println("Permission denied");
			return;
		}
		
		isDisaplyedW(ddNewWordDocumentButton, 10);
		
		//Added For Word
		if(documentType.equalsIgnoreCase("Word"))
		{		
			moveToElementAndClick(ddNewWordDocumentButton);
		}
		
		//Added For Excel
		else if(documentType.equalsIgnoreCase("Excel"))
		{
			moveToElementAndClick(ddNewExcelDocumentButton);
		}
		
		//Added For PDF
		else if(documentType.equalsIgnoreCase("Pdf"))
		{
			moveToElementAndClick(ddNewPdfDocumentButton);
		}
		Thread.sleep(2000);
		
		String file_Name="CV_"+currentTime();
		txtNewDocumentEnterFileName.sendKeys(file_Name);
		btnNewDocumentOk.click();
		
		Thread.sleep(5000);
		if(documentType.equalsIgnoreCase("Word"))
		{		
			keypress("Statement type by Selenium Automation script");
			Thread.sleep(2000);
		}
		else if(documentType.equalsIgnoreCase("Excel"))
		{
			doubleClick();
			keypress("Statement type by Selenium Automation script");
			Thread.sleep(2000);
		}
		
		else if(documentType.equalsIgnoreCase("Pdf"))
		{
			
			//Actions ac=new Actions(driver);
			System.out.println("");
			
			String name=NameOfPDF.getAttribute("title");
			if(name.equals((file_Name)+".pdf"))
			{
				System.out.println("pdf Document created Sucessfully");
			}
			/*
			ToolAddannotation.click();
			ToolAddannotationAddText.click();
			txtarea.click();
			ac.moveByOffset(0, 100).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.click();
			keypress("Pdf_Edited");
			//ActionChains(driver).send_keys(Keys.ARROW_DOWN).perform();
			
			doubleClick();
			keypress("Statement type by Selenium Automation script");
			Thread.sleep(2000);
			*/
		}

		try 
		{
			mandatoryProperties_CVReportEmpName.sendKeys("Document_"+currentTime());
		}
		catch (Exception e) 
		{
			mandatoryPropertiesEmpName.sendKeys("Document_"+currentTime());
		}
		

		btnNewDocCreate.click();
		Thread.sleep(5000);
		sf.assertEquals(lblMessage.getText(), "Document created successfully");
		btnCloseMessageBox.click();
		sf.assertAll();
		
		}

	public void NewDocument() {
		Actions actions = new Actions(driver);

		menuNewDocument.click();
		isVisible(txtDestinationFolder, 10);
		actions.moveToElement(txtDestinationFolder).build().perform();
		txtDestinationFolder.click();
		if (isVisible(tabBrowserForFolder, 10) == true)
			;
		{
			iconPlusSelectCabinet.click();
			iconPlusSelectDrawer.click();
			iconSelectFolder.click();
			btnOkBrowseForFolder.click();
		}
		// actions.moveToElement(ddDocumentType).build().perform();
		Dropdownbytxt(ddDocumentType, "WordDocs");
		txtAuthorsList.sendKeys("TestDoc");
		chkbxRetain.click();
		btnNewDocCreate.click();
		isInvisible(loaderNewDocCreate, 10);
		String msg = lblMessage.getText();
		if (msg.contains("Document created successfully")) {
			System.out.println("Document created successfully");
			btnView.click();
		} else {
			System.out.println("Document Not Createed");
		}
	}

	public void Browse() {
		Actions actions = new Actions(driver);
		actions.moveToElement(ddPlusIcon).build().perform();
		String filePath = "D:\\ContentVerse\\Dummy_Data.xlsx";
		ddBrowseButton.sendKeys(filePath);
	}

	public void NewWordDocument() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(ddPlusIcon).build().perform();
		ddNewWordDocumentButton.click();
		txtNewDocumentEnterFileName.sendKeys("TestDocFile");
		btnNewDocumentOk.click();
		tabNewWordDocument.sendKeys("Test Word Document");
		btnSaveNewWordDocument.click();
		System.out.println("Pass123");		
	}


}
