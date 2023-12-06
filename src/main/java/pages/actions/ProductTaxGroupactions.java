package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductTaxGrouplocators;
import utilities.SeleniumDriver;

public class ProductTaxGroupactions {

	ProductTaxGrouplocators ProductTaxGrouplocators=null;
	public ProductTaxGroupactions()
	{
		this.ProductTaxGrouplocators=new ProductTaxGrouplocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ProductTaxGrouplocators);
	}
	
	public void clickonViewicon()
	{
		ProductTaxGrouplocators.clickon_Viewicon_producttaxgroup.click();
	}
	
	public void clickonEscapeicon()
	{
		ProductTaxGrouplocators.clickon_Escape_producttaxgroup.click();
	}
	
	public void clickonEditicon()
	{
		ProductTaxGrouplocators.clickon_Editicon_producttaxgroup.click();
	}
	
	public void clickondeleteiconinproducttaxgroup()
	{
		ProductTaxGrouplocators.clickon_deleteicon_producttaxgroup.click();
	}
	
	public void clickondeletebuttoninproducttaxgroup()
	{
		ProductTaxGrouplocators.clickon_delete_button_producttaxgroup.click();
	}
	
}
