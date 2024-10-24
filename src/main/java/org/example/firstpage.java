package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class firstpage
{
    public static WebDriver driver;
@BeforeMethod
    public static void initialization()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
       // System.out.println("url opened ");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //System.out.println("url closed ");
    }
    @AfterMethod
    public static void teardown()

    {
        driver.close();
    }
}






