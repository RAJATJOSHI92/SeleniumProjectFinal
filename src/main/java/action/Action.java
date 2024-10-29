package action;

import org.apache.commons.io.FileUtils;
import org.example.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Action extends Baseclass
{

    public  String screenShot(WebDriver driver, String filename) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = "/Users/macbookpro/Desktop/Selenium_Project_Final/ScreenShots/" + filename + "_" + dateName + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }

        String newImageString = "/Users/macbookpro/Desktop/Selenium_Project_Final/ScreenShots/" + filename + "_"
                + dateName + ".png";
        return newImageString;
    }

}
