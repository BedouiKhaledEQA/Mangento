package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Base {
    Actions actions;
    public WomenPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[2]")
    WebElement WomenB1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement Top;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement Jacket;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")
    WebElement Hoodie;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement Tees;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")
    WebElement Bras;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement ItemFined;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement Bottom;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement PantsB;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement ShortsB;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[2]")
    WebElement WomenButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")
    WebElement JacketsDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement HoodiesDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement TeesDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    WebElement BrasDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[2]/li[1]/a[1]")
    WebElement PantsDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[2]/li[2]/a[1]")
    WebElement ShortsDirecty;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement IteMDirectDisp;
    public void PerformWomen1(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Jacket).perform();
        Jacket.click();


    }
    public void PerformWomenDisp2(){
        Assert.assertTrue((ItemFined).isDisplayed());

    }
    public void PerformWomenHoodie1(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Hoodie).perform();
        Hoodie.click();

    }
    public void PerformWomenHoodieDispled(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformWomenTees(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Tees).perform();
        Tees.click();

    }
    public void PerformWomenTeesDispled(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformWomenBrasTanks(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Bras).perform();
        Bras.click();

    }
    public void PerformWomenBrasTanksDispled(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }


    public void PerformWomenPants(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(PantsB).perform();
        PantsB.click();

    }
    public void PerformWomenPantsDispled(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformWomenShorts(){
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(ShortsB).perform();
        ShortsB.click();

    }
    public void PerformWomenShortsDispled(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void WomenJacket(){
        WomenButton.click();
        JacketsDirecty.click();

    }
    public void WomenJacketDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void WomenHoodie(){
        WomenButton.click();
        HoodiesDirecty.click();


    }
    public void WomenHoodieDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void WomenTees(){
        WomenButton.click();
        TeesDirecty.click();


    }
    public void WomenTeesDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void WomenBrasandTanks(){
        WomenButton.click();
        BrasDirecty.click();


    }
    public void WomenBrasandTanksDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void WomenPants(){
        WomenButton.click();
        PantsDirecty.click();


    }
    public void WomenJPantsDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void WomenShorts(){
        WomenButton.click();
        ShortsDirecty.click();


    }
    public void WomenShortsDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }


}
