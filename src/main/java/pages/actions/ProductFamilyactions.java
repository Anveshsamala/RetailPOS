package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductFamilylocators;
import utilities.SeleniumDriver;

public class ProductFamilyactions {
	
	ProductFamilylocators productFamilylocators=null;
	public ProductFamilyactions()
	{
		this.productFamilylocators=new ProductFamilylocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productFamilylocators);
	}

	public void clickonViewicon()
	{
		productFamilylocators.clickon_Viewicon_productfamily.click();
	}
	
	public void clickonEscapeicon()
	{
		productFamilylocators.clickon_Escape_productfamily.click();
	}
	
	public void clickonEditicon()
	{
		productFamilylocators.clickon_Editicon_productfamily.click();
	}
	
	public void clickondeleteiconinproductbrand()
	{
		productFamilylocators.clickon_deleteicon_productfamily.click();
	}
	
	public void clickondeletebuttoninproductbrand()
	{
		productFamilylocators.clickon_delete_button_productfamily.click();
	}
	
}
