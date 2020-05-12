package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {".//Features//Customers.Feature",".//Features//Login.Feature"},
        glue="stepDefinitions",
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:test-output"},
        tags= {"@Sanity,@Regression"}
)

public class TestRun {

}
