package stepdefinations;

import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions {

	@Before
	public static void setUp()
	{
		SeleniumDriver.SetUPDriver();
	}
	
}
