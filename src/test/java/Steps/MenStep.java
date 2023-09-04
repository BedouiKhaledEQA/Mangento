package Steps;

import com.Magento.Base;
import com.Magento.Pages.MensPage;
import com.Magento.Pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MenStep extends Base {
    MensPage mensPage;


    @And("Click on Top and categorie Jackets for Mens")
    public void Click_on_Top_and_categorie_Jackets_for_Mens(){
        mensPage=new MensPage();
        mensPage.Perform1MAN();



    }
    @Then("Item should Mens appear")
    public void Item_should_Mens_appear(){
        mensPage.PerformnDisp2MAN();


    }

    @And("Click on Top and categorie Hoodie for Mens")
    public void Click_on_Top_and_categorie_Hoodie_for_Mens(){
        mensPage=new MensPage();
        mensPage.PerformenHoodie1MAN();


    }
    @Then("Item Hoodie Mens should appear")
    public void Item_Hoodie_should_Mens_appear(){
        mensPage.PerforHoodieDispledMAN();


    }

    @And("Click on Top and categorie Tees for Mens")
    public void Click_on_Top_and_categorie_Tees_for_Mens(){
        mensPage=new MensPage();
        mensPage.PerformTeesMAN();



    }
    @Then("Item Tees Mens should appear")
    public void Item_Tees_should_Mens_appear(){
        mensPage.PerformenTeesDispledMAN();


    }

    @And("Click on Top and categorie Bras&Tanks for Mens")
    public void Click_on_Top_and_categorie_Bras_Tanks_for_Mens(){
        mensPage=new MensPage();
        mensPage.PerformWomenBrasTanksMAN();



    }
    @Then("Item Bras&Tanks Mens should appear")
    public void Item_Bras_Tanks_should_Mens_appear(){
        mensPage.PerformenBrasTanksDispledMAN();

    }


    @And("Click on Bottoms and categories Pants for Mens")
    public void Click_on_Bottoms_and_categories_Pants_for_Mens(){
        mensPage=new MensPage();
        mensPage.PerformennPants();




    }
    @Then("Item pants Mens should appear")
    public void Item_pants_should_Mens_appear(){
        mensPage.PerformenPantsDispledMAN();


    }

    @And("Click on Bottoms and categorie Shorts for Mens")
    public void Click_on_Bottoms_and_categorie_shorts_for_Mens(){
        mensPage=new MensPage();
        mensPage.PerformenShortsMAN();



    }
    @Then("Item Shorts Mens should appear")
    public void Item_shorts_should_Mens_appear(){
        mensPage.PerformenShortsDispledMAN();


    }



}
