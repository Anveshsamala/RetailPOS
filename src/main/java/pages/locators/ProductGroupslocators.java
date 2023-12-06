package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductGroupslocators {

	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]")
	public WebElement clickon_Viewicon_productcategory;
	
	@FindBy(how=How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-75l2ci']")
	public WebElement clickon_Escape_productcategory;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[3]")
	public WebElement clickon_Editicon_productcategory;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev'])[8]")
	public WebElement clickon_deleteicon_productcategory;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Delete')]")
	public WebElement clickon_delete_button_productcategory;
}
