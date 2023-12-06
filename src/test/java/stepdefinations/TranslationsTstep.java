package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.TranslationshomepageActions;

public class TranslationsTstep {
	
	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	TranslationshomepageActions translationshomepageActions=new TranslationshomepageActions();

	@When("user navigate to Translations page")
	public void user_navigate_to_translations_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonsettingslink();
		Thread.sleep(3000);
		customerListpageActions.clickontranslationslink();
		Thread.sleep(3000);
		customerListpageActions.clickonweblink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Translations page")
	public void user_navigate_to_new_translations_page() throws InterruptedException {
	    businessTaxGrouphomepageActions.clickonNewBTGbutton();
	    Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details in Translations")
	public void user_enters_all_the_details_in_translations(String lablename, String englishtranslation, String arabictranslation, String frenchtranslation) throws InterruptedException {
	    translationshomepageActions.enterlabelnamefld(lablename);
	    Thread.sleep(3000);
	    translationshomepageActions.enterenglishfld(englishtranslation);
	    Thread.sleep(3000);
	    translationshomepageActions.enterarabicfld(arabictranslation);
	    Thread.sleep(3000);
	    translationshomepageActions.enterfrenchfld(frenchtranslation);
	    Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Translations page")
	public void user_verify_the_view_functionality_in_translations_page() throws InterruptedException {
		translationshomepageActions.clickonViewicon();
	    Thread.sleep(2000);
	    translationshomepageActions.clickonEscapeicon();
	    Thread.sleep(2000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Translations page")
	public void user_verify_to_edit_the_translations_page(String lablename1, String englishtranslation1, String arabictranslation1, String frenchtranslation1) throws InterruptedException {
		translationshomepageActions.clickonEditicon();
	   Thread.sleep(3000);
	   translationshomepageActions.updatelabelnamefld(lablename1);
	   Thread.sleep(3000);
	   translationshomepageActions.updateenglishfld(englishtranslation1);
	   Thread.sleep(3000);
	   translationshomepageActions.updatearabicfld(arabictranslation1);
	   Thread.sleep(3000);
	   translationshomepageActions.enterfrenchfld(frenchtranslation1);
	   Thread.sleep(3000);
	   businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@When("user verify the Delete functionality in Translations page")
	public void user_verify_the_delete_functionality_in_translations_page() throws InterruptedException {
		translationshomepageActions.clickondeleteiconintranslation();
	    Thread.sleep(3000);
	}

	@Then("user delete the record in Translations")
	public void user_delete_the_record_in_translations() throws InterruptedException {
		translationshomepageActions.clickondeletebuttonintranslation();
		Thread.sleep(3000);
	}
	
}
