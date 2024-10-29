package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass
{

    @FindBy(xpath = "//input[@id='username']")
    WebElement ussername;


    @FindBy(xpath = "//input[@id='password']")
    WebElement passsward;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginbtn;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    WebElement signoutbtn;
    public Loginpage()
    {
        PageFactory.initElements(driver,this);
    }


    public String inputuserpass(String username, String passward) throws Throwable
    {
        ussername.sendKeys(username);
        passsward.sendKeys(passward);
        return username;
    }

    public Landingpage click()throws Throwable
    {
        loginbtn.click();
        return new Landingpage();
    }

    public Loginpage signoutclick() throws Throwable
    {
        signoutbtn.click();
        return new Loginpage();
    }

}
