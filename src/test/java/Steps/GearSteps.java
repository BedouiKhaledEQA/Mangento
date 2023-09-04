package Steps;

import com.Magento.Base;
import com.Magento.Pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GearSteps extends Base {
    GearPage gearPage;
    @And("Click on Gear button and click on Bags")
    public void Click_on_Gear_button_and_click_on_Bags(){
        gearPage=new GearPage();
        gearPage.CheckBags();

    }
    @Then("Bags should be appear")
    public void Bags_should_be_appear(){
        gearPage.BagsDisplayed();

    }


    @And("Click on Gear button and click on Fitness Equipment")
    public void Click_on_Gear_button_and_click_on_Fitness_Equipment(){
        gearPage=new GearPage();
        gearPage.CheckFitnessEquipement();

    }
    @Then("Fitness Equipment should be appear")
    public void Fitness_Equipment_should_be_appear(){
        gearPage.FitnessEquipementDisplayed();

    }


    @And("Click on Gear button and click on Watches")
    public void Click_on_Gear_button_and_click_on_Watches(){
        gearPage=new GearPage();
        gearPage.CheckWatches();

    }
    @Then("Watches should be appear")
    public void Watches_should_be_appear(){
        gearPage.WatchesDisplayed();

    }
}
