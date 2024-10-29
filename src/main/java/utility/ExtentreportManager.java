package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;

public class ExtentreportManager
{
  public  static ExtentReports reports;


    public static void etextent() throws IOException
    {
        ExtentSparkReporter  spark = new ExtentSparkReporter("/Users/macbookpro/Desktop/Selenium_Project_Final/Extentreports/Reports.html");
        spark.config().setReportName("Automation test report");
        spark.config().setDocumentTitle("Automation project");
        spark.config().setTheme(Theme.DARK);
        reports = new ExtentReports();
        reports.attachReporter(spark);
        reports.setSystemInfo("computerName", "localhost");
        reports.setSystemInfo("Tester name", "Rajat joshi");
        reports.setSystemInfo("OS", "windows");
    }


}
