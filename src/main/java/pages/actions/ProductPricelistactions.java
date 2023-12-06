package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductPricelistlocators;
import utilities.SeleniumDriver;

public class ProductPricelistactions {
	
	ProductPricelistlocators productPricelistlocators =null;
	public ProductPricelistactions()
	{
		this.productPricelistlocators = new ProductPricelistlocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productPricelistlocators);
	}

	public void clickonViewicon()
	{
		productPricelistlocators.clickon_Viewicon_productpricelist.click();
	}
	
	public void clickonEscapeicon()
	{
		productPricelistlocators.clickon_Escape_productpricelist.click();
	}
	
	public void clickonEditicon()
	{
		productPricelistlocators.clickon_Editicon_productpricelist.click();
	}
	
	public void clickondeleteiconinproductcategory()
	{
		productPricelistlocators.clickon_deleteicon_productpricelist.click();
	}
	
	public void clickondeletebuttoninproductcategory()
	{
		productPricelistlocators.clickon_delete_button_productpricelist.click();
	}
	
}
