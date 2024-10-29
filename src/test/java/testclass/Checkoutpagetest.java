package testclass;

import org.example.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.*;

import static utility.Log.log;

public class Checkoutpagetest extends Baseclass
{
    Loginpage login;
    Indexpage index;

    Landingpage landing;

    Orderspage orders;

    Androidpage android;

    Shoppage shop;

    Basketpage basket;

    Checkoutpage checkout;
    @BeforeMethod
    public void start()
    {
        initialization();
    }

@Test
public void ordercheckout() throws Throwable

{
    login = new Loginpage();
    index = new Indexpage();
    landing = new Landingpage();
    shop = new Shoppage();
    index.clickacct();
    orders = new Orderspage();
    android = new Androidpage();
    basket= new Basketpage();
    checkout =new Checkoutpage();

    String ss = driver.getTitle();
    Assert.assertEquals("My Account – Automation Practice Site", ss);
    //String usernameee = accntpage.inputuserpass("joshi.rajat085@gmail.com", "Manthecool2@786");
    String usernameee  = login.inputuserpass(prop.getProperty("username"), prop.getProperty("passward"));
    System.out.println(usernameee);
    login.click();
    log.info(" login clicked again");
    //System.out.println("clicked");
    String text = driver.findElement(By.xpath("//strong[normalize-space()='rajat.joshi087']")).getText();
    log.info(text);
    Assert.assertEquals(text, "rajat.joshi087");
    log.info("assertion passed");


    landing.gotoorders();
    log.info(" order clicked");
    orders.clickonshop();
    log.info("shop clicked");
    shop.clickandroid();
    log.info("android clicked");
    android.setquqntity();

    android.clickbasket();
    log.info("basket clicked");
    android.viewbasket();
    log.info(" view basket clicked");
    basket.clicktoproceed();
    log.info(" proceed to checkout clicked");
     checkout.setdetails("rajatt","joshii","joshi enterprise","9803035459","punjab","pta","147004");
    log.info("details entered");
    checkout.clickbtn();
    log.info("btn clicked");
    log.info("button clicked");
    String sss =driver.findElement(By.className("woocommerce-thankyou-order-received")).getText();
    Assert.assertEquals(sss,"Thank you. Your order has been received.");
    log.info("Order placed");
}

   @AfterMethod
    public static void teardown()
    {
        driver.quit();
    }
}
