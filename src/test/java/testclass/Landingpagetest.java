package testclass;

import org.example.Baseclass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Indexpage;
import page.Landingpage;
import page.Loginpage;
import page.Orderspage;

public class Landingpagetest  extends Baseclass

{

    Loginpage login;
    Indexpage index;

    Landingpage landing;

    Orderspage orders;


    @BeforeMethod
    public void start()
    {
        initialization();
    }


    @Test(enabled = false)
    public void signoutclick() throws Throwable
    {
        login= new Loginpage();
        index= new Indexpage();
        landing=new Landingpage();
        index.clickacct();
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Site",ss);
        //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
        String usernameee  = login.inputuserpass("joshi.rajat085@gmail.com","Manthecool2@786");
        System.out.println(usernameee);
        login.click();
        System.out.println("clicked");

        String text = driver.findElement(By.xpath("//strong[normalize-space()='joshi.rajat085']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"joshi.rajat085");
        System.out.println("assertion passed");
        landing.logout();
        System.out.println(" Logout clicked");
    }

    @Test(enabled = false)
    public void  dasboardclick ()throws Throwable
    {
        login= new Loginpage();
        index= new Indexpage();
        landing=new Landingpage();
        index.clickacct();
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Site",ss);
        //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
        String usernameee  = login.inputuserpass("joshi.rajat085@gmail.com","Manthecool2@786");
        System.out.println(usernameee);
        login.click();
        System.out.println("clicked");

        String text = driver.findElement(By.xpath("//strong[normalize-space()='joshi.rajat085']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"joshi.rajat085");
        System.out.println("assertion passed");
        landing.gotodashboard();
        System.out.println(" dashboard clicked");

    }
    @Test
    public void Ordersclick() throws Throwable
    {
        login= new Loginpage();
        index= new Indexpage();
        landing=new Landingpage();
        index.clickacct();
        orders= new Orderspage();
        String ss = driver.getTitle();
        Assert.assertEquals("My Account – Automation Practice Site",ss);
        //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
        String usernameee  = login.inputuserpass("joshi.rajat085@gmail.com","Manthecool2@786");
        System.out.println(usernameee);
        login.click();
        System.out.println("clicked");

        String text = driver.findElement(By.xpath("//strong[normalize-space()='joshi.rajat085']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"joshi.rajat085");
        System.out.println("assertion passed");
        landing.gotoorders();
        System.out.println(" order clicked");
        orders.clickonshop();
        System.out.println("shop clicked");


    }



    @AfterMethod
    public void teardow()
    {
        teardown();
    }

}
