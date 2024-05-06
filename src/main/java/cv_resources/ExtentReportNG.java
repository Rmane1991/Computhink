package cv_resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG 
{

	//Changes Done by rajendra 28/02/2024
	public ExtentReports getReportObject() 
		  {
				
				String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
				//String reportName = System.currentTimeMillis()+".html";
				String path = System.getProperty("user.dir")+"//reports//"+"Extentreport_"+timestamp+".html";
				ExtentSparkReporter reporter= new ExtentSparkReporter(path);
				reporter.config().setReportName("Test Cases Report");
				reporter.config().setDocumentTitle("Test Result");
			    ExtentReports extend = new ExtentReports();
				extend.attachReporter(reporter);
				extend.setSystemInfo("Tester", "Rajendra");
				return extend; 
				//extend.createTest(path);
		  }
	
}
