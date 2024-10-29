package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderspage extends Baseclass

{
    @FindBy(xpath="//a[@class='woocommerce-Button button']")
    WebElement shopbtn;

    public Orderspage()
    {
        PageFactory.initElements(driver,this);
    }

    public Shoppage clickonshop()
    {
        shopbtn.click();
        return new Shoppage();
    }
}
