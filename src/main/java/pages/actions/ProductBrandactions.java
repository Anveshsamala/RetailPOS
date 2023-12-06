package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductBrandlocators;
import utilities.SeleniumDriver;

public class ProductBrandactions {
	
	ProductBrandlocators productBrandlocators=null;
	public ProductBrandactions()
	{
		this.productBrandlocators=new ProductBrandlocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productBrandlocators);
	}
	
	public void clickonViewicon()
	{
		productBrandlocators.clickon_Viewicon_productcategory.click();
	}
	
	public void clickonEscapeicon()
	{
		productBrandlocators.clickon_Escape_productcategory.click();
	}
	
	public void clickonEditicon()
	{
		productBrandlocators.clickon_Editicon_productcategory.click();
	}
	
	public void clickondeleteiconinproductbrand()
	{
		productBrandlocators.clickon_deleteicon_productcategory.click();
	}
	
	public void clickondeletebuttoninproductbrand()
	{
		productBrandlocators.clickon_delete_button_productcategory.click();
	}

}
