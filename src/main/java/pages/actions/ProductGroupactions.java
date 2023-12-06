package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductGrouplocators;
import utilities.SeleniumDriver;

public class ProductGroupactions {
	
	ProductGrouplocators productGrouplocators =null;
	public ProductGroupactions()
	{
		this.productGrouplocators = new ProductGrouplocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productGrouplocators);
	}

	public void clickonViewicon()
	{
		productGrouplocators.clickon_Viewicon_productgroup.click();
	}
	
	public void clickonEscapeicon()
	{
		productGrouplocators.clickon_Escape_productgroup.click();
	}
	
	public void clickonEditicon()
	{
		productGrouplocators.clickon_Editicon_productgroup.click();
	}
	
	public void clickondeleteiconinproductgroup()
	{
		productGrouplocators.clickon_deleteicon_productgroup.click();
	}
	
	public void clickondeletebuttoninproductgroup()
	{
		productGrouplocators.clickon_delete_button_productgroup.click();
	}
	
}
