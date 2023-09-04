package Steps;

import com.Magento.Base;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.SignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends Base {
    SignUpPage signUpPage;
    HomePage homePage;

    @When("User fill the email as {string} and {string} and click on login")
    public void user_fill_the_email_as_bedouikhaled1_gmail_com_and_and_click_on_login(String Email,String password) {
        signUpPage =new SignUpPage();
        homePage =new HomePage();
        homePage= signUpPage.PerformLogin(Email,password);

    }
    @Then("User should navigate at the home page")
    public void user_should_navigate_at_the_home_page() {
        signUpPage.PerformDisp();

    }

    //FORGET PASSWORD SCENARIO
    @When("User click on forget password and fill the email as {string}")
    public void user_click_on_forget_password_and_fill_the_email_as(String string) {

    }


    @When("User add reCaptcha and click on Reset My password")
    public void user_add_re_captcha_and_click_on_reset_my_password() {

    }
    @Then("User should login")
    public void user_should_login() {

    }

}
