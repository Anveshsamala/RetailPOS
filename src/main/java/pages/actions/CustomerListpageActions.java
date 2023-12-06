package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CustomersListhomepageLocators;
import utilities.SeleniumDriver;

public class CustomerListpageActions {

	CustomersListhomepageLocators customersListhomepageLocators=null;
	
	public CustomerListpageActions()
	{
		this.customersListhomepageLocators=new CustomersListhomepageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), customersListhomepageLocators);
	}
		
	public void clickonTaxConfigurationlink()
	{
		customersListhomepageLocators.moveto_taxconfigurationlink.click();
	}
	
	public void clickonBusinessTaxGrouplink()
	{
		customersListhomepageLocators.moveto_businesstaxgrouplink.click();
	}
	
	public void clickonProductTaxGrouplink()
	{
		customersListhomepageLocators.moveto_producttaxgrouplink.click();
	}
	
	public void clickonCustomerListlink()
	{
		customersListhomepageLocators.moveto_customerlist_link.click();
	}
	
	public void clickonListlink()
	{
		customersListhomepageLocators.moveto_list_link.click();
	}
	 
	public void clickonCustomerClasslink()
	{
		customersListhomepageLocators.customerclasslink.click();
	}
	
	public void clickonCustomerGrouplink()
	{
		customersListhomepageLocators.customergrouplink.click();
	}
	
	public void clickonCustomerDivisionlink()
	{
		customersListhomepageLocators.customerdivisionlink.click();
	}
	
	public void clickonDistributionChannellink()
	{
		customersListhomepageLocators.distributionchannellink.click();
	}
	
	public void clickonTaxSetuplink()
	{
		customersListhomepageLocators.taxsetuplink.click();
	}
	
	public void clickonsettingslink()
	{
		customersListhomepageLocators.settingslink.click();
	}
	
	public void clickontranslationslink()
	{
		customersListhomepageLocators.translationlink.click();
	}
	
	public void clickonweblink()
	{
		customersListhomepageLocators.weblink.click();
	}
	
	public void clickonProctsmasterlink()
	{
		customersListhomepageLocators.product_Masterlink.click();
	}
	
	public void clickonProductCategorylink()
	{
		customersListhomepageLocators.product_categorylink.click();
	}
	
	public void clickonProductSubCategorylink()
	{
		customersListhomepageLocators.product_Sub_categorylink.click();
	}
	
	public void clickonProductPricelistlink()
	{
		customersListhomepageLocators.product_pricelistlink.click();
	}
	
	public void clickonProductGroupslink()
	{
		customersListhomepageLocators.product_Groupslink.click();
	}
	
	public void clickonProductDivisionslink()
	{
		customersListhomepageLocators.product_Divisionslink.click();
	}
	
	public void clickonProductBrandslink()
	{
		customersListhomepageLocators.product_Brandslink.click();
	}
	
	public void clickonProductsFamilylink()
	{
		customersListhomepageLocators.product_Familylink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//customer list new page
	
	public void enterfirstname(String first)
	{
		customersListhomepageLocators.firstname.sendKeys(first);
	}
	
	public void enterlastname(String last)
	{
		customersListhomepageLocators.lastname.sendKeys(last);
	}
	
	public void entermobilenumber(String mobinumber)
	{
		customersListhomepageLocators.mobile.sendKeys(mobinumber);
	}
	
	public void email(String mailid)
	{
		customersListhomepageLocators.email.sendKeys(mailid);
	}
	
	public void selectdob(String dateofbirth)
	{
		
	}
	
	public void selectcountry(String country)
	{
		customersListhomepageLocators.country.click();
		customersListhomepageLocators.country.sendKeys(country);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Saudi Arabia']")).click();
	}
	
	public void selectregion(String region)
	{
		customersListhomepageLocators.region.click();
		customersListhomepageLocators.region.sendKeys(region);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Riyadh']")).click();
	}
	
	public void selectcity(String city)
	{
		customersListhomepageLocators.city.click();
		customersListhomepageLocators.city.sendKeys(city);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Muhayil']")).click();
	}
	
	public void enterstreet(String street)
	{
		customersListhomepageLocators.street.sendKeys(street);
	}
	
	public void entertags(String tags)
	{
		customersListhomepageLocators.tags.sendKeys(tags);
	}
	
	public void clickonaddoption()
	{
		customersListhomepageLocators.addlink.click();
	}
	
	public void clickonadvance()
	{
		customersListhomepageLocators.edit_advanced_section.click();
	}
	
	public void entercustomercode(String custcode)
	{
		customersListhomepageLocators.customercode.sendKeys(custcode);
	}
	
	public void selectcustomertype(String custtype)
	{
		customersListhomepageLocators.customertype.click();
		customersListhomepageLocators.customertype.sendKeys(custtype);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Internal']")).click();
	}
	
	public void selectcustomergroup(String custgroup)
	{
		customersListhomepageLocators.customergroup.click();
		customersListhomepageLocators.customergroup.sendKeys(custgroup);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='test0000']")).click();
	}
	
	public void selectcustomerclass(String custclass)
	{
		customersListhomepageLocators.customerclass.click();
		customersListhomepageLocators.customerclass.sendKeys(custclass);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='11111']")).click();
	}
	
	public void selectdistributionchannel(String distchannel)
	{
		customersListhomepageLocators.distributionchannel.click();
		customersListhomepageLocators.distributionchannel.sendKeys(distchannel);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Hekmat']")).click();
	}
	
	public void selectcustomerdivision(String custdivision)
	{
		customersListhomepageLocators.customerdivision.click();
		customersListhomepageLocators.customerdivision.sendKeys(custdivision);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='test0000']")).click();
	}
	
	public void selectsalesman(String salesman)
	{
		customersListhomepageLocators.salesman.click();
		customersListhomepageLocators.salesman.sendKeys(salesman);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Yousef']")).click();
	}
	
	public void selectstatus(String status)
	{
		customersListhomepageLocators.status.click();
		customersListhomepageLocators.status.sendKeys(status);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Active']")).click();
	}
	
	public void clickonfinancialsection()
	{
		customersListhomepageLocators.edit_financial_section.click();
	}
	
	public void clickonProductTypelink()
	{
		customersListhomepageLocators.product_Type_link.click();
	}
	
	//edit customer list 
	
	public void clickonactionsoption()
	{
		customersListhomepageLocators.click_on_actions_option.click();
	}
	
	public void clickoneditoption()
	{
		customersListhomepageLocators.clickon_edit_icon_in_list.click();
	}
	
	public void editfirstname(String namefirst) throws InterruptedException
	{
		WebElement firname=  customersListhomepageLocators.edit_firstname;
		String first= Keys.chord(Keys.CONTROL, "a");
		firname.sendKeys(first);
		firname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_firstname.sendKeys(namefirst);
		Thread.sleep(3000);
	}
	
	public void editlastname(String namelast) throws InterruptedException
	{
		WebElement lasname=  customersListhomepageLocators.edit_lastname;
		String last= Keys.chord(Keys.CONTROL, "a");
		lasname.sendKeys(last);
		lasname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_lastname.sendKeys(namelast);
		Thread.sleep(3000);
	}
	
	public void editmobilenumber(String numbermobile) throws InterruptedException
	{
		WebElement mobnumber=  customersListhomepageLocators.edit_mobile;
		String mobi= Keys.chord(Keys.CONTROL, "a");
		mobnumber.sendKeys(mobi);
		mobnumber.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_mobile.sendKeys(numbermobile);
		Thread.sleep(3000);
	}
	
	public void editcountry(String countryname) throws InterruptedException
	{
		WebElement coun=customersListhomepageLocators.edit_country;
		String countryref= Keys.chord(Keys.CONTROL, "a");
		coun.sendKeys(countryref);
		coun.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_country.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//*[@role='option'][text()='Saudi Arabia']")).click();
		Thread.sleep(3000);
		System.out.println(countryname);
		//*[@role='option'][text()='Saudi Arabia']
	}
	
	public void editcustomercode(String custcode) throws InterruptedException
	{
		WebElement custcodeedit=  customersListhomepageLocators.edit_customercode;
		String codecust= Keys.chord(Keys.CONTROL, "a");
		custcodeedit.sendKeys(codecust);
		custcodeedit.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_customercode.sendKeys(custcode);
		Thread.sleep(3000);
	}
	
	public void editcustomertype(String custtype) throws InterruptedException
	{
		WebElement typecust=customersListhomepageLocators.edit_customertype;
		String type= Keys.chord(Keys.CONTROL, "a");
		typecust.sendKeys(type);
		typecust.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_customertype.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='External']")).click();
		Thread.sleep(3000);
		System.out.println(custtype);
	}
	
	public void editcustomergroup(String editgroup) throws InterruptedException
	{
		WebElement groupcust=customersListhomepageLocators.edit_customergroup;
		String group= Keys.chord(Keys.CONTROL, "a");
		groupcust.sendKeys(group);
		groupcust.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_customergroup.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='test0000']")).click();
		Thread.sleep(3000);
		System.out.println(editgroup);
	}
	public void editcustomerclass(String editclass) throws InterruptedException
	{
		WebElement classcust =customersListhomepageLocators.edit_customerclass;
		String clas=Keys.chord(Keys.CONTROL, "a");
		classcust.sendKeys(clas);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_customerclass.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='test000000']")).click();
		Thread.sleep(3000);
		System.out.println(editclass);
	}
	
	public void editdistributionchannel(String channel) throws InterruptedException
	{
		WebElement distchannel=customersListhomepageLocators.edit_distributionchannel;
		String discha= Keys.chord(Keys.CONTROL, "a");
		distchannel.sendKeys(discha);
		distchannel.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_distributionchannel.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[contains(text(),'Hekmat')]")).click();
		Thread.sleep(3000);
		System.out.println(channel);
	}
	
	public void editcustomerdivision(String division) throws InterruptedException
	{
		WebElement custdiv=customersListhomepageLocators.edit_customerdivision;
		String divi= Keys.chord(Keys.CONTROL, "a");
		custdiv.sendKeys(divi);
		custdiv.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_customerdivision.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//*[@role='option'][text()='test0000']")).click();
		Thread.sleep(3000);
		System.out.println(division);
	}
	
	public void editpaymentterms(String payment) throws InterruptedException
	{
		WebElement terms=customersListhomepageLocators.edit_paymentterms;
		String pay= Keys.chord(Keys.CONTROL, "a");
		terms.sendKeys(pay);
		terms.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_paymentterms.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[@role='option'][text()='withdraw']")).click();
		Thread.sleep(3000);
		System.out.println(payment);
	}
	
	public void edittaxtype(String payment) throws InterruptedException
	{
		WebElement terms=customersListhomepageLocators.edit_taxtype;
		String pay= Keys.chord(Keys.CONTROL, "a");
		terms.sendKeys(pay);
		terms.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_taxtype.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[@role='option'][text()='BASIC_TAX_GROUP']")).click();
		Thread.sleep(3000);
		System.out.println(payment);
	}
	
	public void editbasictaxgroup(String btgedit) throws InterruptedException
	{
		WebElement basic=customersListhomepageLocators.edit_basictaxgroup;
		String btg= Keys.chord(Keys.CONTROL, "a");
		basic.sendKeys(btg);
		basic.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_basictaxgroup.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[@role='option'] [text()='Tax 15 per exclusive']")).click();
		Thread.sleep(3000);
		System.out.println(btgedit);
	}
	
	
	
	public void editpricelist(String list) throws InterruptedException
	{
		WebElement pricel=customersListhomepageLocators.edit_pricelist;
		String pri= Keys.chord(Keys.CONTROL, "a");
		pricel.sendKeys(pri);
		pricel.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_pricelist.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[@role='option'][text()='pricelist-123']")).click();
		Thread.sleep(3000);
		System.out.println(list);
	}
	
	public void editcurrency(String currenc) throws InterruptedException
	{
		WebElement curr=customersListhomepageLocators.edit_currency;
		String editcurr= Keys.chord(Keys.CONTROL, "a");
		curr.sendKeys(editcurr);
		curr.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.edit_currency.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[@role='option'][text()='Saudi Riyal']")).click();
		Thread.sleep(3000);
		System.out.println(currenc);
	}
	
	public void editextref(String extref) throws InterruptedException
	{
		WebElement ext=  customersListhomepageLocators.editexternalreference;
		String ref= Keys.chord(Keys.CONTROL, "a");
		ext.sendKeys(ref);
		ext.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		customersListhomepageLocators.editexternalreference.sendKeys(extref);
		Thread.sleep(3000);
	}
	
	public void clickonsaveineditpage()
	{
		customersListhomepageLocators.savebutton_in_customerlist_edit_page.click();
	}
}
