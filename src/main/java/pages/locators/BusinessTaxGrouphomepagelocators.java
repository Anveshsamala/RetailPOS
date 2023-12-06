package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BusinessTaxGrouphomepagelocators {

	@FindBy(how=How.XPATH, using="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')]")
	public WebElement clickonnewbtgbutton;
	
	@FindBy(how=How.NAME, using="code")
	public WebElement enterCode;
	
	@FindBy(how=How.NAME, using="name")
	public WebElement enterName;
	
	@FindBy(how=How.NAME, using="altName")
	public WebElement enterAltnam;
	
	@FindBy(how=How.NAME, using="externalReference")
	public WebElement enterExtref;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public WebElement clickonSavebutton_creationpage;
	
	@FindBy(how=How.XPATH, using="")
	public WebElement clickonCancelbutton;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]")
	public WebElement clickon_Viewicon;
	
	@FindBy(how=How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-75l2ci']")
	public WebElement clickon_Escape;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[3]")
	public WebElement clickon_Editicon;
	
	@FindBy(how=How.NAME, using="code")
	public WebElement updateCode;
	
	@FindBy(how=How.NAME, using="name")
	public WebElement updateName;
	
	@FindBy(how=How.NAME, using="altName")
	public WebElement updateAltnam;
	
	@FindBy(how=How.NAME, using="externalReference")
	public WebElement updateExtref;
		
	@FindBy(how=How.XPATH, using="(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[2]")
	public WebElement clickonSavebutton_updatepage;
	
	@FindBy(how=How.XPATH, using="(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[1]")
	public WebElement clickonCancelbutton_updatepage;
	
	@FindBy(how=How.XPATH, using="(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev')])[7]")
	public WebElement clickon_Deleteicon;
	
	@FindBy(how=How.XPATH, using="")
	public WebElement toggleStatus;
	
	@FindBy(how=How.XPATH, using="")
	public WebElement delete_popuppage_Cancelbutton;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Delete')]")
	public WebElement delete_popuppage_Deletebutton;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Delete')]")
	public WebElement delete_popuppage_CC_Deletebutton;
}
