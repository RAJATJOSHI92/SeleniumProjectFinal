package testclass;

import org.example.Baseclass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Accountpage;
import page.Indexpage;
import page.Landingpage;
import page.Loginpage;

import java.util.prefs.BackingStoreException;

public class Loginpagetest extends Baseclass

{
    Loginpage login;
    Indexpage index;

    @BeforeMethod
    public void start() {
        initialization();
    }

    @Test
    public void setuserpass() throws Throwable
    {
        login= new Loginpage();
        index= new Indexpage();
        index.clickacct();
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Site",ss);
        //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
        String usernameee  = login.inputuserpass("rajat.joshi087@gmail.com","Manthecool2@786");
        System.out.println(usernameee);
        login.click();
        System.out.println("clicked");

        String text = driver.findElement(By.xpath("//strong[normalize-space()='rajat.joshi087']")).getText();
       System.out.println(text);
        Assert.assertEquals(text,"rajat.joshi087");
        System.out.println("assertion passed");
        login.signoutclick();


    }


    @AfterMethod
    public void teardow() {
        teardown();
    }


}
