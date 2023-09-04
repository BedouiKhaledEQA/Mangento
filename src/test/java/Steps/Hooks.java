package Steps;

import com.Magento.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;

public class Hooks extends Base {
    @Before
    public void BeforeAllMethode(){
        System.out.println("**** STARTING TEST ****");

    }
    @After
    public void AfterAllMethode(Scenario sc) throws IOException {

        final byte[]
                screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(screenshot, "image/png", "image");
        driver.quit();
    }
}
