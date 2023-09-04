package Steps;

import com.Magento.Base;
import com.Magento.Pages.ListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListSteps extends Base {
    ListPage listPage;
    @When("User click on women Button and click on Hoodies")
    public void user_click_on_women_button_and_click_on_hoodies() {
        listPage=new ListPage();
        listPage.Gotofiltre();

    }
    @And("User select the price from shopping options")
    public void user_select_the_price_from_shopping_options() throws InterruptedException {
        listPage.SelectPrice();

    }
    @Then("Item searched should be the same that displayed")
    public void item_searched_should_be_the_same_that_displayed() {
        listPage.ResultSearch();

    }


}
