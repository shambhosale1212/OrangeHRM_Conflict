package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\user\\git\\OrangeHRM_Conflict\\src\\test\\java\\Feature",
		glue = "Steps",
		dryRun= false,
		monochrome= true
		
		
		
		)


public class RunnerTest {

}
