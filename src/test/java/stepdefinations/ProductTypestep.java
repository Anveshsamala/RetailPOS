package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessTaxGrouphomepageActions;
import pages.actions.CustomerListpageActions;
import pages.actions.ProductTypeactions;

public class ProductTypestep {

	CustomerListpageActions customerListpageActions=new CustomerListpageActions();
	BusinessTaxGrouphomepageActions businessTaxGrouphomepageActions=new BusinessTaxGrouphomepageActions();
	ProductTypeactions productTypeactions=new ProductTypeactions(); 
	
	@When("user navigate to Product Type page")
	public void user_navigate_to_product_type_page() throws InterruptedException {
		Thread.sleep(3000);
		customerListpageActions.clickonProctsmasterlink();
		Thread.sleep(3000);
		customerListpageActions.clickonProductTypelink();
		Thread.sleep(3000);
	}

	@And("user navigate to New Product Type page")
	public void user_navigate_to_new_product_type_page() throws InterruptedException {
		Thread.sleep(3000);
	    businessTaxGrouphomepageActions.clickonNewBTGbutton();
	    Thread.sleep(3000);
	}

	@And("user enters {string}, {string}, {string}, {string}  all the details Product Type")
	public void user_enters_all_the_details_product_type(String ptcode, String ptname, String ptaltname, String ptextref) throws InterruptedException {
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterCodefield(ptcode);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterNamefield(ptname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterAltnamefield(ptaltname);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.enterExtReffield(ptextref);
		Thread.sleep(3000);
		
	}

	@Then("user verify the view functionality in Product Type page")
	public void user_verify_the_view_functionality_in_product_type_page() throws InterruptedException {
		Thread.sleep(3000);
		productTypeactions.clickonViewicon();
		Thread.sleep(3000);
		productTypeactions.clickonEscapeicon();
		Thread.sleep(3000);
		
	}

	@Then("user verify to edit the {string}, {string}, {string}, {string} Product Type page")
	public void user_verify_to_edit_the_product_type_page(String ptcode1, String ptname1, String ptaltname1, String ptextref1) throws InterruptedException {
		Thread.sleep(3000);
		productTypeactions.clickonEditicon();
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateCode(ptcode1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateName(ptname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateAltname(ptaltname1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.updateExtref(ptextref1);
		Thread.sleep(3000);
		businessTaxGrouphomepageActions.clcickonsavebuttoninupdatepage();
		Thread.sleep(3000);
	}

	@And("user verify the Delete icon functionality in Product Type page")
	public void user_verify_the_delete_icon_functionality_in_product_type_page() throws InterruptedException {
		Thread.sleep(3000);
	    productTypeactions.clickondeleteiconinproducttype();
	    Thread.sleep(3000);
	}

	@Then("user delete the record in Product Type")
	public void user_delete_the_record_in_product_type() throws InterruptedException {
		Thread.sleep(3000);
		productTypeactions.clickondeletebuttoninproducttype();
		Thread.sleep(3000);
	}
	
}
