package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Sham\\Desktop\\Conflictissue\\OrangeHRMConflict\\src\\test\\java\\Feature\\TC_001_OrangeConflict.feature",
		glue = "Steps",
		dryRun= true,
		monochrome= true
		
		
		
		)


public class RunnerTest {

}
