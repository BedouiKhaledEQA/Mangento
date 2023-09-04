package Steps;

import com.Magento.Base;
import com.Magento.Pages.GetTitleArticlePage;
import io.cucumber.java.en.Then;

public class GetTileArticleSteps extends Base {
    GetTitleArticlePage getTitleArticlePage;
    @Then("All article title should be Displayed")
    public void All_article_title_should_be_Displayed(){
        getTitleArticlePage=new GetTitleArticlePage();
        getTitleArticlePage.GETTITLE();

    }

}
