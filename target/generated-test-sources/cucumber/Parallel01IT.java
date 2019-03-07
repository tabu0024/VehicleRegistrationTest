import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Applications/Development/CarRegistrationVerification/src/test/resources/featureFiles/vehicleRegistrationSearch.feature:9"},
        plugin = {"json:/Applications/Development/CarRegistrationVerification/target/json-reports/1.json"},
        monochrome = false,
        glue = {"stepDefinition.Hooks", "webDriver", "stepDefinitions"})
public class Parallel01IT {
}
