package apphooks;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.TestContextSetup;

public class Hooks {
TestContextSetup testContextSetup;	

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	/*@Before
	public void openBrowser() throws InterruptedException, IOException {
		
		testContextSetup.pageObjectManager.getMainLoginPage().driver.LoginuserPass(testContextSetup.testBase.prop.getProperty("username"), 
				testContextSetup.testBase.prop.getProperty("password"));
		
	}*/
	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.WebDriverManager().quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver =testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			//screenshot
			File sourcepath= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent =FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
