package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.TaxSetuplocators;
import utilities.SeleniumDriver;

public class TaxSetupactions {

	TaxSetuplocators taxSetuplocators=null;	
	public TaxSetupactions()
	{
		this.taxSetuplocators=new TaxSetuplocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), taxSetuplocators);
	}
	public void clickonViewicon()
	{
		taxSetuplocators.clickon_Viewicon_taxsetup.click();
	}
	
	public void clickonEscapeicon()
	{
		taxSetuplocators.clickon_Escape_taxsetup.click();
	}
	
	public void clickonEditicon()
	{
		taxSetuplocators.clickon_Editicon_taxsetup.click();
	}
	
	public void clickondeleteiconintaxsetup()
	{
		taxSetuplocators.clickon_deleteicon_taxsetup.click();
	}
	
	public void clickondeletebuttonintaxsetup()
	{
		taxSetuplocators.clickon_delete_button_taxsetup.click();
	}
}
