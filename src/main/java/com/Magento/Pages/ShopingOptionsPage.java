package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ShopingOptionsPage extends Base {
    Actions actions;
    public ShopingOptionsPage(){
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
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement STYLE;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[2]/a[1]")
    WebElement StyleHooded;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[2]/a[1]")
    WebElement StyleTank;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]")
    WebElement Sizeb;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[3]/div[1]")
    WebElement SizeM;
    @FindBy(xpath = "//div[@option-id='171']")
    WebElement SizePants;
    @FindBy(xpath = "//div[@option-id='172']")
    WebElement SizeSHorts;
    @FindBy(xpath ="//div[contains(text(),'Price')]" )
    WebElement PriceB;
    @FindBy(xpath = "//span[contains(text(),'$50.00')]")
    WebElement priceMiddel;
    @FindBy(xpath = "//div[contains(text(),'Color')]")
    WebElement ColorB;
    @FindBy(xpath = "//div[@option-id='50']")
    WebElement colorRed;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement DispTest;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]")
    WebElement Tee;
    @FindBy(xpath = "//span[contains(text(),'$39.99')]")
    WebElement priceTee;
    @FindBy(xpath = "//span[contains(text(),'$29.99')]")
    WebElement priceTank;
    @FindBy(xpath = "//span[contains(text(),'$39.99')]")
    WebElement pricePants;
    @FindBy(xpath = "//span[contains(text(),'$49.99')]")
    WebElement priceshorts;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]")
    WebElement capri;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]")
    WebElement BaseLyorSHort;


    public void ShopingOption1() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Jacket).perform();
        Jacket.click();
        STYLE.click();
        StyleHooded.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceMiddel.click();

        ColorB.click();
        colorRed.click();


    }
    public void ShopingOption1Display(){
        Assert.assertTrue((DispTest).isDisplayed());

    }
    public void ShopingOption2() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Hoodie).perform();
        Hoodie.click();
        STYLE.click();
        StyleHooded.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceMiddel.click();

        ColorB.click();
        colorRed.click();

    }
    public void ShopingOption2Displed(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void ShopingOption3() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Tees).perform();
        Tees.click();
        STYLE.click();
        Tee.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceTee.click();

        ColorB.click();
        colorRed.click();


    }
    public void ShopingOption3Displed(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void ShopingOption4() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(Bras).perform();
        Bras.click();
        STYLE.click();
        StyleTank.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceTank.click();

        ColorB.click();
        colorRed.click();

    }
    public void ShopingOption4Displed(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }


    public void ShopingOptions5() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(PantsB).perform();
        PantsB.click();
        STYLE.click();
        capri.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizePants.click();

        PriceB.click();
        pricePants.click();

        ColorB.click();
        colorRed.click();

    }
    public void ShopingOption5Displed(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void ShopingOption6() throws InterruptedException {
        actions =new Actions(driver);
        actions.moveToElement(WomenB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(ShortsB).perform();
        ShortsB.click();
        STYLE.click();
        BaseLyorSHort.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeSHorts.click();

        PriceB.click();
        priceshorts.click();

        ColorB.click();
        colorRed.click();


    }
    public void ShopingOption6Displed(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void ShopingOptionJacket() throws InterruptedException {
        WomenButton.click();
        JacketsDirecty.click();
        STYLE.click();
        StyleHooded.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceMiddel.click();

        ColorB.click();
        colorRed.click();


    }
    public void ShopingOptionJacketDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void ShopingOptionHoodie() throws InterruptedException {
        WomenButton.click();
        HoodiesDirecty.click();
        STYLE.click();
        StyleHooded.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceMiddel.click();

        ColorB.click();
        colorRed.click();



    }
    public void ShopingOptionHoodieDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void ShopingOptionTees() throws InterruptedException {
        WomenButton.click();
        TeesDirecty.click();
        STYLE.click();
        Tee.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceTee.click();

        ColorB.click();
        colorRed.click();




    }
    public void ShopingOptionTeesDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void ShopingOptionBrasandTanks() throws InterruptedException {
        WomenButton.click();
        BrasDirecty.click();
        STYLE.click();
        StyleTank.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeM.click();

        PriceB.click();
        priceTank.click();

        ColorB.click();
        colorRed.click();



    }
    public void ShopingOptionBrasandTanksDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void ShopingOptionPants() throws InterruptedException {
        WomenButton.click();
        PantsDirecty.click();
        STYLE.click();
        capri.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizePants.click();

        PriceB.click();
        pricePants.click();

        ColorB.click();
        colorRed.click();



    }
    public void ShopingOptionPantsDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }
    public void ShopingOptionshorts() throws InterruptedException {
        WomenButton.click();
        ShortsDirecty.click();
        STYLE.click();
        BaseLyorSHort.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Sizeb.click();
        SizeSHorts.click();

        PriceB.click();
        priceshorts.click();

        ColorB.click();
        colorRed.click();



    }
    public void ShopingOptionShortsDisplayed(){
        Assert.assertTrue((IteMDirectDisp).isDisplayed());

    }

}
