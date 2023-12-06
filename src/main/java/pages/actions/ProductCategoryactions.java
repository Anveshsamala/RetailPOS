package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductCategorylocators;
import utilities.SeleniumDriver;

public class ProductCategoryactions {
	
	ProductCategorylocators productCategorylocators=null;
	
	public ProductCategoryactions()
	{
		this.productCategorylocators=new ProductCategorylocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productCategorylocators);
	}

	public void clickonViewicon()
	{
		productCategorylocators.clickon_Viewicon_productcategory.click();
	}
	
	public void clickonEscapeicon()
	{
		productCategorylocators.clickon_Escape_productcategory.click();
	}
	
	public void clickonEditicon()
	{
		productCategorylocators.clickon_Editicon_productcategory.click();
	}
	
	public void clickondeleteiconinproductcategory()
	{
		productCategorylocators.clickon_deleteicon_productcategory.click();
	}
	
	public void clickondeletebuttoninproductcategory()
	{
		productCategorylocators.clickon_delete_button_productcategory.click();
	}
	
}
