package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TaxSetuphomepagelocators {

	@FindBy(how=How.NAME, using="code")
	public WebElement enterCode_in_taxsetup;
	
	@FindBy(how=How.NAME, using="name")
	public WebElement enterName_in_taxsetup;
	
	@FindBy(how=How.NAME, using="altName")
	public WebElement enterAltnam_in_taxsetup;
	
	//tax type drop down
	@FindBy(how=How.XPATH, using="//input[@placeholder='select type']")
	public WebElement taxtypedropdown_in_taxsetup;
		
	//tax field
	@FindBy(how=How.XPATH, using="//input[@placeholder='Tax']")
	public WebElement taxfield_in_taxsetup;
		
	//BTG drop down 
	@FindBy(how=How.XPATH, using="(//input[@placeholder='select group'])[1]")
	public WebElement btgdropdown_in_taxsetup;
		
	//PTG drop down 
	@FindBy(how=How.XPATH, using="(//input[@placeholder='select group'])[2]")
	public WebElement ptgdropdown_in_taxsetup;
	
	//start date
	@FindBy(how=How.XPATH, using="(//input[@placeholder='Click to select a date'])[1]")
	public WebElement startdate_calendar_in_taxsetup;
	
		//end date
	@FindBy(how=How.XPATH, using="(//input[@placeholder='Click to select a date'])[2]")
	public WebElement enddate_calendar_in_taxsetup;
	
	//external reference field
	@FindBy(how=How.NAME, using="externalReference")
	public WebElement enterExtref_in_taxsetup;
	
	//inclusive/exclusive check box
	@FindBy(how=How.XPATH, using="//p[text()='Exclusive']")
	public WebElement inclusive_exclusive_checkbox_in_taxsetup;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public WebElement clickonSavebutton_creationpage_in_taxsetup; 
	
	//delete icon
	@FindBy(how=How.XPATH, using="(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev')])[14]")
	public WebElement delete_icon_in_taxsetup;
	//(//button[@aria-label='Delete'])[1]
	//(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev'])[11]
	//(//*[local-name()='svg' and @aria-hidden='true'])[63]
	//(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev')])[14]
	
	
	//edit flow
	@FindBy(how=How.NAME, using="code")
	public WebElement editCode_in_taxsetup;
	
	@FindBy(how=How.NAME, using="name")
	public WebElement editName_in_taxsetup;
	
	@FindBy(how=How.NAME, using="altName")
	public WebElement editAltnam_in_taxsetup;
	
	//tax type drop down
	@FindBy(how=How.XPATH, using="//input[@placeholder='select type']")
	public WebElement edit_taxtypedropdown_in_taxsetup;
		
	//tax field
	@FindBy(how=How.XPATH, using="//input[@placeholder='Tax']")
	public WebElement edit_taxfield_in_taxsetup;
		
	//BTG drop down 
	@FindBy(how=How.XPATH, using="(//input[@placeholder='select group'])[1]")
	public WebElement edit_btgdropdown_in_taxsetup;
		
	//PTG drop down 
	@FindBy(how=How.XPATH, using="(//input[@placeholder='select group'])[2]")
	public WebElement edit_ptgdropdown_in_taxsetup;
	
	//start date
	@FindBy(how=How.XPATH, using="(//input[@placeholder='Click to select a date'])[1]")
	public WebElement edit_startdate_calendar_in_taxsetup;
	
		//end date
	@FindBy(how=How.XPATH, using="(//input[@placeholder='Click to select a date'])[2]")
	public WebElement edit_enddate_calendar_in_taxsetup;
	
	//external reference field
	@FindBy(how=How.NAME, using="externalReference")
	public WebElement edit_enterExtref_in_taxsetup;
	
	//edit icon
	@FindBy(how=How.XPATH, using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]")
	public WebElement edit_icon_in_taxsetup;
	
	//(//button[@aria-label='Edit'])[1]
	//(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[2]
}
