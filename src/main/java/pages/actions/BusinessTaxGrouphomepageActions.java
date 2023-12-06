package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessTaxGrouphomepagelocators;
import utilities.SeleniumDriver;

public class BusinessTaxGrouphomepageActions {

	BusinessTaxGrouphomepagelocators businessTaxGrouphomepagelocators=null;
	
	public BusinessTaxGrouphomepageActions()
	{
		this.businessTaxGrouphomepagelocators=new BusinessTaxGrouphomepagelocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessTaxGrouphomepagelocators);
	}
	
	public void clickonNewBTGbutton()
	{
		businessTaxGrouphomepagelocators.clickonnewbtgbutton.click();
	}
	
	public void enterCodefield(String code)
	{
		businessTaxGrouphomepagelocators.enterCode.sendKeys(code);
	}
	
	public void enterNamefield(String name)
	{
		businessTaxGrouphomepagelocators.enterName.sendKeys(name);
	}
	
	public void enterAltnamefield(String altname)
	{
		businessTaxGrouphomepagelocators.enterAltnam.sendKeys(altname);
	}
	
	public void enterExtReffield(String extref)
	{
		businessTaxGrouphomepagelocators.enterExtref.sendKeys(extref);
	}
	
	public void clickonSavebtn()
	{
		businessTaxGrouphomepagelocators.clickonSavebutton_creationpage.click();
	}
	
	public void clickonViewicon()
	{
		businessTaxGrouphomepagelocators.clickon_Viewicon.click();
	}
	
	public void clickonEscape()
	{
		businessTaxGrouphomepagelocators.clickon_Escape.sendKeys(Keys.ESCAPE);
	}
	
	public void clickonEditicon()
	{
		businessTaxGrouphomepagelocators.clickon_Editicon.click();
	}
	
	public void updateCode(String codeUpdate) throws InterruptedException
	{
		WebElement updatecode = businessTaxGrouphomepagelocators.updateCode;
		String code= Keys.chord(Keys.CONTROL, "a");
		updatecode.sendKeys(code);
		updatecode.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		updatecode.sendKeys(codeUpdate);
		Thread.sleep(3000);
	}
	
	public void updateName(String nameUpdate) throws InterruptedException
	{
		WebElement updatename = businessTaxGrouphomepagelocators.updateName;
		String name= Keys.chord(Keys.CONTROL, "a");
		updatename.sendKeys(name);
		updatename.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		updatename.sendKeys(nameUpdate);
		Thread.sleep(3000);
	}
	
	public void updateAltname(String altnameUpdate) throws InterruptedException
	{
		WebElement updatealtname = businessTaxGrouphomepagelocators.updateAltnam;
		String altname= Keys.chord(Keys.CONTROL, "a");
		updatealtname.sendKeys(altname);
		updatealtname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		updatealtname.sendKeys(altnameUpdate);
		Thread.sleep(3000);
	}
	
	public void updateExtref(String extrefUpdate) throws InterruptedException
	{
		WebElement updateextref = businessTaxGrouphomepagelocators.updateExtref;
		String extref= Keys.chord(Keys.CONTROL, "a");
		updateextref.sendKeys(extref);
		updateextref.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		updateextref.sendKeys(extrefUpdate);
		Thread.sleep(3000);
	}
	
	public void clcickonsavebuttoninupdatepage()
	{
		businessTaxGrouphomepagelocators.clickonSavebutton_updatepage.click();
	}
	
	public void clickonDeleteicon()
	{
		businessTaxGrouphomepagelocators.clickon_Deleteicon.click();
	}
	//btg
	public void clickonDeletebuttonin_Deletepopuppage()
	{
		businessTaxGrouphomepagelocators.delete_popuppage_Deletebutton.click();
	}
	//customer class 
	public void clickonDeletebutton_in_CC_Deletepopuppage()
	{
		businessTaxGrouphomepagelocators.delete_popuppage_CC_Deletebutton.click();
	}
}
