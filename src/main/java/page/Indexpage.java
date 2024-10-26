package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage extends Baseclass {

    Actions action=new Actions(driver);
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    private WebElement btn;


public Indexpage()
{
    PageFactory.initElements(driver,this);
}

public Accountpage clickacct()
{
    action.moveToElement(btn).click().build().perform();
    return  new Accountpage();
}




}

