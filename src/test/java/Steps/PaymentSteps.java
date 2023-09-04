package Steps;

import com.Magento.Base;
import com.Magento.Pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PaymentSteps extends Base {
    PaymentPage paymentPage;
    @And("User select item options and add it to the cart and click on preceed to checkout")
    public void user_select_item_options_and_add_it_to_the_cart_and_click_on_preceed_to_checkout() throws InterruptedException {
        paymentPage=new PaymentPage();
        paymentPage.FirstStape();

    }
    @And("User fill the email as {string} and {string} and {string}")
    public void user_fill_the_email_as_and_and(String Email, String Firstname, String Lastname) {
        paymentPage.SecondStep(Email,Firstname,Lastname);

    }
    @And("User fill the street adress as {string} and {string} and select state and {string} and {string} and click on next")
    public void user_fill_the_street_adress_as_and_and_select_state_and_and_and_click_on_next(String STRIT, String CTY, String ZP, String PN) {
        paymentPage.ThirdStep(STRIT,CTY,ZP,PN);
    }
    @Then("Review payment should appear")
    public void review_payment_should_appear() {
        paymentPage.DISFIRST();

    }
    @And("User click on same bylling and shipping and click on place order")
    public void user_click_on_same_bylling_and_shipping_and_click_on_place_order() {
        paymentPage.CheckClick();

    }
    @Then("payment should be done")
    public void payment_should_be_done() {
        paymentPage.AllDISPCHECKOUT();

    }
}
