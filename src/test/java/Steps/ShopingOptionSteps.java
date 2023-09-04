package Steps;

import com.Magento.Base;
import com.Magento.Pages.ShopingOptionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ShopingOptionSteps extends Base {
    ShopingOptionsPage shopingOptionsPage;
    @And("Click on Top and Jackets categorie and select Jackets Option")
    public void click_on_top_and_jackets_categorie_and_select_jackets_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOption1();

    }
    @Then("Jackets looked for should appear")
    public void jackets_looked_for_should_appear() {
        shopingOptionsPage.ShopingOption1Display();

    }




    @And("Click on Women Button and click on Jackets categorie and select Jackets Option")
    public void click_on_women_button_and_click_on_jackets_categorie_and_select_jackets_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionJacket();



    }
    @Then("Jacketss looked for should appear")
    public void jacketss_looked_for_should_appear() {
        shopingOptionsPage.ShopingOptionJacketDisplayed();


    }




    @And("Click on Top and Hoodies categorie and select Hoodie Option")
    public void click_on_top_and_hoodies_categorie_and_select_hoodie_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOption2();



    }
    @Then("Hoodie looked for should appear")
    public void hoodie_looked_for_should_appear() {
        shopingOptionsPage.ShopingOption2Displed();



    }




    @And("Click on Women Button and click on Hoodie categorie and select Hoodies Option")
    public void click_on_women_button_and_click_on_hoodie_categorie_and_select_hoodies_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionHoodie();


    }
    @Then("Hoodies looked for should appear")
    public void hoodies_looked_for_should_appear() {
        shopingOptionsPage.ShopingOptionHoodieDisplayed();


    }




    @And("Click on Top and Tees categorie and select Tees Option")
    public void click_on_top_and_tees_categorie_and_select_tees_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOption3();


    }
    @Then("Tees looked for with option should appear")
    public void Tees_looked_for_with_option_should_appear() {
         shopingOptionsPage.ShopingOption3Displed();

    }





    @And("Click on Women Button and click on Tees categorie and select Tees Option")
    public void click_on_women_button_and_click_on_tees_categorie_and_select_tees_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionTees();


    }
    @Then("Tees looked for  should appear")
    public void tees_looked_for_should_appear() {
         shopingOptionsPage.ShopingOptionTeesDisplayed();

    }





    @And("Click on Top and Bras categorie and select Bras Option")
    public void click_on_top_and_bras_categorie_and_select_bras_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOption4();

    }
    @Then("Bras looked for should appear")
    public void bras_looked_for_should_appear() {
        shopingOptionsPage.ShopingOption4Displed();

    }





    @And("Click on Women Button and click on Bras categorie and select Bras Option")
    public void click_on_women_button_and_click_on_bras_categorie_and_select_bras_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionBrasandTanks();

    }
    @Then("Bras looked for Directly should appear")
    public void bras_looked_for_directly_should_appear() {
          shopingOptionsPage.ShopingOptionBrasandTanksDisplayed();

    }





    @And("Click on Bottoms and categories Pants and select Pants Option")
    public void click_on_bottoms_and_categories_pants_and_select_pants_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
         shopingOptionsPage.ShopingOptions5();

    }
    @Then("Pants looked for should appear")
    public void pants_looked_for_should_appear() {
        shopingOptionsPage.ShopingOption5Displed();

    }




    @And("Click on Women Button and click on Pants categorie and select Pants Option")
    public void click_on_women_button_and_click_on_pants_categorie_and_select_pants_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionPants();

    }
    @Then("Pants looked for Directly should appear")
    public void pants_looked_for_directly_should_appear() {
        shopingOptionsPage.ShopingOptionPantsDisplayed();

    }





    @And("Click on Bottoms and categories Shorts and select Shorts Option")
    public void click_on_bottoms_and_categories_shorts_and_select_shorts_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOption6();

    }
    @Then("Shorts looked for should appear")
    public void shorts_looked_for_should_appear() {
        shopingOptionsPage.ShopingOption6Displed();

    }





    @And("CClick on Women Button and click on Shorts categorie and select Shorts Option")
    public void c_click_on_women_button_and_click_on_shorts_categorie_and_select_shorts_option() throws InterruptedException {
        shopingOptionsPage=new ShopingOptionsPage();
        shopingOptionsPage.ShopingOptionshorts();

    }
    @Then("Shorts Women Directly should appear")
    public void shorts_women_directly_should_appear() {
         shopingOptionsPage.ShopingOptionShortsDisplayed();

    }








}
