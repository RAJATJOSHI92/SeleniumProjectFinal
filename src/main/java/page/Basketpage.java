package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basketpage extends Baseclass
{

    @FindBy(xpath ="//a[@class='checkout-button button alt wc-forward']")
    WebElement proceedtochout;

  public  Basketpage()
    {
        PageFactory.initElements(driver,this);
    }

    public Checkoutpage clicktoproceed()
    {
        proceedtochout.click();
        return new Checkoutpage();
    }

}
