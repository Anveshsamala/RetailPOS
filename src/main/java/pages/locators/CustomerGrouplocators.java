package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerGrouplocators {

	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]")
	public WebElement clickon_Viewicon_customergroup;
	
	@FindBy(how=How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-75l2ci']")
	public WebElement clickon_Escape_customergroup;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[3]")
	public WebElement clickon_Editicon_customergroup;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev'])[7]")
	public WebElement clickon_deleteicon_customergroup;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Delete')]")
	public WebElement clickon_delete_button_customergroup;
	
}
