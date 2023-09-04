package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "Steps",plugin = {"pretty","html:target/Report.html","json:target/Report.json"},tags = "@Women1Jacket[TOP] or @Women1Jacket[TOP][DIRECTLY]")

public class TestRunner {
}