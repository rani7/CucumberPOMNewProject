/* 
 * To run the scenarios across multiple feature files in parallel mode
 * pom.xml-uncomment the 'configuration' section of the maven-surefire plugin and comment the maven-failsafe plugin section
 * Put all stepdefinition classes, hooks and test runner within the same folder "parallel"
 * Put all feature files within a folder "parallel"
 */

package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}, 
		monochrome = true,
		glue = { "parallel" },
		features = { "src/test/resources/parallel" }
)

public class ParallelRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}