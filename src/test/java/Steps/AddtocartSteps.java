package Steps;

import com.Magento.Base;
import com.Magento.Pages.AddToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtocartSteps extends Base {
    AddToCartPage addToCartPage;
    @When("User select item from mens and add it to cart")
    public void user_select_item_from_mens_and_add_it_to_cart() {

        addToCartPage=new AddToCartPage();
        addToCartPage.AddtoCartItem();
    }
    @Then("Message that articl was added  should 166appear")
    public void message_that_articl_was_added_should_166appear() {
        addToCartPage.ItemAddedDisp();

    }

    @And("User remove item from cart")
    public void user_remove_item_from_cart() throws InterruptedException {
        addToCartPage= new AddToCartPage();
        addToCartPage.RemoveFromCart();

    }
    @Then("Item should be removed")
    public void item_should_be_removed() {
        addToCartPage.ItemRemovedDisp();

    }
}
