package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"F:\\Eclipse-selenium\\workspace\\CucumberPOMNewProject\\src\\test\\resources\\features\\ContactUs.feature"},
		glue = {"stepDefinitions", "hooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"		
		},
		monochrome=true				
		)

public class RunTests {
	
}
