package utility;

import action.Action;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.example.Baseclass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.ExtentreportManager;

import java.io.IOException;

import static org.example.Baseclass.driver;

public class Listener extends ExtentreportManager  implements ITestListener
{
    ExtentTest test;

    Action action= new Action();

    @Override
    public void onStart(ITestContext context) {
        try {
            ExtentreportManager.etextent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestStart(ITestResult result)
    {
        test=reports.createTest(result.getName()+ " test case started");
       // System.out.println(result.getName()+" started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, result.getName() + " got passed");
        }

    }

    @Override
    public void onTestFailure(ITestResult result) {
       if(result.getStatus()==ITestResult.FAILURE)
       {
           test.log(Status.FAIL,
                   MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
           test.log(Status.FAIL,
                   MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
           String imgPath = action.screenShot(driver,result.getName());
           test.fail("ScreenShot is Attached" , MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());

       }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }


    @Override
    public void onFinish(ITestContext context)
    {
        reports.flush();
    }
}


