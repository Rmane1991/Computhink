package Computhink.Contentverse;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	Sheet sheet;
	public WebDriver driver;
	
	public void ReadExcel() throws IOException {
		FileInputStream fis = new FileInputStream((System.getProperty("user.dir") + "\\src\\main\\java\\cv_resources\\Test_Data.xlsx"));
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		
		for (StackTraceElement element : stackTrace) 
        {
            String className = element.getClassName();
           
            if (className.contains("LoginTestCase"))
            {
            	sheet = wb.getSheetAt(0);
                break;
            }
            else if (className.contains("SearchTestCase")) 
            {
            	sheet = wb.getSheetAt(1);
                break;
			} else if (className.contains("CreateDocumentTest")||className.contains("UpdateExistingFileTest"))
			{
				sheet = wb.getSheetAt(2);
                break;
			}
			 else if (className.contains("SendToWorkflowTestcase")) 
	            {
	            	sheet = wb.getSheetAt(3);
	                break;
				}
        }
		
		
	}
	
	public WebDriver launchBrowser() throws Exception {

		ReadExcel();
		// ConfigReader();

		if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", System.getProperty("user.dir") + "\\downloadFiles\\");
			profile.setPreference("browser.download.manager.closeWhenDone", true);
			options.setProfile(profile);

			driver = new FirefoxDriver(options);

		} else if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			// prefs.put("safebrowsing.enabled", false);
			// prefs.put("profile.default_content_settings.popups", 0);
			// prefs.put("download.prompt_for_download", false);
			prefs.put("download.default_directory", System.getProperty("user.dir") + "\\downloadFiles\\");
			prefs.put("browser.download.manager.closeWhenDone", true);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-features=InsecureDownloadWarnings");
			// options.addArguments("--disable-popup-blocking");
			// options.addArguments("--disable-notifications");
			// options.addArguments("--safebrowsing-disable-download-protection");
			// options.addArguments("safebrowsing-disable-extension-blacklist");
			// options.addArguments("--allow-running-insecure-content");

			driver = new ChromeDriver(options);

		} else if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(sheet.getRow(1).getCell(5).getStringCellValue());
		return driver;
	}

	public void sendEmailWithReport() {
		final String username = "cmsautomation0@gmail.com";
		final String password = "Pass@123";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "465");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("cmsautomation0@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("rmane565@gmail.com, rmane565@gmail.com"));
			message.setSubject("Testing Gmail SSL");
			message.setText("Dear Mail Crawler," + "\n\n Please do not spam my email!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
