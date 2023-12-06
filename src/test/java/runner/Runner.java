package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		tags = "@Customergroup1",
		glue = {"stepdefinations"},
		plugin = {"html:target/cucumber-reports1/Customergroupreports.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{

}
 

