package Computhink.Contentverse;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import cv_resources.Utility;

public class CV_LoginPage extends Utility {

	WebDriver driver;

	@CacheLookup
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLogo;

	@CacheLookup
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLog01;

	@CacheLookup
	@FindBy(xpath = "//input[@id='userName']")
	WebElement txtUsername;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='loginPassword']")
	WebElement txtPassword;


	@FindBy(xpath = "//button[@id='submitid']")
	WebElement btnSubmit;

	@FindBy(xpath = "//span[@id='logedinusername']")
	WebElement imgLoggedInUsername;

	@FindBy(xpath = "//label[@for='check1']")
	WebElement chkRemeberme;

	@FindBy(xpath = "//button[@id='forgotPassword']")
	WebElement btnForgotPassword;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogout;

	// Forgot password pop form
	@FindBy(xpath = "//input[@id='userNameforgotpassword']")
	WebElement txtUserNameForgotPwd;

	@FindBy(xpath = "//select[@id='availableRoomsforgotpassword']")
	WebElement ddlForgotPwdRooms;

	@FindBy(xpath = "//button[@id='forgotPasswordsendOTP']")
	WebElement btnForgotPasswordsendOTP;

	@FindBy(xpath = "//span[@id='messageContentForgetPassword']")
	WebElement msgSendOtpMessge;

	@FindBy(xpath = "//button[@id='messageButtonOKForgetPassword']")
	WebElement btnMsgOKForgotPassword;

	@FindBy(xpath = "//span[@id='forgetPasswordMessagequit']")
	WebElement btnMsgWindowquit;

	@FindBy(xpath = "//button[@id='forgotpasswordVerifyOtp']")
	WebElement btnForgotPasswordVerifyOtp;

	@FindBy(xpath = "//input[@id='verifyOTPforgotpassword']")
	WebElement txtVerifyOTPforgotpassword;

	@FindBy(xpath = "//button[@id='cvModelLoginValidationOk']")
	WebElement WindowSesionMgr;

	@FindBy(xpath = "//div[@id='header-main']")
	WebElement HeaderMenu;

	@FindBy(xpath = "//span[@id='loginError']")
	WebElement lbllogin;
	
	@FindBy(id="rooms")
	WebElement listOfRooms;

	@FindBy(xpath = "//div[@class='nameValidation']")
	WebElement lblnamevalidation;

	@FindBy(xpath = "//div[@class='passwordValidation']")
	WebElement lblpasswordvalidation;

	public CV_LoginPage(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void Check_Valid_Credentials(String uid, String pass, String room) 
	{

		System.out.println("6.Check_Valid_Credentials");
		isVisible(txtUsername, 5);
		txtUsername.clear();
		
		txtUsername.sendKeys(uid);
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		Dropdownbytxt(listOfRooms,room);
		btnSubmit.click();
		

		if (isDisaplyedW(WindowSesionMgr, 1)) {
			WindowSesionMgr.click();
			//System.out.println("Another Session Ended");
		}



		String LoggedInUsername=imgLoggedInUsername.getText();
		
		if (LoggedInUsername.equals(uid)) 
		{
			System.out.println(imgLoggedInUsername.getText().toUpperCase() + " :- Logged in succeesfully.");
		}

		else {
			String Msg = lbllogin.getText();
			System.out.println("Login failed with reason:- " + Msg);
		}
	}
	

	public void Invalid_Username(String uid, String pass,String room) {
		System.out.println("1.Login With Invalid Username");
		txtUsername.clear();
		txtUsername.sendKeys(uid);
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		Dropdownbytxt(listOfRooms,room);
		btnSubmit.click();

		String lblInvalidateUser = lbllogin.getText();
		
		if (lblInvalidateUser.equals("User does not exist")) 
		{
            System.out.println("Invalid user Name test Case : Passed");
            System.out.println(">>-------------------------------------------->>");
        } else 
        {
            Assert.fail("Invalid user Name test Case failed! Actual text: " + lblInvalidateUser);//", Expected text: " + expectedText);
        }
	}

	public void Invalid_Password(String uid, String pass,String room) {
		System.out.println("2.Login With Invalid Password");
		txtUsername.sendKeys(uid);
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		Dropdownbytxt(listOfRooms,room);
		btnSubmit.click();

		if (isDisaplyedW(WindowSesionMgr, 1)) 
		{
			WindowSesionMgr.click();
		}
		
		String lblInvalidateUser = lbllogin.getText();
		
		if (lblInvalidateUser.equals("Failed to authenticate user")) 
		{
            System.out.println("Invalid Password test Case : Passed");
            System.out.println(">>-------------------------------------------->>");
        } else 
        {
            Assert.fail("Invalid Password test Case failed! Actual text: " + lblInvalidateUser);//", Expected text: " + expectedText);
        }
		
	}

	public void Blank_Username(String pass,String room) //String uid, 
	{
		System.out.println("3.Blank Username");
		txtUsername.clear();
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		Dropdownbytxt(listOfRooms,room);
		btnSubmit.click();

		String lblusernamevalidation = lblnamevalidation.getText();
		
		if (lblusernamevalidation.equals("Please enter username")) 
		{
            System.out.println("Blank Username : Passed");
            System.out.println(">>-------------------------------------------->>");
        } else 
        {
            Assert.fail("Blank Username failed! Actual text: " + lblusernamevalidation);//", Expected text: " + expectedText);
        }
	}	
	public void Blank_Password(String uid,String room) //, String pass
	{
		System.out.println("4.Blank Password");
		txtUsername.clear();
		txtUsername.sendKeys(uid);
		txtPassword.clear();
		Dropdownbytxt(listOfRooms,room);
		btnSubmit.click();

		String lblpwdvalidation = lblpasswordvalidation.getText();
		
		if (lblpwdvalidation.equals("Please enter password")) 
		{
            System.out.println("Blank Password : Passed");
            System.out.println(">>-------------------------------------------->>");
        } else 
        {
            Assert.fail("Blank Password failed! Actual text: " + lblpwdvalidation);//", Expected text: " + expectedText);
        }
	}

	public void Select_Room(String uid, String pass) {
		System.out.println("5.Select_Room");
		isVisible(txtUsername, 10);
		txtUsername.clear();
		txtUsername.sendKeys(uid);
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		// ddRooms.click();
		btnSubmit.click();

		String roomselection = lbllogin.getText();
		
		if (roomselection.equals("Select a room")) 
		{
            System.out.println("Select a room : Passed");
            System.out.println(">>-------------------------------------------->>");
        } else 
        {
            Assert.fail("Select a room! Actual text: " + roomselection);//", Expected text: " + expectedText);
        }
	 }
}
