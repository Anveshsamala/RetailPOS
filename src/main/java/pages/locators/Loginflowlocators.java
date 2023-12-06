package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginflowlocators {

	@FindBy(how=How.NAME,using="userName")
	public WebElement Move_to_username_field;
	
	@FindBy(how=How.NAME,using="password")
	public WebElement Move_to_password_field;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	public WebElement Move_to_signin_button;
	
	
}
