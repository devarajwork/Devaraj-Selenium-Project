package Runner;

import io.cucumber.testng.*;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "StepDefinition",
		"Hooks" }, tags = "@login", dryRun = false, plugin = { "pretty", "html:target/Demo.Report/LoginPage.html" })

public class TestRunner extends AbstractTestNGCucumberTests {

}
