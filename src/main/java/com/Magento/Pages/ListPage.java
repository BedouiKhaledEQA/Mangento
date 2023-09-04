package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends Base {
    public ListPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[2]")
    WebElement Women;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement Hoodies;
    @FindBy(xpath ="//div[contains(text(),'Price')]" )
    WebElement PriceB;
    @FindBy(xpath = "//span[contains(text(),'$50.00')]")
    WebElement priceM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]")
    WebElement ListResult;
    public void Gotofiltre(){
        Women.click();
        Hoodies.click();
    }
    public void SelectPrice() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().refresh();
        PriceB.click();
        priceM.click();
    }
    public void ResultSearch(){
        /*//List<WebElement> list=driver.findElements(By.xpath("//span[@data-price-type='finalPrice']"));
       // System.out.println("Number of elements:" +list.size());*/
        List<WebElement> prices = driver.findElements(By.xpath("//span[@data-price-type = 'finalPrice']"));
        List<Float> priceList = new ArrayList<>();
        for (WebElement price : prices) {
            String priceText = price.getText().replace("$", "");
            float priceValue = Float.parseFloat(priceText);
            priceList.add(priceValue);}
        float minPrice = 50;
        float maxPrice = 60;
        boolean isWithinRange = true;
        for (float price : priceList)
        {if (price < minPrice || price > maxPrice) {
            isWithinRange = false;
            break;}}
        if (isWithinRange) {
            System.out.println("All prices are within the range of $" + minPrice + " to $" + maxPrice);
             isWithinRange=true;
        }
        else {System.out.println("Not all prices are within the range of $" + minPrice + " to $" + maxPrice);
             isWithinRange=false;
        }
        Assert.assertTrue(isWithinRange);
    }



        }







