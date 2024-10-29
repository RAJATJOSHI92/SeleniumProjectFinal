package page;

import org.example.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkoutpage extends Baseclass {
    Actions action = new Actions(driver);
    // action.moveByOffset(460,540).click().build().perform();
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstnname;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastnname;
    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement companynname;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;
    // @FindBy(xpath="///div[@id='s2id_billing_country']")
    // WebElement country;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement addresss;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement cityy;
    @FindBy(xpath = "//input[@id='billing_state']")
    WebElement statee;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postcodee;
    @FindBy(xpath = "//input[@id='place_order']")
    WebElement orderplacebtn;



    public Checkoutpage() {
        PageFactory.initElements(driver, this);

    }

    public void setdetails(String firstname, String lastname, String companyname, String phoneno, String adddress, String city, String postalcode)
    {
        firstnname.sendKeys(firstname);
        lastnname.sendKeys(lastname);
        companynname.sendKeys(companyname);
        phone.sendKeys(phoneno);
        addresss.sendKeys(adddress);
        cityy.sendKeys(city);
        postcodee.sendKeys(postalcode);

    }
    public Lastpage clickbtn()
    {
        orderplacebtn.submit();
        return new Lastpage();
    }
}
