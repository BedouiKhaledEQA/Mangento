package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement SearchText;
    @FindBy(xpath = "//contains(text(),' Olivia 1/4 Zip Light Jacket')]")
    WebElement SearchButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/dl[1]/dd[1]/a[1]")
    WebElement ItemFInded;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement Test;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[2]/a[1]/img[1]")
    WebElement Logob;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement DispHome;
    public void PerformSearch(String ItemS) throws InterruptedException {
        SearchText.sendKeys(ItemS);
        Thread.sleep(5000);
        Actions actions =new Actions(driver);
        actions.moveToElement(Test).perform();
        Test.click();

    }
    public void PerformItemDisplayed(){
        Assert.assertTrue((ItemFInded).isDisplayed());


    }
    public void PerformButtonlogo(){
        Logob.click();
    }
    public void PerformDispHomepageLogo(){
        Assert.assertTrue((DispHome).isDisplayed());
    }
}
