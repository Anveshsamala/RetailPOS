package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductSubCategorylocators;
import utilities.SeleniumDriver;

public class ProductSubCategoryactions {

	
	ProductSubCategorylocators productSubCategorylocators=null;
	public ProductSubCategoryactions()
	{
		this.productSubCategorylocators=new ProductSubCategorylocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productSubCategorylocators);
	}
	public void clickonViewicon()
	{
		productSubCategorylocators.clickon_Viewicon_productsubcategory.click();
	}
	
	public void clickonEscapeicon()
	{
		productSubCategorylocators.clickon_Escape_productsubcategory.click();
	}
	
	public void clickonEditicon()
	{
		productSubCategorylocators.clickon_Editicon_productsubcategory.click();
	}
	
	public void clickondeleteiconinproductsubcategory()
	{
		productSubCategorylocators.clickon_deleteicon_productsubcategory.click();
	}
	
	public void clickondeletebuttoninproductsubcategory()
	{
		productSubCategorylocators.clickon_delete_button_productsubcategory.click();
	}
}
