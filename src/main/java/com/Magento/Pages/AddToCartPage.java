package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends Base {
    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
    WebElement MensButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement HoodieB;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
    WebElement SizeItem;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
    WebElement ColorItem;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement AddtocartButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement MessageDisp;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[1]/a[1]")
    WebElement Panier;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/a[1]")
    WebElement Corbeil;
    @FindBy(xpath = "//strong[@class='subtitle empty']")
    WebElement MessageRemoved;
    @FindBy(xpath = "//body[1]/div[4]/aside[2]/div[2]/footer[1]/button[2]/span[1]")
    WebElement alert;

    public void AddtoCartItem(){
        MensButton.click();
        HoodieB.click();
        SizeItem.click();
        ColorItem.click();
        AddtocartButton.click();

    }
    public void ItemAddedDisp(){
        String Test=MessageDisp.getText();
        Assert.assertEquals(Test, "You added Marco Lightweight Active Hoodie to your shopping cart.");
    }
    public void RemoveFromCart() throws InterruptedException {
        Thread.sleep(5000);
        Panier.click();
        Corbeil.click();
        Thread.sleep(5000);
        alert.click();

    }
    public void ItemRemovedDisp(){
        String Test2=MessageRemoved.getText();
        Assert.assertEquals(Test2,"You have no items in your shopping cart.");


    }
}
