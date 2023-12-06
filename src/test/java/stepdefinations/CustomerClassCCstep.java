package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerClassActions;
import pages.actions.CustomerListpageActions;

public class CustomerClassCCstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	CustomerClassActions customerClassActions=new CustomerClassActions();

	@When("user navigate to Customer Class page")
	public void user_navigate_to_customer_class_page() throws InterruptedException {
		customerListpageActions.clickonCustomerListlink();
		Thread.sleep(3000);
		customerListpageActions.clickonCustomerClasslink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Customer Class page")
	public void user_navigate_to_new_customer_class_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();
		Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details")
	public void user_enters_all_the_details(String cccode, String ccname, String ccaltname, String ccextref) throws InterruptedException {
		businessTaxGrouphomepageActions.enterCodefield(cccode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(ccname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(ccaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(ccextref);
		Thread.sleep(3000);
	}

	@Then("click on Save and new record is created")
	public void click_on_save_and_new_record_is_created() throws InterruptedException {
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clickonSavebtn();
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Customer class page")
	public void user_verify_the_view_functionality_in_customer_class_page() throws InterruptedException {
		Thread.sleep(3000);
		customerClassActions.clickonViewicon();
		Thread.sleep(3000);
		customerClassActions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Customer class page")
	public void user_verify_to_edit_the_customer_class_page(String cccode1, String ccname1, String ccaltname1, String ccextref1) throws InterruptedException {
		Thread.sleep(3000);
		customerClassActions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(cccode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(ccname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(ccaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(ccextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@Then("user verify the Delete functionality in Customer class page")
	public void user_verify_the_delete_functionality_in_customer_class_page() throws InterruptedException {
		Thread.sleep(3000);
		customerClassActions.clickondeleteiconincustomerclass();
		Thread.sleep(3000);
	}
	
	@Then("user delete the record in customer class")
	public void user_delete_the_record_in_customer_class() throws InterruptedException {
		Thread.sleep(3000);
		customerClassActions.clickondeletebuttonincustomerclass();
	  Thread.sleep(3000);
	}

}
