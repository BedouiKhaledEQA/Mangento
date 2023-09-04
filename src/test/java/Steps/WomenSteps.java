package Steps;

import com.Magento.Base;
import com.Magento.Pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class WomenSteps extends Base {
    WomenPage womenPage;
    public WomenSteps() {this.womenPage = new WomenPage();}
    @And("Click on Top and categorie Jackets")
    public void Click_on_Top_and_categorie_Jackets(){
        //womenPage =new WomenPage();
        womenPage.PerformWomen1();


    }
    @Then("Item should appear")
    public void Item_should_appear(){
        womenPage.PerformWomenDisp2();

    }

    @And("Click on Top and categorie Hoodie")
    public void Click_on_Top_and_categorie_Hoodie(){
       // womenPage=new WomenPage();
        womenPage.PerformWomenHoodie1();

    }
    @Then("Item Hoodie should appear")
    public void Item_Hoodie_should_appear(){
        womenPage.PerformWomenHoodieDispled();

    }

    @And("Click on Top and categorie Tees")
    public void Click_on_Top_and_categorie_Tees(){
        womenPage=new WomenPage();
        womenPage.PerformWomenTees();


    }
    @Then("Item Tees should appear")
    public void Item_Tees_should_appear(){
        womenPage.PerformWomenTeesDispled();

    }

    @And("Click on Top and categorie Bras&Tanks")
    public void Click_on_Top_and_categorie_Bras_Tanks(){
        womenPage=new WomenPage();
        womenPage.PerformWomenBrasTanks();


    }
    @Then("Item Bras&Tanks should appear")
    public void Item_Bras_Tanks_should_appear(){
        womenPage.PerformWomenBrasTanksDispled();
 }


    @And("Click on Bottoms and categories Pants")
     public void Click_on_Bottoms_and_categories_Pants(){
        womenPage=new WomenPage();
        womenPage.PerformWomenPants();



    }
    @Then("Item pants should appear")
    public void Item_pants_should_appear(){
        womenPage.PerformWomenPantsDispled();

    }

    @And("Click on Bottoms and categorie Shorts")
    public void Click_on_Bottoms_and_categorie_shorts(){
        womenPage=new WomenPage();
        womenPage.PerformWomenShorts();



    }
    @Then("Item Shorts should appear")
    public void Item_shorts_should_appear(){
        womenPage.PerformWomenShortsDispled();

    }

    @And("Click on Women Button and click on Jackets")
    public void Click_on_Women_Button_and_click_on_Jackets(){
        womenPage=new WomenPage();
        womenPage.WomenJacket();

    }
    @Then("Jackets women should appear")
    public void Jackets_women_should_appear(){
        womenPage.WomenJacketDisplayed();

    }


    @And("Click on Women Button and click on Hoodie")
    public void Click_on_Women_Button_and_click_on_Hoodie(){
        womenPage=new WomenPage();
        womenPage.WomenHoodie();

    }
    @Then("Hoodie women should appear")
    public void Hoodie_women_should_appear(){
        womenPage.WomenHoodieDisplayed();

    }

    @And("Click on Women Button and click on Tees")
    public void Click_on_Women_Button_and_click_on_Tees(){
        womenPage=new WomenPage();
        womenPage.WomenTees();

    }
    @Then("Tees Women should appear")
    public void Tees_women_should_appear(){
        womenPage.WomenTeesDisplayed();

    }
    @And("Click on Women Button and click on Bras&Tanks")
    public void Click_on_Women_Button_and_click_on_Bras_Tanks(){
        womenPage=new WomenPage();
        womenPage.WomenBrasandTanks();

    }
    @Then("Bras&Tanks Women should appear")
    public void Bras_Tanks_women_should_appear(){
        womenPage.WomenBrasandTanksDisplayed();

    }
    @And("Click on Women Button and click on Pants")
    public void Click_on_Women_Button_and_click_on_Pants(){
        womenPage=new WomenPage();
        womenPage.WomenPants();

    }
    @Then("pants Women should appear")
    public void Pants_women_should_appear(){
        womenPage.WomenJPantsDisplayed();

    }
    @And("Click on Women Button and click on Shorts")
    public void Click_on_Women_Button_and_click_on_Shorts(){
        womenPage=new WomenPage();
        womenPage.WomenShorts();

    }
    @Then("Shorts Women should appear")
    public void Shorts_women_should_appear(){
        womenPage.WomenShortsDisplayed();

    }



}
