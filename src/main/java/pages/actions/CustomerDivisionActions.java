package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CustomerDivisionlocators;
import utilities.SeleniumDriver;

public class CustomerDivisionActions {
	
	CustomerDivisionlocators customerDivisionlocators=null;
	
	public CustomerDivisionActions()
	{
		this.customerDivisionlocators=new CustomerDivisionlocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), customerDivisionlocators);
	}

	public void clickonViewicon()
	{
		customerDivisionlocators.clickon_Viewicon_customerdivision.click();
	}
	
	public void clickonEscapeicon()
	{
		customerDivisionlocators.clickon_Escape_customerdivision.click();
	}
	
	public void clickonEditicon()
	{
		customerDivisionlocators.clickon_Editicon_customerdivision.click();
	}
	
	public void clickondeleteiconincustomerdivision()
	{
		customerDivisionlocators.clickon_deleteicon_customerdivision.click();
	}
	
	public void clickondeletebuttonincustomerdivision()
	{
		customerDivisionlocators.clickon_delete_button_customerdivision.click();
	}
	
}
