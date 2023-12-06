package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CustomerClasslocators;
import utilities.SeleniumDriver;

public class CustomerClassActions {
	
	CustomerClasslocators customerClasslocators=null;
	
	public CustomerClassActions()
	{
		this.customerClasslocators=new CustomerClasslocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), customerClasslocators);
	}
	
	public void clickonViewicon()
	{
		customerClasslocators.clickon_Viewicon_customerclass.click();
	}
	
	public void clickonEscapeicon()
	{
		customerClasslocators.clickon_Escape_customerclass.click();
	}
	
	public void clickonEditicon()
	{
		customerClasslocators.clickon_Editicon_customerclass.click();
	}
	
	public void clickondeleteiconincustomerclass()
	{
		customerClasslocators.clickon_deleteicon_customerclass.click();
	}
	
	public void clickondeletebuttonincustomerclass()
	{
		customerClasslocators.clickon_delete_button_customerclass.click();
	}

}
