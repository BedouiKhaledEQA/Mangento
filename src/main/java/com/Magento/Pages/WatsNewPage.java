package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatsNewPage extends Base {
    public WatsNewPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement WhatsButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/strong[1]/span[1]")
    WebElement NEWINWOMEN;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement Hoodies;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement Jacket;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement Tees;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement Bras;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement Pants;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement Shorts;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/strong[2]/span[1]")
    WebElement NEWINMEN;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[1]/a[1]")
    WebElement HoodiesM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[2]/a[1]")
    WebElement JacketM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[3]/a[1]")
    WebElement TeesM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[4]/a[1]")
    WebElement Tanks;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[5]/a[1]")
    WebElement PantsM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[6]/a[1]")
    WebElement ShortsM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[3]/div[1]/div[1]/strong[1]")
    WebElement CompareProduct;
    @FindBy(xpath = "//strong[contains(text(),'My Wish List')]")
    WebElement MyWishList;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement ResultItem;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]")
    WebElement YOGAB;
    public void PerformWhatsNew1(){
        WhatsButton.click();
    }
    public void PerformDisplayWhatsNEw(){
        Assert.assertTrue((NEWINWOMEN).isDisplayed());
        Assert.assertTrue((Hoodies).isDisplayed());
        Assert.assertTrue((Jacket).isDisplayed());
        Assert.assertTrue((Tees).isDisplayed());
        Assert.assertTrue((Bras).isDisplayed());
        Assert.assertTrue((Pants).isDisplayed());
        Assert.assertTrue((Shorts).isDisplayed());
        Assert.assertTrue((NEWINMEN).isDisplayed());
        Assert.assertTrue((HoodiesM).isDisplayed());
        Assert.assertTrue((JacketM).isDisplayed());
        Assert.assertTrue((TeesM).isDisplayed());
        Assert.assertTrue((Tanks).isDisplayed());
        Assert.assertTrue((PantsM).isDisplayed());
        Assert.assertTrue((ShortsM).isDisplayed());
        Assert.assertTrue((CompareProduct).isDisplayed());
        Assert.assertTrue((MyWishList).isDisplayed());
    }
    public void PerformCheckItemWomen() {
        WhatsButton.click();
        Hoodies.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();



        Jacket.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        Tees.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        Bras.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        Pants.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();

        Shorts.click();
        Assert.assertTrue((ResultItem).isDisplayed());

    }


    public void PerformCheckItemMens() {
        WhatsButton.click();
        HoodiesM.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();



        JacketM.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        TeesM.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        Tanks.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();


        PantsM.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        driver.navigate().back();

        ShortsM.click();
        Assert.assertTrue((ResultItem).isDisplayed());

    }

    public HomePage PerformCheckItemyoga() {
        WhatsButton.click();
        YOGAB.click();
        Assert.assertTrue((ResultItem).isDisplayed());
        return new HomePage();

    }}
