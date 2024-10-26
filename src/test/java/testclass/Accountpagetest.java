package testclass;

import org.example.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Accountpage;
import page.Indexpage;

import java.util.List;

public class Accountpagetest extends Baseclass {
    Accountpage accntpage;
    Indexpage index;


    @BeforeMethod
    public void start() {
        initialization();
    }

    @Test
    public void setuserpass() throws Throwable
    {
        accntpage= new Accountpage();
        index= new Indexpage();
        index.clickacct();
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Site",ss);
        //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
        String usernameee  = accntpage.inputuserpass("joshi.rajat085@gmail.com","Manthecool2@786");

        accntpage.click();
       String text = driver.findElement(By.xpath("//strong[normalize-space()='joshi.rajat085@gmail.com']")).getText();
        Assert.assertEquals(text,usernameee);
        accntpage.signoutclick();


    }


    @AfterMethod
    public void teardow() {
        teardown();
    }


}
