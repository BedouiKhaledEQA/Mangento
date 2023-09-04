package Steps;

import com.Magento.Base;
import com.Magento.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps extends Base {
    HomePage homePage;
    @And("User fill the search as {string} and click on search Button")
    public void user_fill_the_search_as_and_click_on_search_button(String Item) throws InterruptedException {
        homePage =new HomePage();
        homePage.PerformSearch(Item);

    }
    @Then("Result of search should appear")
    public void result_of_search_should_appear() {
        homePage.PerformItemDisplayed();

    }

    @And("Click on Logo button")
    public void Click_on_Logo_button(){
        homePage.PerformButtonlogo();

    }
    @Then("User should be back at the home page")
    public void User_should_be_back_at_the_home_page(){
        homePage.PerformDispHomepageLogo();

    }
}
