package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Translationshomepagelocators {

	
	@FindBy(how=How.NAME, using="name")
	public WebElement translation_lablename;
	
	@FindBy(how=How.NAME, using="nameLang.en_US")
	public WebElement translation_englishfld;
	
	@FindBy(how=How.NAME, using="nameLang.ar_SA")
	public WebElement translation_arabicfld;
	
	@FindBy(how=How.NAME, using="nameLang.fr_FR")
	public WebElement translation_frenchfld;

	@FindBy(how=How.NAME, using="name")
	public WebElement translation_update_lablename;
	
	@FindBy(how=How.NAME, using="nameLang.en_US")
	public WebElement translation_update_englishfld;
	
	@FindBy(how=How.NAME, using="nameLang.ar_SA")
	public WebElement translation_update_arabicfld;
	
	@FindBy(how=How.NAME, using="nameLang.fr_FR")
	public WebElement translation_update_frenchfld;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]")
	public WebElement clickon_Viewicon_translation;
	
	@FindBy(how=How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-75l2ci']")
	public WebElement clickon_Escape_translation;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[3]")
	public WebElement clickon_Editicon_translation;
	
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev'])[5]")
	public WebElement clickon_deleteicon_translation;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Delete')]")
	public WebElement clickon_delete_button_translation;
}

