package Steps;

import com.Magento.Base;
import com.Magento.Pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;


public class SignInSteps extends Base {
    SignInPage signInPage;
    @Given("User open the browser")
    public void user_open_the_browser() throws MalformedURLException {
        Luncher();

    }
    @When("User fill the Firstname as {string} and Lastname as {string}")
    public void user_fill_the_firstname_as_and_lastname_as(String Firstname, String Lastname) {
        signInPage =new SignInPage();
        signInPage.PerformSignIn1(Firstname,Lastname);

    }
    @When("User fill email as {string} and password as {string} and confirm MDP as {string}")
    public void user_fill_email_as_and_password_as_and_confirm_mdp_as(String Email, String Password, String ConfirmaPassword) {
        signInPage.PerformSignIn2(Email,Password,ConfirmaPassword);
    }
    @Then("Account should be created")
    public void account_should_be_created() {
        signInPage.PerformSignInDisp();

    }
    //Required_fields
    @When("User click on creat account Button")
    public void user_click_on_creat_account_button() {
        signInPage =new SignInPage();
        signInPage.PerformRequiredField1();


    }
    @Then("Error message should appear under the Required fields")
    public void error_message_should_appear_under_the_required_fields() {
        signInPage.PerformRequiredField2();

    }
    //EMAIL FROMAT AND SIGNIN FAIL
    @And("user fill the wrong email as {string} and click on creat account")
    public void user_fill_the_wrong_email_as_khaled_and_click_on_creat_account(String Email) {
        signInPage=new SignInPage();
        signInPage.PerformEmailWrong(Email);

    }
    @And("User fill password as {string} and confirm MDP as {string}")
     public void User_fill_password_as_and_confirm_MDP_as(String Pass,String ConFP){
        signInPage.PerformPasswrod(Pass,ConFP);



     }
    @Then("Error message should appear under the email fields as")
    public void error_message_should_appear_under_the_email_fields_as() {
        signInPage.PerfromErrorMEssageEMAIL();

    }
    @And("Account shouldnt be created")
    public void account_shouldnt_be_created() {
        signInPage.PerformConnexionFailed();

    }
    //Password_Format_same
    @And("Error message not same should appear")
    public void Error_message_not_same_should_appear(){
        signInPage=new SignInPage();
        signInPage.PerformNotsame();

    }
    //Password_length
    @Then("Error message should appear under password field lenght")
    public void Error_message_should_appear_under_password_field_lenght( ){
        signInPage=new SignInPage();
        signInPage.PerformFormatPass1();

    }


}
