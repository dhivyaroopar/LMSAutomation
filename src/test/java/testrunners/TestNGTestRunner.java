package testrunners;

/*
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//dryrun will see mapping between feature file and step definition
//html, xml, json, junit, extent
@CucumberOptions(features={"src/test/resources/features"}, glue={"stepdefinitions","apphooks"},
monochrome=true, dryRun=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}*/



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	  plugin = {"pretty", "html:target/cucumber.html"},
	  features = "src/test/resources/features/03LoginPageFieldVavidation", 
	  glue= {"stepdefinitions","apphooks"},monochrome=true)

public class TestNGTestRunner {
	
 
}