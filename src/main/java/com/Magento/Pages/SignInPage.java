package com.Magento.Pages;

import com.Magento.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Base {
    public SignInPage (){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//*[contains(text(),'Create an Account')]")
    WebElement CreatA;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement Firstname;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement Lastname;
    @FindBy(xpath = "//input[@name='email']")
    WebElement Email;
    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;
    @FindBy(xpath = "//input[@name='password_confirmation']")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement CreatAccountButton;
    @FindBy(xpath = "//*[contains(text(),'Thank you for registering with Fake Online Clothing Store.')]")
    WebElement DisplayedMessage;

    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]")
    WebElement Req1;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]")
    WebElement Req2;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[1]/div[1]/div[1]")
    WebElement Req3;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]")
    WebElement Req4;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[3]/div[1]/div[1]")
    WebElement Req5;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]")
    WebElement Req6;
    @FindBy(xpath = "//div[@id='email_address-error']")
    WebElement EmailReq;
    @FindBy(xpath = "//div[@id='password-confirmation-error']")
    WebElement PassReq;
    @FindBy(xpath = "//div[@for='password']")
    WebElement PassReq2;


    public void PerformSignIn1(String FN, String LN){
        CreatA.click();
        Firstname.sendKeys(FN);
        Lastname.sendKeys(LN);


    }
    public void PerformSignIn2(String mail,String pass1,String pass2){
        Email.sendKeys(mail);
        Password.sendKeys(pass1);
        ConfirmPassword.sendKeys(pass2);
        CreatAccountButton.click();
    }
    public void PerformSignInDisp(){
        Assert.assertTrue((DisplayedMessage).isDisplayed());
    }

    //Required_fields
    public void PerformRequiredField1(){
        CreatA.click();
        CreatAccountButton.click();
    }
    public void PerformRequiredField2(){
        Assert.assertTrue((Req1).isDisplayed());
        Assert.assertTrue((Req2).isDisplayed());
        Assert.assertTrue((Req3).isDisplayed());
        Assert.assertTrue((Req4).isDisplayed());
        Assert.assertTrue((Req5).isDisplayed());
        Assert.assertTrue((Req6).isDisplayed());
    }

    //EMAIL FROMAT AND SIGNIN FAIL
    public void PerformEmailWrong(String mail){
        Email.sendKeys(mail);
    }
    public void PerformPasswrod(String P1,String P2){
        Password.sendKeys(P1);
        ConfirmPassword.sendKeys(P2);
        CreatAccountButton.click();
    }
    public void PerfromErrorMEssageEMAIL(){
        String MessageEmail=EmailReq.getText();
        Assert.assertEquals(MessageEmail,"Please enter a valid email address (Ex: johndoe@domain.com).");
    }

    public void PerformConnexionFailed(){
        Assert.assertTrue((Req6).isDisplayed());
    }
    //Password_Format_length

    public void PerformFormatPass1(){
        //String MsgPass=PassReq2.getText();
        Assert.assertNotNull(PassReq2);
    }

    //Password_Not_same
    public void PerformNotsame(){

        String NOTSAME =PassReq.getText();
        Assert.assertEquals(NOTSAME,"Please enter the same value again.");
    }



}