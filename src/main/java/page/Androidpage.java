package page;

import org.example.Baseclass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Androidpage extends Baseclass
{
    Actions action= new Actions(driver);
    @FindBy(xpath ="//input[@title='Qty']")
    WebElement quantity;


    @FindBy(xpath ="//button[@type='submit']")
    WebElement basketclick;

    @FindBy(xpath ="//a[@class='button wc-forward']")
    WebElement viewbasket;

   public Androidpage()
   {
       PageFactory.initElements(driver,this);
   }


   public void setquqntity()
   {
       action.moveToElement(quantity);
       action.click().sendKeys(Keys.ARROW_UP).build().perform();
   }

   public void clickbasket()
   {
    basketclick.click();
   }

    public Basketpage viewbasket()
    {
        viewbasket.click();
        return new Basketpage();
    }
}
