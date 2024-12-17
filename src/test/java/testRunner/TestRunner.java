package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty",  "html:target/cucumber-reports/dsalgo.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/Cucumber.json"}, //reporting purpose
		monochrome=false,  //console output color
		tags="@Sanity", //tags from feature file
		features = {"src/test/resources/Feature files"}, //location of feature files
		glue= {"stepDefinitions","appHook"}) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    } 
}