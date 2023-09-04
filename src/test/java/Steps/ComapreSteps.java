package Steps;

import com.Magento.Base;
import com.Magento.Pages.ComparePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComapreSteps extends Base {
    ComparePage comparePage;
    @When("Click on buttom compare for item selected")
    public void click_on_buttom_compare_for_item_selected() {
        comparePage=new ComparePage();
        comparePage.Compare1();

    }
    @And("Message should be appear")
    public void message_should_be_appear() throws InterruptedException {
        comparePage.Compare2();
    }
    @Then("Click on button comapre for the second item to compare")
    public void click_on_button_comapre_for_the_second_item_to_compare() {
       comparePage.Compare3();
    }
    @And("Message should appear")
    public void message_should_appear() throws InterruptedException {
        comparePage.Compare4();
    }
    @Then("Check all item selected was added into compare list")
    public void check_all_item_selected_was_added_into_compare_list() {
        comparePage.Compare5();
    }
    @When("User click on compare Button")
    public void user_click_on_compare_button() {
        comparePage.Compare6();
    }
    @Then("Compare Page should appear")
    public void compare_page_should_appear() {
       comparePage.Compare7();
    }

}
