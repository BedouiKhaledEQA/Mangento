package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Base {
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement SignUp;
    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;
    @FindBy(xpath = "//input[@type='password']")
    WebElement Password;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]")
    WebElement  Login;
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement DispWelcom;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[2]/a[1]/span[1]")
    WebElement ForgetMypassword;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")
    WebElement EmailRecap;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement ResetPass;

    public HomePage PerformLogin(String mail, String pass){
        SignUp.click();
        Email.sendKeys(mail);
        Password.sendKeys(pass);
        Login.click();
        return new HomePage();
    }
    public void PerformDisp(){
        Assert.assertTrue((DispWelcom).isDisplayed());


    }

    //FORGET PASSWORD FUNCTIONALITY

    public void PerformRecaptcha1(String EmailR){
        SignUp.click();
        ForgetMypassword.click();
        EmailRecap.sendKeys(EmailR);



    }
    public void PerformRecpatcha2(){
      /*  WebElement recaptcha = driver.findElement(By.id("g-recaptcha"));
        String siteKey = recaptcha.getAttribute("data-sitekey");
        // Use the site key to solve the reCAPTCHA challenge using a third-party service
        String recaptchaResponse = solveReCAPTCHA(siteKey);
        // Submit the form with the reCAPTCHA response
        driver.findElement(By.id("recaptcha-response")).sendKeys(recaptchaResponse);
        driver.findElement(By.id("submit-button")).click();*/



    }
}
