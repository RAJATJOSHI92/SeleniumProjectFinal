package page;

import org.example.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Shoppage extends Baseclass
{
    @FindBy(xpath="//img[@title='Android Quick Start Guide']")
    WebElement androidclick;

    @FindBy(xpath="//img[@title='Functional Programming in JS']")
    WebElement funtionaleclick;


  public  Shoppage()
  {
      PageFactory.initElements(driver,this);

  }

  public Androidpage clickandroid()
  {
      wait.until(ExpectedConditions.elementToBeClickable(androidclick)).click();
      return new Androidpage();
  }




}
