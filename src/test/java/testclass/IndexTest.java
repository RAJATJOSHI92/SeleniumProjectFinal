package testclass;

import org.example.Baseclass;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Accountpage;
import page.Indexpage;
import utility.Log;

import java.util.List;

public class IndexTest  extends Baseclass
{
    Indexpage index;

    @BeforeMethod
    public void start()
    {
        initialization();
    }

    @Test
    public void verify() throws  Throwable
    {
        index=new Indexpage();
        index.clickacct();
        Log.startTestCase("verify");
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Sit",ss);
    }







    @AfterMethod
    public void teardow()
    {
        teardown();
    }

}
