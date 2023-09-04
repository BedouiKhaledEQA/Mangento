package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPage extends Base {
    Actions actions;
    public MensPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
    WebElement MENB1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[2]")
    WebElement Top;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement JacketM;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")
    WebElement HoodieM;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement TeesM;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]")
    WebElement TanksM;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/p[1]")
    WebElement ItemFined;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
    WebElement Bottom;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement PantsB;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement ShortsB;

    public void Perform1MAN(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(JacketM).perform();
        JacketM.click();


    }
    public void PerformnDisp2MAN(){
        Assert.assertTrue((ItemFined).isDisplayed());

    }
    public void PerformenHoodie1MAN(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(HoodieM).perform();
        HoodieM.click();

    }
    public void PerforHoodieDispledMAN(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformTeesMAN(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(TeesM).perform();
        TeesM.click();

    }
    public void PerformenTeesDispledMAN(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformWomenBrasTanksMAN(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Top).perform();
        actions.moveToElement(TanksM).perform();
        TanksM.click();

    }
    public void PerformenBrasTanksDispledMAN(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }


    public void PerformennPants(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(PantsB).perform();
        PantsB.click();

    }
    public void PerformenPantsDispledMAN(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }

    public void PerformenShortsMAN(){
        actions =new Actions(driver);
        actions.moveToElement(MENB1).perform();
        actions.moveToElement(Bottom).perform();
        actions.moveToElement(ShortsB).perform();
        ShortsB.click();

    }
    public void PerformenShortsDispledMAN(){
        Assert.assertTrue((ItemFined).isDisplayed());
    }
}
