package com.Magento.Pages;

import com.Magento.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GetTitleArticlePage extends Base {
    public GetTitleArticlePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//ol[@class='products list items product-items']")
    WebElement Titre;
    @FindBy(xpath = "")
    WebElement TitreArticle;

    public void GETTITLE(){
        WebElement TitreArticle = Titre;
        List<WebElement> Article = TitreArticle.findElements(By.xpath("//strong[@class='product name product-item-name']"));
        for (int i = 0; i < Article.size(); i++)
        {
            System.out.println(Article.get(i).getText());
        }


    }
    public void GETTITLE2(){

    }
}
