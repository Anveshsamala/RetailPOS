package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.TaxSetupactions;
import pages.actions.TaxSetuphomepageActions;

public class TaxSetupTSstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	TaxSetuphomepageActions taxSetuphomepageActions =new  TaxSetuphomepageActions();
	TaxSetupactions taxSetupactions=new TaxSetupactions();
	@When("user navigate to Tax Setup page")
	public void user_navigate_to_tax_setup_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonTaxConfigurationlink();
		Thread.sleep(3000);
		customerListpageActions.clickonTaxSetuplink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Tax Setup page")
	public void user_navigate_to_new_tax_setup_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}  all the details Tax Setup")
	public void user_enters_all_the_details_tax_setup(String tcode, String tname, String taltname, String ttaxtype, String ttax, String tBTG, String tPTG, String tstartdate, String tenddate, String textref) throws InterruptedException {
		Thread.sleep(3000);
		taxSetuphomepageActions.enterCodefield(tcode);
		Thread.sleep(3000);
		taxSetuphomepageActions.enterNamefield(tname);
		Thread.sleep(3000);
		taxSetuphomepageActions.enterAltnamefield(taltname);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectTaxtypefromdropdown(ttaxtype);
		Thread.sleep(3000);
		taxSetuphomepageActions.enterTaxpercent(ttax);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectbtgdropdown(tBTG);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectptgdropdown(tPTG);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectstartdatecalendar(tstartdate);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectenddatecalendar(tenddate);
		Thread.sleep(3000);
		taxSetuphomepageActions.enterExtReffield(textref);
		Thread.sleep(3000);
		taxSetuphomepageActions.selectcheckboxtax();
		Thread.sleep(3000);

	}

	@Then("user verify the view functionality in Tax Setup page")
	public void user_verify_the_view_functionality_in_tax_setup_page() throws InterruptedException {
		taxSetupactions.clickonViewicon();
		Thread.sleep(3000);
		taxSetupactions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} Tax Setup page")
	public void user_verify_to_edit_the_tax_setup_page(String tcode1, String tname1, String taltname1, String ttaxtype1, String ttax1, String tBTG1, String tPTG1, String tstartdate1, String tenddate1, String textref1) throws InterruptedException {
		Thread.sleep(7000);
		taxSetupactions.clickonEditicon();
		Thread.sleep(3000);
		taxSetuphomepageActions.editcode(tcode1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editname(tname1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editaltname(taltname1);
		Thread.sleep(3000);
		taxSetuphomepageActions.edittaxtype(ttaxtype1);
		Thread.sleep(3000);
		taxSetuphomepageActions.edittaxpercent(ttax1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editbtg(tBTG1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editptg(tPTG1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editstartdate(tstartdate1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editenddate(tenddate1);
		Thread.sleep(3000);
		taxSetuphomepageActions.editextref(textref1);
		Thread.sleep(3000);
		taxSetuphomepageActions.clickonsaveineditpage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Tax Setup page")
	public void user_verify_the_delete_icon_functionality_in_tax_setup_page() throws InterruptedException {
		Thread.sleep(3000);
		taxSetupactions.clickondeleteiconintaxsetup();
		Thread.sleep(3000);
	}

	@Then("user delete the record in Tax Setup")
	public void user_delete_the_record_in_tax_setup() throws InterruptedException {
		taxSetupactions.clickondeletebuttonintaxsetup();
		Thread.sleep(3000);
	}

}
