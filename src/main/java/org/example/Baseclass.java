package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.w3c.dom.DOMConfiguration;
import utility.ExtentreportManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriverWait wait;


    @BeforeTest
    public void config() throws Throwable {

        try {
            prop = new Properties();
            FileInputStream file = new FileInputStream("/Users/macbookpro/Desktop/Selenium_Project_Final/src/main/java/config/config.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initialization() {
        if (prop.getProperty("browser").equals("chromedriver")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            System.out.println("url opened ");
        } else {
            System.out.println("Browser not initialized");
        }
    }



        public static void teardown ()

        {
            driver.quit();
        }




    }






