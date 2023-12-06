package stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.SeleniumDriver;

public class AfterActions {

	@After
	public void tearDown(Scenario scenario) {
		WebDriver driver=SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			// Take a screenshot and attach it to the report
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "FailureScreenshot");
		}
		SeleniumDriver.tearDown();
	}


}
