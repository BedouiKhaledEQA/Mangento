package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends Base {
    public PaymentPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]")
    WebElement Check;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[1]/h1[1]/span[1]")
    WebElement PaiementDOne;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
    WebElement Size;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
    WebElement color;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement AddTocart;

    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[1]/a[1]/span[2]/span[1]")
    WebElement Panier;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]")
    WebElement ProcedToCheckout;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
    WebElement email;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement Firstname;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement Lastname;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement  Street;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]")
    WebElement city;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]")
    WebElement StateMain;
    @FindBy(xpath = "//body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/button[1]/span[1]")
    WebElement Placeorder;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]")
    WebElement Zip;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]")
    WebElement PhoneNumber;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
    WebElement ShippingM;
    @FindBy(xpath = "//body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
    WebElement Same;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]/span[1]")
    WebElement Next;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
    WebElement RADIOB;

    public void FirstStape() throws InterruptedException {
        Size.click();
        color.click();
        AddTocart.click();
        Thread.sleep(5000);
        Panier.click();
        ProcedToCheckout.click();
        
    }
    public void SecondStep(String mail,String FN,String LM){

        email.sendKeys(mail);
        Firstname.sendKeys(FN);
        Lastname.sendKeys(LM);

    }
    public void ThirdStep(String STRIT,String CTY,String ZP,String PN){
        Street.sendKeys(STRIT);
        city.sendKeys(CTY);
        Select sel =new Select(StateMain);
        sel.selectByVisibleText("Alabama");
        Zip.sendKeys(ZP);
        PhoneNumber.sendKeys(PN);
        RADIOB.click();
        Next.click();

    }
    public void  AllDISPCHECKOUT(){
        Assert.assertTrue((PaiementDOne).isDisplayed());
    }
    public void DISFIRST(){
        Assert.assertTrue((Check).isDisplayed());
    }
    public void CheckClick(){
        Same.click();
        Placeorder.click();

    }


}
