package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage extends Baseclass {

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dashboard;
    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement orders;
    @FindBy(xpath = "//a[normalize-space()='Downloads']")
    WebElement downloads;
    @FindBy(xpath = "//a[normalize-space()='Addresses']")
    WebElement addresses;
    @FindBy(xpath = "//a[normalize-space()='Account Details']")
    WebElement accountdetail;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;


   public Landingpage ()
   {
       PageFactory.initElements(driver,this);
   }


    public Landingpage gotodashboard()
    {
        dashboard.click();
        return new Landingpage();
    }
    public Orderspage gotoorders()
    {
         orders.click();
        return new Orderspage();
    }
    public void gotodownloads()
    {
downloads.click();
    }
    public void gotoaddreses()
    {
addresses.click();
    }
    public void accoountdetails()
    {
accountdetail.click();
    }
    public Loginpage logout()
    {
       logout.click();
       return new Loginpage();
    }



}
