package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Base {
    Actions actions;
    public GearPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")
    WebElement GearB;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
    WebElement  Bags;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]/span[1]")
    WebElement FintessE;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]")
    WebElement WatchesB;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement ItemDisp;
    public void CheckBags(){
        actions =new Actions(driver);
        actions.moveToElement(GearB).perform();
        Bags.click();

    }
    public void BagsDisplayed(){
        Assert.assertTrue((ItemDisp).isDisplayed());

    }
    public void CheckFitnessEquipement(){
        actions =new Actions(driver);
        actions.moveToElement(GearB).perform();
        FintessE.click();


    }
    public void FitnessEquipementDisplayed(){
        Assert.assertTrue((ItemDisp).isDisplayed());
    }
    public void CheckWatches(){
        actions =new Actions(driver);
        actions.moveToElement(GearB).perform();
        WatchesB.click();

    }
    public void WatchesDisplayed(){
        Assert.assertTrue((ItemDisp).isDisplayed());

    }
}
