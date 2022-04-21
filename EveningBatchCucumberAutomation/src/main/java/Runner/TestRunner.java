package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\usrin\\eclipse-workspace\\EveningBatchCucumberAutomation\\src\\main\\java\\Features\\Login.feature",
		glue= {"StepDefinitions"}
		)

public class TestRunner {

}
