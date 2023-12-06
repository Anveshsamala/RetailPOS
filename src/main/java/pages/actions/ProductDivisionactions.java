package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductDivisionlocators;
import utilities.SeleniumDriver;

public class ProductDivisionactions {

	ProductDivisionlocators productDivisionlocators =null;
	public ProductDivisionactions()
	{
		this.productDivisionlocators =new ProductDivisionlocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productDivisionlocators);
	}
	
	public void clickonViewicon()
	{
		productDivisionlocators.clickon_Viewicon_productdivision.click();
	}
	
	public void clickonEscapeicon()
	{
		productDivisionlocators.clickon_Escape_productdivision.click();
	}
	
	public void clickonEditicon()
	{
		productDivisionlocators.clickon_Editicon_productdivision.click();
	}
	
	public void clickondeleteiconinproductdivisions()
	{
		productDivisionlocators.clickon_deleteicon_productdivision.click();
	}
	
	public void clickondeletebuttoninproductdivisions()
	{
		productDivisionlocators.clickon_delete_button_productdivision.click();
	}
}
