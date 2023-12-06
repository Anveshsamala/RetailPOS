package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomersListhomepageLocators {

	@FindBy(how=How.XPATH,using="//p[text()='Tax Configuration']")
	public WebElement moveto_taxconfigurationlink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Tax Group')]")
	public WebElement moveto_businesstaxgrouplink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Tax Group')]")
	public WebElement moveto_producttaxgrouplink; 
	
	@FindBy(how=How.XPATH,using="(//p[text()='Customers'])[1]")
	public WebElement moveto_customerlist_link; 
	
	@FindBy(how=How.XPATH,using="(//p[text()='Customers'])[2]")
	public WebElement moveto_list_link;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Classes')]")
	public WebElement customerclasslink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Groups')]")
	public WebElement customergrouplink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Divisions')]")
	public WebElement customerdivisionlink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Distribution Channels')]")
	public WebElement distributionchannellink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Tax Set Up')]")
	public WebElement taxsetuplink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Settings')]")
	public WebElement settingslink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Translations')]")
	public WebElement translationlink;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Web')]")
	public WebElement weblink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Products')]")
	public WebElement product_Masterlink; 
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Product Type')]")
	public WebElement product_Type_link; 
	
	@FindBy(how=How.XPATH,using="//p[text()='Category']")
	public WebElement product_categorylink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Sub- Category']")
	public WebElement product_Sub_categorylink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Price List']")
	public WebElement product_pricelistlink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Groups']")
	public WebElement product_Groupslink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Divisions']")
	public WebElement product_Divisionslink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Brands']")
	public WebElement product_Brandslink;
	
	@FindBy(how=How.XPATH,using="//p[text()='Family']")
	public WebElement product_Familylink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Customer list Creation page elements
	
	//firstname
	@FindBy(how=How.ID,using=":r7s:")
	public WebElement firstname; 
	
	//lastname
	@FindBy(how=How.ID,using=":r7t:")
	public WebElement lastname; 
	
	//mobile
	@FindBy(how=How.ID,using=":r7u:")
	public WebElement mobile; 
	
	//email
	@FindBy(how=How.ID,using=":r7v:")
	public WebElement email; 
	
	//dob
	@FindBy(how=How.ID,using="basic-input")
	public WebElement dob; 
	
	//select country
	@FindBy(how=How.ID,using=":r81:")
	public WebElement country; 
	
	//select region
	@FindBy(how=How.ID,using=":r83:")
	public WebElement region; 
	
	//select city
	@FindBy(how=How.ID,using=":r85:")
	public WebElement city; 
			
	//Street
	@FindBy(how=How.ID,using=":r89:")
	public WebElement street; 
	
	//tags
	@FindBy(how=How.ID,using="tags-filled")
	public WebElement tags;
	
	//add link
	@FindBy(how=How.XPATH,using="//span[text()='ADD']")
	public WebElement addlink;
	
	//advance section link
	@FindBy(how=How.XPATH,using="(//button[@role='tab'])[2]")
	public WebElement advanced_section;
	//(//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-12x19yy'])[1]
	
	//customer code
	@FindBy(how=How.ID,using=":r6g:")
	public WebElement customercode;
	
	//customer type
	@FindBy(how=How.ID,using=":r6h:")
	public WebElement customertype;
	
	//customer group
	@FindBy(how=How.ID,using=":r6j:")
	public WebElement customergroup;
	
	//customer class
	@FindBy(how=How.ID,using=":r6l:")
	public WebElement customerclass;
	
	//distribution channel
	@FindBy(how=How.ID,using=":r6n:")
	public WebElement distributionchannel;
	
	//customer division
	@FindBy(how=How.ID,using=":r6p:")
	public WebElement customerdivision;
	
	//salesman
	@FindBy(how=How.ID,using=":r6u:")
	public WebElement salesman;
	
	//status
	@FindBy(how=How.ID,using=":r70:")
	public WebElement status;
	
	//finance section link
	@FindBy(how=How.XPATH,using="(//button[@role='tab'])[3]")
	public WebElement financial_section;
	
	//tax number
	@FindBy(how=How.ID,using=":r72:")
	public WebElement taxnumber;
	
	//business tax group
	@FindBy(how=How.ID,using=":r73:")
	public WebElement businesstaxgroup;
	
	//payment terms
	@FindBy(how=How.ID,using=":r75:")
	public WebElement paymentterms;
	
	//credit limit
	@FindBy(how=How.ID,using=":r77:")
	public WebElement creditlimit;
	
	//price list
	@FindBy(how=How.ID,using=":r78:")
	public WebElement pricelist;
	
	//customer balance
	@FindBy(how=How.ID,using=":r7a:")
	public WebElement customerbalance;
	
	//currency
	@FindBy(how=How.ID,using=":r7b:")
	public WebElement currency;
	
	//external reference
	@FindBy(how=How.ID,using=":r7d:")
	public WebElement externalreference;
	
	//save button
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	public WebElement savebutton_in_customerlist_new_page;
	
	//cancel button
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[44]")
	public WebElement cancelbutton_in_customerlist_new_page;
	
	
	
	//Customer List edit flow
	
	@FindBy(how=How.XPATH,using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-eu6vv9'])[3]")
	public WebElement clickon_edit_icon_in_list;
	
	//firstname
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'First Name')]")
		public WebElement edit_firstname; 
		
		//lastname
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Last Name')]")
		public WebElement edit_lastname; 
		
		//mobile
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Enter Mobile Number')]")
		public WebElement edit_mobile; 
	
		
		//select country
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Select Country')]")
		public WebElement edit_country; 
		
		//advance section link
		@FindBy(how=How.XPATH,using="(//button[@role='tab'])[2]")
		public WebElement edit_advanced_section;
		//(//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-12x19yy'])[1]
		
		
		//customer code
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'123456')]")
		public WebElement edit_customercode;
		
		//customer type
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Customer Type')]")
		public WebElement edit_customertype;
		
		//customer group
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Groups')]")
		public WebElement edit_customergroup;
		
		//customer class
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Classes')]")
		public WebElement edit_customerclass;
		
		//distribution channel
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Distribution Channels')]")
		public WebElement edit_distributionchannel;
		
		//customer division
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Divisions')]")
		public WebElement edit_customerdivision;
		
		//finance section link
		@FindBy(how=How.XPATH,using="(//button[@role='tab'])[3]")
		public WebElement edit_financial_section;
	
		
		
		//payment terms
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Payment Terms')]")
		public WebElement edit_paymentterms;
		
		//tax type
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Tax Type')]")
		public WebElement edit_taxtype;
		
		//basic tax group
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Basic Tax Group')]")
		public WebElement edit_basictaxgroup;
		
		//price list
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Price List')]")
		public WebElement edit_pricelist;
		
		//currency
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Currency')]")
		public WebElement edit_currency;
		
		//external reference
		@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'External Reference')]")
		public WebElement editexternalreference;
		
		//click on action option
		@FindBy(how=How.XPATH,using="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1ntupev'])[8]")
		public WebElement click_on_actions_option;
	
		//click on edit option
		@FindBy(how=How.XPATH,using="(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1jbd4ld'])[1]")
		public WebElement click_on_edit_option;
		
		//save button edit page
		@FindBy(how=How.XPATH,using="//button[@type='submit']")
		public WebElement savebutton_in_customerlist_edit_page;
		
		//cancel button edit page
		@FindBy(how=How.XPATH,using="(//button[@type='button'])[44]")
		public WebElement cancelbutton_in_customerlist_edit_page;
		
	
	
	
	
	
	
	
	
	
	
	
}
