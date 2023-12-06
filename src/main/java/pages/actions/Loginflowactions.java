package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Loginflowlocators;
import utilities.SeleniumDriver;

public class Loginflowactions {
	
	Loginflowlocators loginflowlocators=null;

	public Loginflowactions()
	{
		this.loginflowlocators=new Loginflowlocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginflowlocators);
	}
	public void enterusername(String username) throws InterruptedException
	{
		loginflowlocators.Move_to_username_field.sendKeys(username);
		
//		WebElement editusername=loginflowlocators.Move_to_username_field;
//		String usname=Keys.chord(Keys.CONTROL, "a");
//		editusername.sendKeys(usname);
//		editusername.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(3000);
//		editusername.sendKeys(username);
//		Thread.sleep(3000);
		
		
	}
	
	public void enterpassword(String password) throws InterruptedException
	{
		loginflowlocators.Move_to_password_field.sendKeys(password);
		
//		WebElement editpassword = loginflowlocators.Move_to_password_field;
//		String passwrd= Keys.chord(Keys.CONTROL, "a");
//		editpassword.sendKeys(passwrd);
//		editpassword.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(3000);
//		editpassword.sendKeys(password);
//		Thread.sleep(3000);
	}
	
	public void clickonSigninButton()
	{
		loginflowlocators.Move_to_signin_button.click();
	}
}
