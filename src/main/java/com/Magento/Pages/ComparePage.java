package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage extends Base {
    Actions actions;
    public ComparePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]")
    WebElement item1;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[2]")
    WebElement CompareButton1;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement MessageDisp1;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]")
    WebElement item2;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[2]")
    WebElement CompareButton2;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement MessageDisp2;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[3]/div[1]/div[1]/span[1]")
    WebElement ListElement;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]")
    WebElement COmpareButtonList;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[1]/h1[1]/span[1]")
    WebElement PageCOmpareDIsp;



    public void Compare1(){
        actions=new Actions(driver);
        actions.moveToElement(item1).perform();
        CompareButton1.click();

    }
    public void Compare2() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue((MessageDisp1).isDisplayed());

    }
    public void Compare3(){
        actions.moveToElement(item2).perform();
        CompareButton2.click();


    }
    public void Compare4() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue((MessageDisp2).isDisplayed());

    }
    public void Compare5(){
        String Test="2 items";
        Assert.assertEquals((ListElement.getText()),Test);

    }
    public void Compare6(){
        COmpareButtonList.click();

    }
    public void Compare7(){
        Assert.assertTrue((PageCOmpareDIsp).isDisplayed());

    }
}
