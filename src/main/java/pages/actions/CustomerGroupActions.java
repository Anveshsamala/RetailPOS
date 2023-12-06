package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CustomerGrouplocators;
import utilities.SeleniumDriver;

public class CustomerGroupActions {
	
	CustomerGrouplocators customerGrouplocators=null;
	public CustomerGroupActions()
	{
		this.customerGrouplocators=new CustomerGrouplocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), customerGrouplocators);
	}

	public void clickonViewicon()
	{
		customerGrouplocators.clickon_Viewicon_customergroup.click();
	}
	
	public void clickonEscapeicon()
	{
		customerGrouplocators.clickon_Escape_customergroup.click();
	}
	
	public void clickonEditicon()
	{
		customerGrouplocators.clickon_Editicon_customergroup.click();
	}
	
	public void clickondeleteiconincustomergroup()
	{
		customerGrouplocators.clickon_deleteicon_customergroup.click();
	}
	
	public void clickondeletebuttonincustomergroup()
	{
		customerGrouplocators.clickon_delete_button_customergroup.click();
	}
	
}
