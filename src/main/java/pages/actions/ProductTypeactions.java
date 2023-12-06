package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductTypelocators;
import utilities.SeleniumDriver;

public class ProductTypeactions {

	ProductTypelocators productTypelocators=null;
	public ProductTypeactions()
	{
		this.productTypelocators=new ProductTypelocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productTypelocators);
	}
	
	public void clickonViewicon()
	{
		productTypelocators.clickon_Viewicon_producttype.click();
	}
	
	public void clickonEscapeicon()
	{
		productTypelocators.clickon_Escape_producttype.click();
	}
	
	public void clickonEditicon()
	{
		productTypelocators.clickon_Editicon_producttype.click();
	}
	
	public void clickondeleteiconinproducttype()
	{
		productTypelocators.clickon_deleteicon_producttype.click();
	}
	
	public void clickondeletebuttoninproducttype()
	{
		productTypelocators.clickon_delete_button_producttype.click();
	}
}
