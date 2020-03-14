package main.test.RunnerClass;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import cucumber.api.CucumberOptions;



@RunWith(JUnit4.class)
@CucumberOptions(
		features= "/Study/PendingTasks/CucumberProject/src/main/Features/loginapp.feature" //the path of the feature files
		,glue= {"StepDefinations"},  //the path of the step defination files
		format= {"pretty", "html:test-output","json:json_output/cucumber.json","junit:junit.xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //Display the console output in proper/generate a readable format
		strict= true,  // It checks both feature file and step defination file steps are matching correctly  or not.
		dryRun=true  // Used to compare the Feature file steps and Step Defination files are matching or not.
					// if its missing, it shown in console results : Step Defination scripts are missing.
)
public class TestRunner {

}
