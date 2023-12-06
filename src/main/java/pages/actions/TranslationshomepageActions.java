package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Translationshomepagelocators;
import utilities.SeleniumDriver;

public class TranslationshomepageActions {

	Translationshomepagelocators translationshomepagelocators=null;
	
	public TranslationshomepageActions()
	{
		this.translationshomepagelocators=new Translationshomepagelocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), translationshomepagelocators);
	}
	
	public void enterlabelnamefld(String label)
	{
		translationshomepagelocators.translation_lablename.sendKeys(label);
	}
	
	public void enterenglishfld(String englishfld)
	{
		translationshomepagelocators.translation_englishfld.sendKeys(englishfld);
	}
	
	public void enterarabicfld(String arabicfld)
	{
		translationshomepagelocators.translation_arabicfld.sendKeys(arabicfld);
	}
	
	public void enterfrenchfld(String frenchfld)
	{
		translationshomepagelocators.translation_frenchfld.sendKeys(frenchfld);
	}
	
	public void updatelabelnamefld(String updatelabel) throws InterruptedException
	{
		WebElement labelupdate=  translationshomepagelocators.translation_update_lablename;
		String label= Keys.chord(Keys.CONTROL, "a");
		labelupdate.sendKeys(label);
		labelupdate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		labelupdate.sendKeys(updatelabel);
		Thread.sleep(3000);
	}
	
	public void updateenglishfld(String updateenglish) throws InterruptedException
	{
		WebElement englishupdate=  translationshomepagelocators.translation_update_englishfld;
		String english= Keys.chord(Keys.CONTROL, "a");
		englishupdate.sendKeys(english);
		englishupdate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		englishupdate.sendKeys(updateenglish);
		Thread.sleep(3000);
	}
	
	public void updatearabicfld(String updatearabic) throws InterruptedException
	{
		WebElement arabicupdate=  translationshomepagelocators.translation_update_arabicfld;
		String arabic= Keys.chord(Keys.CONTROL, "a");
		arabicupdate.sendKeys(arabic);
		arabicupdate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		arabicupdate.sendKeys(updatearabic);
		Thread.sleep(3000);
	}
	
	public void updatefrenchfld(String updatefrench) throws InterruptedException
	{
		WebElement frenchupdate=  translationshomepagelocators.translation_update_frenchfld;
		String french= Keys.chord(Keys.CONTROL, "a");
		frenchupdate.sendKeys(french);
		frenchupdate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		frenchupdate.sendKeys(updatefrench);
		Thread.sleep(3000);
	}
	
	public void clickonViewicon()
	{
		translationshomepagelocators.clickon_Viewicon_translation.click();
	}
	
	public void clickonEscapeicon()
	{
		translationshomepagelocators.clickon_Escape_translation.click();
	}
	
	public void clickonEditicon()
	{
		translationshomepagelocators.clickon_Editicon_translation.click();
	}
	
	public void clickondeleteiconintranslation()
	{
		translationshomepagelocators.clickon_deleteicon_translation.click();
	}
	
	public void clickondeletebuttonintranslation()
	{
		translationshomepagelocators.clickon_delete_button_translation.click();
	}
}
