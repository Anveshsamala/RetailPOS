package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.TaxSetuphomepagelocators;
import utilities.SeleniumDriver;

public class TaxSetuphomepageActions {

	TaxSetuphomepagelocators taxSetuphomepagelocators;

	public TaxSetuphomepageActions()
	{
		this.taxSetuphomepagelocators=new TaxSetuphomepagelocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), taxSetuphomepagelocators);
		
			}
	public void enterCodefield(String code)
	{
		taxSetuphomepagelocators.enterCode_in_taxsetup.sendKeys(code);
	}
	
	public void enterNamefield(String name)
	{
		taxSetuphomepagelocators.enterName_in_taxsetup.sendKeys(name);
	}
	
	public void enterAltnamefield(String altname)
	{
		taxSetuphomepagelocators.enterAltnam_in_taxsetup.sendKeys(altname);
	}
	
	public void selectTaxtypefromdropdown(String taxtype)
	{
		taxSetuphomepagelocators.taxtypedropdown_in_taxsetup.click();
		taxSetuphomepagelocators.taxtypedropdown_in_taxsetup.sendKeys(taxtype);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Input']")).click();
	}
	
	public void enterTaxpercent(String value)
	{
		taxSetuphomepagelocators.taxfield_in_taxsetup.sendKeys(value);
	}
	
	public void selectbtgdropdown(String btgtype)
	{
		taxSetuphomepagelocators.btgdropdown_in_taxsetup.click();
		taxSetuphomepagelocators.btgdropdown_in_taxsetup.sendKeys(btgtype);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='English55']")).click();
	}
	
	public void selectptgdropdown(String ptgtype) throws InterruptedException
	{
		taxSetuphomepagelocators.ptgdropdown_in_taxsetup.click();
		taxSetuphomepagelocators.ptgdropdown_in_taxsetup.sendKeys(ptgtype);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='English55']")).click();
		Thread.sleep(3000);
	}
	
	public void selectstartdatecalendar(String startdate)
	{
		taxSetuphomepagelocators.startdate_calendar_in_taxsetup.click();
		SeleniumDriver.getDriver().findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--keyboard-selected react-datepicker__day--today')]")).click();
		System.out.println(startdate);
		
	}
	
	public void selectenddatecalendar(String enddate)
	{
		taxSetuphomepagelocators.enddate_calendar_in_taxsetup.click();
		SeleniumDriver.getDriver().findElement(By.xpath("//div[contains(@aria-label, 'Choose Tuesday, October 10th, 2023')]")).click();
		System.out.println(enddate);
	}
	
	
	public void enterExtReffield(String extref)
	{
		taxSetuphomepagelocators.enterExtref_in_taxsetup.sendKeys(extref);
	}
	
	public void selectcheckboxtax()
	{
		taxSetuphomepagelocators.inclusive_exclusive_checkbox_in_taxsetup.click();
	}
	
	public void clickonsavebuttonincreationpage()
	{
		taxSetuphomepagelocators.clickonSavebutton_creationpage_in_taxsetup.click();
	}
	
	public void clickondeleteicon()
	{
		taxSetuphomepagelocators.delete_icon_in_taxsetup.click();
	}
	
	
	
	//edit flow
	
	public void editcode(String taxcode) throws InterruptedException
	{
		WebElement codetax=  taxSetuphomepagelocators.editCode_in_taxsetup;
		String code= Keys.chord(Keys.CONTROL, "a");
		codetax.sendKeys(code);
		codetax.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.editCode_in_taxsetup.sendKeys(taxcode);
		Thread.sleep(3000);
	}
	
	public void editname(String taxname) throws InterruptedException
	{
		WebElement nametax=taxSetuphomepagelocators.editName_in_taxsetup;
		String name= Keys.chord(Keys.CONTROL, "a");
		nametax.sendKeys(name);
		nametax.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.editName_in_taxsetup.sendKeys(taxname);
		Thread.sleep(3000);
	}
	
	public void editaltname(String taxaltname) throws InterruptedException
	{
		WebElement altnametax=  taxSetuphomepagelocators.editAltnam_in_taxsetup;
		String altname= Keys.chord(Keys.CONTROL, "a");
		altnametax.sendKeys(altname);
		altnametax.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.editName_in_taxsetup.sendKeys(taxaltname);
		Thread.sleep(3000);
	}
	
	public void edittaxtype(String taxtype) throws InterruptedException
	{
		WebElement taxinou=taxSetuphomepagelocators.edit_taxtypedropdown_in_taxsetup;
		String taxts= Keys.chord(Keys.CONTROL, "a");
		taxinou.sendKeys(taxts);
		taxinou.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='Output']")).click();
		Thread.sleep(3000);
		System.out.println(taxtype);
	}
	
	public void edittaxpercent(String taxpercent) throws InterruptedException
	{
		WebElement taxper=taxSetuphomepagelocators.edit_taxfield_in_taxsetup;
		String tx= Keys.chord(Keys.CONTROL, "a");
		taxper.sendKeys(tx);
		taxper.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.edit_taxfield_in_taxsetup.sendKeys(taxpercent);
		Thread.sleep(3000);
	}
	
	public void editbtg(String selectbtg) throws InterruptedException
	{
		WebElement bitagr=taxSetuphomepagelocators.edit_btgdropdown_in_taxsetup;
		String btg= Keys.chord(Keys.CONTROL, "a");
		bitagr.sendKeys(btg);
		bitagr.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.edit_btgdropdown_in_taxsetup.sendKeys(selectbtg);
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='English5566']")).click();
		Thread.sleep(3000);
	}
	
	public void editptg(String selectptg) throws InterruptedException
	{
		WebElement prtagr=taxSetuphomepagelocators.edit_ptgdropdown_in_taxsetup;
		String ptg= Keys.chord(Keys.CONTROL, "a");
		prtagr.sendKeys(ptg);
		prtagr.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		taxSetuphomepagelocators.edit_ptgdropdown_in_taxsetup.sendKeys(selectptg);
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//li[text()='test777']")).click();
		Thread.sleep(3000);
	}
	
	public void editstartdate(String startdat) throws InterruptedException
	{
		taxSetuphomepagelocators.edit_startdate_calendar_in_taxsetup.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//div[contains(@aria-label, 'Choose Thursday, October 19th, 2023')]")).click();
		Thread.sleep(3000);
		System.out.println(startdat);
	}
	
	public void editenddate(String enddat) throws InterruptedException
	{
		taxSetuphomepagelocators.edit_enddate_calendar_in_taxsetup.click();
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//div[contains(@aria-label, 'Choose Friday, October 20th, 2023')]")).click();
		Thread.sleep(3000);
		System.out.println(enddat);
	}
	
	public void editextref(String extref) throws InterruptedException
	{
		WebElement extre=taxSetuphomepagelocators.edit_enterExtref_in_taxsetup;
		String ref= Keys.chord(Keys.CONTROL, "a");
		extre.sendKeys(ref);
		extre.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		SeleniumDriver.getDriver().findElement(By.xpath("//input[contains(@placeholder,'External reference')]")).sendKeys(extref);
		Thread.sleep(3000);
	}
	
	public void clickonsaveineditpage() throws InterruptedException
	{
		taxSetuphomepagelocators.clickonSavebutton_creationpage_in_taxsetup.click();
		Thread.sleep(3000);
	}
	
	public void clickonediticon()
	{
		taxSetuphomepagelocators.edit_icon_in_taxsetup.click();
	}
}
