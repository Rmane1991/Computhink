package Computhink.Contentverse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_SendToWorkflowPage extends Utility {

	public WebDriver driver;
	Actions ac;

	public CV_SendToWorkflowPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		ac = new Actions(driver);
	}

	@FindBy(xpath = "//div[@id='addPagesDropDown']")
	WebElement SubMenuNwdocument;

	@FindBy(xpath = "//input[@id='viewDocumentAddPages']")
	WebElement UploadNewFile;

	@FindBy(xpath = "//div[@id='saveAddedPages']")
	WebElement btnSaveDocument;

	@FindBy(xpath = "//span[@id='messageContent42']")
	WebElement lblSaveDocument;

	@FindBy(xpath = "//button[@id='messageButtonOK42']")
	WebElement btnokSaveDocument;

	@FindBy(xpath = "//div[@id='cvDocumentClose']")
	WebElement btnCloseDocument;

	@FindBy(xpath = "(//div[@id='progressMsg'])[2]")
	WebElement DocumentUploadProgressBar;

	@FindBy(xpath = "(//*[contains(text(), 'SCL')]/ancestor::li/ins[@class='jstree-icon'])[1]")
	WebElement IconPlusCabinet;

	@FindBy(xpath = "(//*[contains(text(), 'SCL')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	WebElement IconPlusDrawer;

	@FindBy(linkText = "SCLUpload")
	WebElement FolderNameWord;

	@FindBy(linkText = "SalesReportPDF_26_03") // SalesReportPDF
	WebElement FolderNamePDF;

	@FindBy(xpath = "//input[@id='tableFilter']")
	WebElement searchbarPdfDocument;

	@FindBy(xpath = "//td[@class=' customDocName']")
	WebElement clickDocument;

	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement ddDocumenttype;

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	WebElement btnCreateDocument;

	@FindBy(xpath = "//input[@id='retainBtn']")
	WebElement chkRetain;

	@FindBy(xpath = "//input[@id='indices_5']")
	WebElement txtReportName;

	@FindBy(xpath = "(//div[@class='spinner-border spinner-border-lg'])[2]")
	WebElement DocumentUploadloader;

	@FindBy(xpath = "//button[@id='modelNewDocument']")
	WebElement btnNewDocument;

	@FindBy(xpath = "//span[@id='createDocumentMessage']")
	WebElement FileUploadlblMessage;

	@FindBy(xpath = "//a[@id='createDocument']")
	WebElement SubMenuCreateNewDocument;

	@FindBy(xpath = "//input[@id='indices_46']")
	WebElement txtCompanyName;

	@FindBy(xpath = "//div[@class='e-toast-message']")
	WebElement errorwindow;

	@FindBy(xpath = "//button[@class='e-small e-lib e-btn e-control e-primary e-toast-danger']")
	WebElement btnCloseError;

	@FindBy(xpath = "//button[@id='viewCreatedDocument']")
	WebElement btnviewDocument;

	@FindBy(xpath = "//span[@id='viewSendToWrkflw']")
	WebElement BtnsendDocumentWorkflow;

	@FindBy(xpath = "//div[@id='sidbisendworkflow']")
	WebElement windowavailableworkflow;

	@FindBy(xpath = "//button[@id='sidbisendworkflowOk']")
	WebElement btnapplyworkflow;

	@FindBy(xpath = "(//td[@class='e-rowcell'])[3]")
	WebElement historymsg;

	// For To do list

	// First visit on ToDoList.
	@FindBy(xpath = "//a[@id='myTaskMenu']")
	WebElement MenuToDoList;

	// new items.
	@FindBy(xpath = "//a[@id='newItems']")
	WebElement SubMenuNewItems;

	// search
	@FindBy(xpath = "//input[@id='searchTree']")
	WebElement txtserachtodolist;

	// Pending items
	@FindBy(xpath = "//a[@id='todoPending']")
	WebElement SubMenupendingItems;

	// Reviewed items
	@FindBy(xpath = "//a[@id='todoReviewed']")
	WebElement SubMenuReviewedItems;

	// All items
	@FindBy(xpath = "//a[@id='todoAll']")
	WebElement SubMenuAllItems;

	// Sent items
	@FindBy(xpath = "//a[@id='todoSentItems']")
	WebElement SubMenusentitem;

	// Custom columns
	@FindBy(xpath = "//a[@id='todoCustomColumns']")
	WebElement SubMenucustomColumns;

	// Reset columns
	@FindBy(xpath = "//a[@id='todoResetColumns']")
	WebElement SubMenuRecetColumns;

	// search box
	@FindBy(xpath = "//input[@class='custom-input']")
	WebElement Clicksearch;

	// ok button
	@FindBy(xpath = "//button[@id='CustomListTodoOK']")
	WebElement btncustomsave;

	// Cancel button
	@FindBy(xpath = "//button[@id='CustomListTodoCancel']")
	WebElement btncustomcancel;

	// Document (After selecting Document)

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	WebElement clickDocument1;

	@FindBy(xpath = "//a[@id='multipleViewer']")
	WebElement ClickView;

	@FindBy(xpath = "//a[@id='cutid']")
	WebElement clickCutDocument;

	@FindBy(xpath = "//a[@id='copyId']")
	WebElement clickCopyDocument;

	@FindBy(xpath = "//a[@id='pasteid']")
	WebElement clickpasteDocument;

	@FindBy(xpath = "//a[@id='docReferencePaste']")
	WebElement clickpasteasrefr;

	@FindBy(xpath = "//a[@id='referenceBtn']")
	WebElement ClickReferences;

	@FindBy(xpath = "//a[@id='delDocument']")
	WebElement ClickDelete;

	@FindBy(xpath = "//a[@id='documentcreatefav']")
	WebElement ClickCrFavorites;

	@FindBy(xpath = "//a[@id='documentSendTo']")
	WebElement Clicksendto;

	@FindBy(xpath = "(//td)[108]")
	WebElement downarrowfordocument;

	@FindBy(xpath = "//*[@id='documentListTable']/tbody/tr[1]/td[3]")
	WebElement clickOnDocument;

	// click on send to mail --> SubMenu--> mail

	@FindBy(xpath = "//a[@id='sendToMail']")
	WebElement ClickonMail;

	// click on send to mail --> SubMenu--> mail-->print

	@FindBy(xpath = "//a[@id='sendToPrint']")
	WebElement Clickprint;

	// click on send to mail --> SubMenu--> mail-->Export
	@FindBy(xpath = "//a[@id='sendToExport']")
	WebElement ClickDExport;

	//// click on send to mail --> SubMenu--> mail-->SecureLink
	@FindBy(xpath = "//a[text()='Secure Link...'][1]")
	WebElement ClickSecureLink;

	// click on send to mail --> SubMenu--> mail-->Generate Document Link
	@FindBy(xpath = "//a[@id='generateDocumentLink']")
	WebElement ClickGenerateDocLink;

	public WebElement findDocumentElement(String linkText) {
		return driver.findElement(By.xpath("//td[normalize-space()='" + linkText + "']"));
	}

	public WebElement findDocumentElementtxt(String linkText) {
		return driver.findElement(By.xpath("//*[contains(text(), '" + linkText + "')]"));
	}

	@FindBy(xpath = "//div[@id='workflowModel']")
	WebElement WindowWorkFLowModel;

	@FindBy(xpath = "//button[@id='wfactionOk']")
	WebElement btnokworkflowaccept;

	@FindBy(xpath = "//textarea[@id='wfcomments']")
	WebElement txtAreaComment;

	@FindBy(xpath = "//a[@id='reject']")
	WebElement btnrejectWorkflow;

	@FindBy(xpath = "//a[@id='endwf']")
	WebElement btnEndWorkflow;

	@FindBy(xpath = "//a[@id='accept']")
	WebElement btnacceptworkFlow;

	@FindBy(xpath = "//div[@id='ownershipMessageModel']")
	WebElement WinDocumentInWF;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	WebElement btnOkDocumentInWF;

	@FindBy(xpath = "(//td[@class=' customDocName'])[1]")
	WebElement clickondocument;

	@FindBy(xpath = "//span[normalize-space()='History']")
	WebElement tabhistory;

	public WebElement findDocumentElementPlusIcon(String linkText) {
		return driver.findElement(
				By.xpath("//*[contains(text(), '" + linkText + "')]/preceding-sibling::ins[@class='jstree-icon']"));
	}

	public void openDocs(String CabinetName, String DrawerName, String FolderName) throws InterruptedException {
		Thread.sleep(2000);
		// Click On Cabinet
		findDocumentElementPlusIcon(CabinetName).click();
		Thread.sleep(500);
		// Click On Drawer
		findDocumentElementPlusIcon(DrawerName).click();
		Thread.sleep(500);
		// Click On Folder
		findDocumentElementtxt(FolderName).click();
		Thread.sleep(2000);
	}

	public void Worflow(String DocumentName, String UserName, String WFName, String CabinetName, String DrawerName,
			String FolderName) throws InterruptedException

	{
		openDocs(CabinetName, DrawerName, FolderName);
		SubMenuCreateNewDocument.click();
		Thread.sleep(3000);
		Dropdownbytxt(ddDocumenttype, "CVReports");
		isVisible(txtReportName, 15);
		txtReportName.sendKeys(DocumentName);
		isDisaplyedW(SubMenuNwdocument, 10);
		ac.moveToElement(SubMenuNwdocument).perform();
		UploadNewFile.sendKeys((System.getProperty("user.dir") + "\\downloadFiles\\SmokeTestCase.xlsx"));
		Thread.sleep(4000);

		if (isAlertPresent(driver) == true) {
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
		}

		isDisaplyedW(btnCreateDocument, 10);
		btnCreateDocument.click();
		Thread.sleep(3000);

		String Createmsg = FileUploadlblMessage.getText();
		if (Createmsg.contains("Document created successfully")) {
			System.out.println("Document created successfully");
			btnviewDocument.click();
			BtnsendDocumentWorkflow.click();
			isVisible(windowavailableworkflow, 10);

			findDocumentElement(WFName).click();
			Thread.sleep(3000);
			btnapplyworkflow.click();
			Thread.sleep(3000);
			tabhistory.click();
			Thread.sleep(3000);
			String verifymsghistory = historymsg.getText();
			if (verifymsghistory.equals("Workflow Initiated by " + UserName)) {
				System.out.println(verifymsghistory);
			} else {
				Assert.fail("Document Not send to Workflow! Actual text: " + verifymsghistory);
			}
		} else {
			System.out.println("Document Not uploaded");
		}
		System.out.println("Set Sucescss To :- " + WFName);
	}

	public void WorflowVerify(String Status, String DocumentName, String UserName, String CabinetName,
			String DrawerName, String FolderName) throws InterruptedException {
		CV_SendToWorkflowPage STF = new CV_SendToWorkflowPage(driver);
		WebElement verifyDOcument = null;
		moveToElement(MenuToDoList);
		SubMenuNewItems.click();

		try {
			verifyDOcument = STF.findDocumentElement(DocumentName);
			verifyDOcument.click();
		} catch (Exception e)

		{
			ac.moveToElement(MenuToDoList).perform();
			SubMenupendingItems.click();
			verifyDOcument = STF.findDocumentElement(DocumentName);
			verifyDOcument.click();
		}

		isDisaplyedW(btnacceptworkFlow, 10);

		if (Status.contains("Accept")) {
			btnacceptworkFlow.click();
			isDisaplyedW(WindowWorkFLowModel, 10);
			txtAreaComment.sendKeys("This Done by Automation");
			btnokworkflowaccept.click();
			Thread.sleep(3000);
			openDocs(CabinetName, DrawerName, FolderName);

			Thread.sleep(2000);
			clickOnDocument.click();
			Thread.sleep(2000);

			if (WinDocumentInWF.isDisplayed() == true) {
				btnOkDocumentInWF.click();
			}
			Thread.sleep(3000);
			tabhistory.click();
			Thread.sleep(3000);
			String verifymsghistory = historymsg.getText();
			if (verifymsghistory.equals("Document has been Approved by " + UserName)) {
				System.out.println(verifymsghistory);
			} else {
				Assert.fail("Document Not approved by First User! Actual text: " + verifymsghistory);
			}

		}
		if (Status.contains("reject")) {
			Thread.sleep(3000);
			btnrejectWorkflow.click();
			Thread.sleep(4000);
			txtAreaComment.sendKeys("This Document rejected by User :- " + UserName);
			btnokworkflowaccept.click();
			Thread.sleep(3000);

		}

		if (Status.contains("End Workflow")) {
			btnrejectWorkflow.click();
			txtAreaComment.sendKeys("This Document rejected by Automation");
			btnokworkflowaccept.click();
			if (verifyDOcument.isDisplayed() == false) {
				System.out.println("Document Rejected By first USer");
			}

		}

	}

	public void Verify_Reject_Workflow(String DocumentName) throws InterruptedException {
		ac.moveToElement(MenuToDoList).perform();
		SubMenuReviewedItems.click();
		Thread.sleep(2000);
		WebElement tobeverify = findDocumentElementtxt(DocumentName);
		Thread.sleep(2000);
		if (tobeverify.isDisplayed() == true) {
			System.out.println("Document Reject Testcase Passed and File present into reviewed Items");
		}

	}

}
