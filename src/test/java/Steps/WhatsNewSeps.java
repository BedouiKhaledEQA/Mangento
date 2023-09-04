package Steps;

import com.Magento.Base;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.WatsNewPage;
import io.cucumber.java.en.Then;

public class WhatsNewSeps extends Base {
    WatsNewPage watsNewPage;
    HomePage homePage;
    @Then("User click on Whats new button and should find all categories")
    public void User_click_on_Whats_new_button_and_should_find_all_categories(){
        watsNewPage=new WatsNewPage();
        watsNewPage.PerformWhatsNew1();
        watsNewPage.PerformDisplayWhatsNEw();

    }

    @Then("User click on Whats new button and click on selected WOMENS categorie and items should appear")
    public void User_click_on_Whats_new_button_and_click_on_selected_WOMENS_categorie_and_items_should_appear(){
        watsNewPage=new WatsNewPage();
        watsNewPage.PerformCheckItemWomen();

    }
    @Then("User click on Whats new button and click on selected MENS categorie and items should appear")
    public void User_click_on_Whats_new_button_and_click_on_selected_MENS_categorie_and_items_should_appear(){
        watsNewPage=new WatsNewPage();
        watsNewPage.PerformCheckItemMens();

    }
    @Then("User click on Whats new button and click on selected YOGA categorie and items should appear")
    public void User_click_on_Whats_new_button_and_click_on_selected_YOGA_categorie_and_items_should_appear(){
        watsNewPage=new WatsNewPage();
        homePage =new HomePage();
        homePage =watsNewPage.PerformCheckItemyoga();

    }

}
