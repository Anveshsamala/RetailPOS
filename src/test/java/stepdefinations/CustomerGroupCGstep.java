package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerGroupActions;
import pages.actions.CustomerListpageActions;

public class CustomerGroupCGstep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	CustomerGroupActions customerGroupActions=new CustomerGroupActions();
	
	@When("user navigate to Customer Group page")
	public void user_navigate_to_customer_group_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonCustomerListlink();
		Thread.sleep(3000);
		customerListpageActions.clickonCustomerGrouplink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Customer group page")
	public void user_navigate_to_new_customer_group_page() throws InterruptedException {
		businessTaxGrouphomepageActions.clickonNewBTGbutton();
		Thread.sleep(3000);
	}
	@And("user enters {string}, {string}, {string}  all the details Customer group")
	public void user_enters_all_the_details_Customer_group(String cgname, String cgaltname, String cgextref) throws InterruptedException {
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(cgname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(cgaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(cgextref);
		Thread.sleep(3000);
	}

	@Then("user verify the view functionality in Customer group page")
	public void user_verify_the_view_functionality_in_customer_group_page() throws InterruptedException {
		customerGroupActions.clickonViewicon();
		Thread.sleep(3000);
		customerGroupActions.clickonEscapeicon();
		Thread.sleep(3000);
	}

	@Then("user verify to edit the {string}, {string}, {string} Customer group page")
	public void user_verify_to_edit_the_customer_group_page(String cgname1, String cgaltname1, String cgextref1) throws InterruptedException {
		Thread.sleep(3000);
		customerGroupActions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(cgname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(cgaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(cgextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@When("user verify the Delete icon functionality in Customer group page")
	public void user_verify_the_delete_icon_functionality_in_customer_group_page() throws InterruptedException {
		customerGroupActions.clickondeleteiconincustomergroup();
		Thread.sleep(3000);
	}

	@Then("user delete the record in customer group")
	public void user_delete_the_record_in_customer_group() throws InterruptedException {
		customerGroupActions.clickondeletebuttonincustomergroup();
		  Thread.sleep(3000);
	}
}
