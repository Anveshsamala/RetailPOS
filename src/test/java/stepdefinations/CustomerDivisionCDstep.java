package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerDivisionActions;
import pages.actions.CustomerListpageActions;

public class CustomerDivisionCDstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	CustomerDivisionActions customerDivisionActions=new CustomerDivisionActions();
	
	@When("user navigate to Customer Division page")
	public void user_navigate_to_customer_division_page() throws InterruptedException {
		customerListpageActions.clickonCustomerListlink();
		Thread.sleep(3000);
		customerListpageActions.clickonCustomerDivisionlink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Customer Division page")
	public void user_navigate_to_new_customer_division_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Customer Division")
	public void user_enters_all_the_details_customer_division(String cdcode, String cdname, String cdaltname, String cdextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(cdcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(cdname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(cdaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(cdextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Customer Division page")
	public void user_verify_the_view_functionality_in_customer_division_page() throws InterruptedException {
		customerDivisionActions.clickonViewicon();
		Thread.sleep(3000);
		customerDivisionActions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Customer Division page")
	public void user_verify_to_edit_the_customer_division_page(String cdcode1, String cdname1, String cdaltname1, String cdextref1) throws InterruptedException {
		customerDivisionActions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(cdcode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(cdname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(cdaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(cdextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Customer Division page")
	public void user_verify_the_delete_icon_functionality_in_customer_division_page() throws InterruptedException {
		customerDivisionActions.clickondeleteiconincustomerdivision();
		Thread.sleep(3000);   
	}

	@Then("user delete the record in customer Division")
	public void user_delete_the_record_in_customer_division() throws InterruptedException {
		customerDivisionActions.clickondeletebuttonincustomerdivision();
		  Thread.sleep(3000);
	}
}
