package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.runtime.model.CucumberScenario;

@RunWith(CucumberOptions.class)
@CucumberOptions(features= "Feature"  //the path of the feature files.
,glue= {"stepDefination"},  // the path of the step defination files 
format= {"pretty","html:test-output"},
monochrome= true, // display the console output in a proper reasonable format.
dryRun= false)
public class TestRunner {

	
	
}
