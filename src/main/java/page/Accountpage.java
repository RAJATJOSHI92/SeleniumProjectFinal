package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage extends Baseclass
{
    //Actions action= new Actions(driver);
    @FindBy(xpath = "//input[@id='reg_email']")
   WebElement ussername;


    @FindBy(xpath = "//input[@id='reg_password']")
   WebElement passsward;

    @FindBy(xpath = "//input[@name='register']")
 WebElement regbtn;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
  WebElement signoutbtn;
    public Accountpage()
    {
        PageFactory.initElements(driver,this);
    }


    public String inputuserpass(String username, String passward) throws Throwable
    {
      ussername.sendKeys(username);
      passsward.sendKeys(passward);
      return username;
    }

    public Loginpage click()throws Throwable
    {
        regbtn.click();
        return new Loginpage();
    }

    public Accountpage signoutclick() throws Throwable
    {
        signoutbtn.click();
        return new Accountpage();
    }

}
